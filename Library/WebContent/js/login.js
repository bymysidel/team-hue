/**
 * 
 */
/* 检查输入的账号类型，账号必须为数字串*/
var userIdFlag = false;//账号是否符合要求的标记
var passwordFlag = false;//密码是否符合要求的标记
function checkUserId(){
	
	var userId = document.getElementById("input_userId").value;
	var regExp = /^\d+$/;
	if(userId==null||userId==""){
		document.getElementById("id_msg").innerHTML="<font color='red'>还没输入账号呢<font/>"
		userIdFlag = false;
	}else if(!regExp.test(userId)){
		document.getElementById("id_msg").innerHTML="<font color='red'>账号格式错误<font/>"
		userIdFlag = false;
	}else{
		document.getElementById("id_msg").innerHTML="";
		document.getElementById("btn_signin").disabled=false;//恢复按钮可用性
		userIdFlag = true;
	}
}
/*检查输入的密码，若没有填写密码则令提交按钮失效*/
function checkPwd(){

var password = document.getElementById("input_password").value;
	if(password==null||password==""){
		document.getElementById("pwd_msg").innerHTML="<font color='red'>还没输入密码呢</font>"
		passwordFlag = false;
	}else{
		document.getElementById("pwd_msg").innerHTML="";
		document.getElementById("btn_signin").disabled=false;//恢复按钮可用性
		passwordFlag = true;
	}
}
function submitForm(){
	
	if(userIdFlag==true&&passwordFlag==true){
		document.getElementById("form_signin").submit();
	}else{
		document.getElementById("btn_signin").disabled=true;//使按钮失效
	}
	
	
	
}