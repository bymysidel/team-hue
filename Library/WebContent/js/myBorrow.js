/**
 * 
 */
function $(id){
	return document.getElementById(id);
}
function loadData(){
	var currentPage = getCurrentPage();
	var borrowData = ajaxRequest('GET','myBorrowList','currentPage='+currentPage+'&pageSize=10',false);
	console.info(borrowData);
	var borrow = JSON.parse(borrowData);
	for(var i = 1;i<=borrow.length;i++){
		$("bookName"+i).innerHTML=""+borrow[i-1].bookName+"";
		$("author"+i).innerHTML=""+borrow[i-1].author+"";
		$("press"+i).innerHTML=""+borrow[i-1].press+"";
		$("category"+i).innerHTML=""+borrow[i-1].category+"";
		$("bookId"+i).innerHTML=""+borrow[i-1].bookId+"";
		$("borrowedTime"+i).innerHTML=""+borrow[i-1].borrowTime+"";
		$("returnDeadline"+i).innerHTML=""+borrow[i-1].returnDeadline+"";
		if(borrow[i-1].returnTime==null){
			$("panel"+i).classList.add("inBorrowing");
			$("status"+i).innerHTML="<font color='red'>在借中</font>";
			
		}else{
			$("panel"+i).classList.add("hasReturned");
			$("status"+i).innerHTML="已归还<br>&nbsp;" +
					"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +
					"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;( "+borrow[i-1].returnTime+"&nbsp;)";

		}
		
		
	}
	
}


function cancelTx(){
	$("bg-cover").classList.remove("showMe");
	$("tx-panel").classList.remove("showMe");
	
	
}

function showTxPanel(){
	$("bg-cover").classList.add("showMe");
	$("tx-panel").classList.add("showMe");
	
	
}




