/**
 * 
 */

function ajaxRequest(a_method,a_uri,sendContent,isAsyn){
	var xmlHttp;
	var data;
	console.info(a_uri);
	if(window.XMLHttpRequest){
		xmlHttp = new XMLHttpRequest();
	}else{
        xmlHttp = new ActiveXObject("Microsoft.XMLHttp")
    }
	
    xmlHttp.onreadystatechange=loaddata;
    if(a_method=="GET"){
    	xmlHttp.open(a_method,a_uri+"?"+sendContent,isAsyn);
    	xmlHttp.send();
    }else{
    	xmlHttp.open(a_method,a_uri,isAsyn);
    	 ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    	xmlHttp.send(sendContent);
    }
    
    function loaddata(){
    	if(xmlHttp.readyState==4&&xmlHttp.status==200){
    		data = xmlHttp.responseText;
    	}
    }
    return data;
    
	
}

function getCurrentPage(){
	var currentPage;
	var s = window.location.search.substring(1);
	if(s == null|| s==""){
		currentPage = 1;
	}else {
		currentPage = parseInt(s.substring(12,20));//截取url中的currentPage参数并转换为数字
	}
	console.info(currentPage);
	return currentPage;
}


function showPageNav(controller,view){
	//获取当前页面id
	var currentPage = getCurrentPage();
	
	var m_counts;
	var sendContent="currentPage="+currentPage+"&pageSize=10";
	console.info(controller);
	var data_c = ajaxRequest("GET",controller,sendContent,false);
	console.info(data_c);
	m_counts = JSON.parse(data_c).counts;//向pushdata发送请求，获取member表总记录数
	console.info(m_counts);
	var pages = Math.ceil(m_counts/10);//页数
	var nav_pages_next = document.getElementById("nav_pages_next");
	var nav_pages_prev = document.getElementById("nav_pages_prev");
	
	//添加向后翻页标签
	nav_pages_prev.innerHTML="<a id='a_prev' href='"+view+"?currentPage="
		+ (currentPage-1) + "'><i class='far fa-hand-point-left fa-2x'></i></a>";
	//添加向前翻页标签
	nav_pages_next.innerHTML="<a id='a_next' href='"+view+"?currentPage="
		+ (currentPage+1) + "'><i class='far fa-hand-point-right fa-2x' ></i></a>";
	if(currentPage>=pages){ //若当前页为最后一页设置向后翻页为本业面跳转
		document.getElementById("a_next").href="#";
	}
	if(currentPage<=1){ //若当前页为第一页设置向前翻页为本页面跳转
		document.getElementById("a_prev").href="#";
	}
	var pageGroup = Math.ceil(currentPage/10);//当前页组
	var pageMaxIndex = pageGroup*10>pages?pages:pageGroup*10;//当前页组导航条最大页面号
	if(pages<=10){ //若总页数小于10则页面导航条只显示有效页数
		for(var p = pages ;p>=1;p--){
	    	document.getElementById("nav_pages_num").insertAdjacentHTML('afterEnd',"<li><a id='nav_pages_a"+p+"'href=" +
	    			"'"+view+"?currentPage="+p+"'>"+p+"</a></li>");
	    }	
	}else{ //若总页数大于10 则 导航条又分为若干个页组
		
		console.info(pageMaxIndex);
		for(var p = pageMaxIndex ;p>=(pageGroup==1?1:pageGroup*10-10);p--){ //当前页组数为1时去掉0页标签
	    	document.getElementById("nav_pages_num").insertAdjacentHTML('afterEnd',"<li><a id='nav_pages_a"+p+"'href=" +
	    			"'"+view+"?currentPage="+p+"'>"+p+"</a></li>");
	    	if(pageGroup==Math.ceil(pages/10)){ //若当前页组为最大页组则去掉下一页组标签
	    		document.getElementById("nav_pages_dots").innerHTML = ""; 
	    	}else{ //若当前页组不为最后一页组，则添加下一页组标签，点击后当前页数调转到下一页组的第一页
	    		document.getElementById("nav_pages_dots").innerHTML = "<a href=" +
	    		"'"+view+"?currentPage="+(pageGroup*10+1)+"'>...</a>"; 
	    	}
	    	
	    }
	}
	var li_id = "nav_pages_a"+currentPage;
	console.info(li_id);
	document.getElementById(li_id).classList.add("highlight");
	
    
	
}