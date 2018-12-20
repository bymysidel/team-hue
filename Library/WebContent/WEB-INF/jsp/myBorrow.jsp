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
<link rel="stylesheet" type="text/css" href="css/template.css" />
<link rel="stylesheet" type="text/css" href="css/myBorrow.css" />

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
			<a href="#">我的借阅</a>
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
	<div class="page-nav">
		<nav aria-label="Page navigation">
		<ul class="pager">
			<li class="previous" id="nav_pages_prev"></li>
			<li id="nav_pages_num"></li>
			<li id="nav_pages_dots"></li>
			<li id="nav_pages_next" class="next"><a href="#"><i
					class="far fa-hand-point-right fa-2x"></i></a></li>
		</ul>

		</nav>


	</div>




	<!--    <div class="page-nav">
            <a class="prev-page"><i class="far fa-hand-point-left fa-2x" ></i></a>
            <div class="nav-items">
            123456
        </div>
            <a class="next-page"><i class="far fa-hand-point-right fa-2x" ></i></a>
        </div> -->

	<div class="show-bar">
		<div class="panel-col">
			<div class="panel-row" id="panel1">
				<div class="cover">
					<img id="cover-img1" alt="暂无封面" src="img/doraemon.png"></img>
				</div>
				<div class="book-info">
					<span id="bookName1"></span><br> <span>作者：</span><span
						id="author1"></span><br> <span>出版信息：</span><span
						id="press1"></span><br> <span>所属分类：</span><span
						id="category1"></span><br> <span>馆藏编号：</span><span
						id="bookId1"></span><br> <span>借阅时间：</span><span
						id="borrowedTime1"></span><br> <span>归还期限：</span><span
						id="returnDeadline1"></span><br>
					<br> <span>借阅状态：</span><span id="status1"></span>
				</div>
				<div class="operate">
					<a href="#" id="btn-return1"><button onclick="showTxPanel()"    class="return-btn">还&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;书</button></a><br>
					<a href="#" id="btn-renew1"><button onclick="showTxPanel()" class="renew-btn">续借申请</button></a><br> 
					<a href="#" id="btn-moreone1"><button onclick="showTxPanel()" class="moreonce-btn">再借一次</button></a>
				</div>


			</div>
			<div class="panel-row" id="panel2">

				<div class="cover">
					<img id="cover-img2" alt="暂无封面" src="img/doraemon.png"></img>
				</div>
				<div class="book-info">
					<span id="bookName2"></span><br> <span>作者：</span><span
						id="author2"></span><br> <span>出版信息：</span><span
						id="press2"></span><br> <span>所属分类：</span><span
						id="category2"></span><br> <span>馆藏编号：</span><span
						id="bookId2"></span><br> <span>借阅时间：</span><span
						id="borrowedTime2"></span><br> <span>归还期限：</span><span
						id="returnDeadline2"></span><br>
					<br> <span>借阅状态：</span><span id="status2"></span>
				</div>
				<div class="operate">
                    <a href="#" id="btn-return2"><button class="return-btn">还&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;书</button></a><br>
                    <a href="#" id="btn-renew2"><button class="renew-btn">续借申请</button></a><br> 
                    <a href="#" id="btn-moreone2"><button class="moreonce-btn">再借一次</button></a>
                </div>
			</div>

		</div>
		<div class="panel-col">
			<div class="panel-row" id="panel3">

				<div class="cover">
					<img id="cover-img3" alt="暂无封面" src="img/doraemon.png"></img>
				</div>
				<div class="book-info">
					<span id="bookName3"></span><br> <span>作者：</span><span
						id="author3"></span><br> <span>出版信息：</span><span
						id="press3"></span><br> <span>所属分类：</span><span
						id="category3"></span><br> <span>馆藏编号：</span><span
						id="bookId3"></span><br> <span>借阅时间：</span><span
						id="borrowedTime3"></span><br> <span>归还期限：</span><span
						id="returnDeadline3"></span><br>
					<br> <span>借阅状态：</span><span id="status3"></span>
				</div>
				<div class="operate">
                    <a href="#" id="btn-return3"><button class="return-btn">还&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;书</button></a><br>
                    <a href="#" id="btn-renew3"><button class="renew-btn">续借申请</button></a><br> 
                    <a href="#" id="btn-moreone3"><button class="moreonce-btn">再借一次</button></a>
                </div>
			</div>
			<div class="panel-row" id="panel4">

				<div class="cover">
					<img id="cover-img4" alt="暂无封面" src="img/doraemon.png"></img>
				</div>
				<div class="book-info">
					<span id="bookName4"></span><br> <span>作者：</span><span
						id="author4"></span><br> <span>出版信息：</span><span
						id="press4"></span><br> <span>所属分类：</span><span
						id="category4"></span><br> <span>馆藏编号：</span><span
						id="bookId4"></span><br> <span>借阅时间：</span><span
						id="borrowedTime4"></span><br> <span>归还期限：</span><span
						id="returnDeadline4"></span><br>
					<br> <span>借阅状态：</span><span id="status4"></span>
				</div>
				<div class="operate">
                    <a href="#" id="btn-return4"><button class="return-btn">还&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;书</button></a><br>
                    <a href="#" id="btn-renew4"><button class="renew-btn">续借申请</button></a><br> 
                    <a href="#" id="btn-moreone4"><button class="moreonce-btn">再借一次</button></a>
                </div>
			</div>
		</div>
		<div class="panel-col">
			<div class="panel-row" id="panel5">

				<div class="cover">
					<img id="cover-img5" alt="暂无封面" src="img/doraemon.png"></img>
				</div>
				<div class="book-info">
					<span id="bookName5"></span><br> <span>作者：</span><span
						id="author5"></span><br> <span>出版信息：</span><span
						id="press5"></span><br> <span>所属分类：</span><span
						id="category5"></span><br> <span>馆藏编号：</span><span
						id="bookId5"></span><br> <span>借阅时间：</span><span
						id="borrowedTime5"></span><br> <span>归还期限：</span><span
						id="returnDeadline5"></span><br>
					<br> <span>借阅状态：</span><span id="status5"></span>
				</div>
				<div class="operate">
                    <a href="#" id="btn-return5"><button class="return-btn">还&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;书</button></a><br>
                    <a href="#" id="btn-renew5"><button class="renew-btn">续借申请</button></a><br> 
                    <a href="#" id="btn-moreone5"><button class="moreonce-btn">再借一次</button></a>
                </div>
			</div>
			<div class="panel-row" id="panel6">

				<div class="cover">
					<img id="cover-img6" alt="暂无封面" src="img/doraemon.png"></img>
				</div>
				<div class="book-info">
					<span id="bookName6"></span><br> <span>作者：</span><span
						id="author6"></span><br> <span>出版信息：</span><span
						id="press6"></span><br> <span>所属分类：</span><span
						id="category6"></span><br> <span>馆藏编号：</span><span
						id="bookId6"></span><br> <span>借阅时间：</span><span
						id="borrowedTime6"></span><br> <span>归还期限：</span><span
						id="returnDeadline6"></span><br>
					<br> <span>借阅状态：</span><span id="status6"></span>
				</div>
				<div class="operate">
                    <a href="#" id="btn-return6"><button class="return-btn">还&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;书</button></a><br>
                    <a href="#" id="btn-renew6"><button class="renew-btn">续借申请</button></a><br> 
                    <a href="#" id="btn-moreone6"><button class="moreonce-btn">再借一次</button></a>
                </div>
			</div>
		</div>

		<div class="panel-col">
			<div class="panel-row" id="panel7">

				<div class="cover">
					<img id="cover-img7" alt="暂无封面" src="img/doraemon.png"></img>
				</div>
				<div class="book-info">
					<span id="bookName7"></span><br> <span>作者：</span><span
						id="author7"></span><br> <span>出版信息：</span><span
						id="press7"></span><br> <span>所属分类：</span><span
						id="category7"></span><br> <span>馆藏编号：</span><span
						id="bookId7"></span><br> <span>借阅时间：</span><span
						id="borrowedTime7"></span><br> <span>归还期限：</span><span
						id="returnDeadline7"></span><br>
					<br> <span>借阅状态：</span><span id="status7"></span>
				</div>
				<div class="operate">
                    <a href="#" id="btn-return7"><button class="return-btn">还&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;书</button></a><br>
                    <a href="#" id="btn-renew7"><button class="renew-btn">续借申请</button></a><br> 
                    <a href="#" id="btn-moreone7"><button class="moreonce-btn">再借一次</button></a>
                </div>
			</div>
			<div class="panel-row" id="panel8">

				<div class="cover">
					<img id="cover-img8" alt="暂无封面" src="img/doraemon.png"></img>
				</div>
				<div class="book-info">
					<span id="bookName8"></span><br> <span>作者：</span><span
						id="author8"></span><br> <span>出版信息：</span><span
						id="press8"></span><br> <span>所属分类：</span><span
						id="category8"></span><br> <span>馆藏编号：</span><span
						id="bookId8"></span><br> <span>借阅时间：</span><span
						id="borrowedTime8"></span><br> <span>归还期限：</span><span
						id="returnDeadline8"></span><br>
					<br> <span>借阅状态：</span><span id="status8"></span>
				</div>
				<div class="operate">
                    <a href="#" id="btn-return8"><button class="return-btn">还&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;书</button></a><br>
                    <a href="#" id="btn-renew8"><button class="renew-btn">续借申请</button></a><br> 
                    <a href="#" id="btn-moreone8"><button class="moreonce-btn">再借一次</button></a>
                </div>
			</div>
		</div>

		<div class="panel-col">
			<div class="panel-row" id="panel9">

				<div class="cover">
					<img id="cover-img9" alt="暂无封面" src="img/doraemon.png"></img>
				</div>
				<div class="book-info">
					<span id="bookName9"></span><br> <span>作者：</span><span
						id="author9"></span><br> <span>出版信息：</span><span
						id="press9"></span><br> <span>所属分类：</span><span
						id="category9"></span><br> <span>馆藏编号：</span><span
						id="bookId9"></span><br> <span>借阅时间：</span><span
						id="borrowedTime9"></span><br> <span>归还期限：</span><span
						id="returnDeadline9"></span><br>
					<br> <span>借阅状态：</span><span id="status9"></span>
				</div>
				<div class="operate">
                    <a href="#" id="btn-return9"><button class="return-btn">还&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;书</button></a><br>
                    <a href="#" id="btn-renew9"><button class="renew-btn">续借申请</button></a><br> 
                    <a href="#" id="btn-moreone9"><button class="moreonce-btn">再借一次</button></a>
                </div>
			</div>
			<div class="panel-row" id="panel10">

				<div class="cover">
					<img id="cover-img10" alt="暂无封面" src="img/doraemon.png"></img>
				</div>
				<div class="book-info">
					<span id="bookName10"></span><br> <span>作者：</span><span
						id="author10"></span><br> <span>出版信息：</span><span
						id="press10"></span><br> <span>所属分类：</span><span
						id="category10"></span><br> <span>馆藏编号：</span><span
						id="bookId10"></span><br> <span>借阅时间：</span><span
						id="borrowedTime10"></span><br> <span>归还期限：</span><span
						id="returnDeadline10"></span><br>
					<br> <span>借阅状态：</span><span id="status10"></span>
				</div>
				<div class="operate">
                    <a href="#" id="btn-return10"><button class="return-btn">还&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;书</button></a><br>
                    <a href="#" id="btn-renew10"><button class="renew-btn">续借申请</button></a><br> 
                    <a href="#" id="btn-moreone10"><button class="moreonce-btn">再借一次</button></a>
                </div>
			</div>
		</div>
	</div>





	</main>
    
    <div id="bg-cover" class="bg-cover">
    
    
    </div>
    <div class="transaction-panel" id="tx-panel">
       
            <button class="tx-cancel-btn" onclick="cancelTx()"><i class="fas fa-times"></i></button>
       
        <form method="POST" class="tx-form">
            <label for="input1">续借理由</label>
            <input type="text" id="input1"/><br>
            <label for="input2">续借时长</label>
            <input type="text" id="input2"/>
        </form>
    </div>

</body>
<script type="text/javascript" src="js/pagenav.js"></script>
<script type="text/javascript" src="js/myBorrow.js"></script>
<script type="text/javascript">
   showPageNav("myBorrowCounts","myBorrow");
   loadData();
</script>
</html>