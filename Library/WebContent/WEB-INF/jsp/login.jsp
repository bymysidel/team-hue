<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <title>Sign in Page</title>
     <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/> 
    <style type="text/css">
        .form-signin{
            margin-top:10em;
        }
        body{
            background-color: skyblue;
        }
        .footer{
           margin-top:10em;
            border-top: 1px solid #FFF;
            text-align: center;
        }
       
    
    </style>
</head>
<body>
    <div class="container">
        <div class="page-header">
            <h1>Library <small>Log in Page</small></h1>
        </div>
    
    </div>
    <div class="container form-signin">     
        <form action="login" id="form_signin" method="POST" class="form-horizontal">
        <div class="form-group">
            <div class="row">
                <label for="input_userId" class="col-sm-1 col-sm-offset-3 control-label">账号</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="input_userId" 
                name="userId" placeholder="请输入账号" onkeyup="checkUserId()" />    
                 </div>
                <span id="id_msg" class="help-block"></span>   
            </div>
        </div>
        
         <div class="form-group">
            <div class="row">
                <label for="input_password" class="col-sm-1 col-sm-offset-3 control-label">密码</label>
                <div class="col-sm-4">
                    <input type="password" class="form-control" id="input_password" name="password" 
                 onkeyup="checkPwd()"    placeholder="请输入密码"/>
                </div>
                <span id="pwd_msg" class="help-block"></span>        
            </div>
        </div>
        
         <div class="form-group">
            <div class="row">
               <div class="col-sm-2 col-sm-offset-4">
               <input type="button" id="btn_signin" class="btn btn-default" onclick="submitForm()"  value="Sign in"/>
                </div>
                <span class="help-block"><font color="red">${msg}</font></span>
            </div> 
        </div>   
        </form>
    </div>
    
    <div class="container footer">
           <span>&copy; 2018  hue-three.</span>
    
    </div>
   
    
</body>
<script type="text/javascript" src="js/login.js"></script>
</html>