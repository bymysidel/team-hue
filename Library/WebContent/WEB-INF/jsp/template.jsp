<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,com.hue.ssm.pojo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
    content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
<title>myBorrow</title>
<link rel="stylesheet" type="text/css" href="css/all.css" /><!--图标字体  -->
<link rel="stylesheet" type="text/css" href="css/template.css" /><!-- 导航栏模板样式 -->

<style type="text/css">
</style>

</head>
<body>
    <header>
    <div class="brand-log">
        <a href="#"><span class="brand-text">Library</span></a>
    </div>
    <div class="member-status">
        <div class="log">
            <span><i class="far fa-grin-alt fa-3x"></i></span>
        </div>
        <div class="status-id">
            <span>${sessionScope.user_session.userId}</span>
        </div>
        <div class="sex-log">
            <i class="fas fa-mars"></i>
        </div>
        <div class="advice-log">
            <i class="far fa-bell"></i>
        </div>
        <div class="logout-log">
            <a href="logout" title="注销 "><i class="fas fa-sign-out-alt"></i></a>
        </div>
    </div>
    <div class="options">
        <h3>
            <a href="#">馆藏大厅</a>
        </h3>
        <h3>
            <a href="myBorrow">我的借阅</a>
        </h3>
        <h3>
            <a href="#">我的收藏</a>
        </h3>
        <h3>
            <a href="#">馆藏请求</a>
        </h3>
        <h3>
            <a href="#">我的资料</a>
        </h3>
    </div>
    </header>
    <main id="content">
    <div class="headline">
        <h3>我的借阅</h3>
    </div>
 







    </main>
    
 

</body>

</html>