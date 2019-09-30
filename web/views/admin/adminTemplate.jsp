<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <!-- Semantic UI CND -->
  	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/1.11.8/semantic.min.css"/>
 	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
 	<script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/1.11.8/semantic.min.js"></script>
  <!-- CUSTOM CSS -->
	<link rel = "stylesheet" type="text/css" href="/sori/resources/css/Admin.css">
</head>
<body>


<!-- 상단 바 시작! -->
	<header>
		<div class="topbar">
			<span class="topname"><a href="/sori/index.jsp" target="_blank"><i class="home icon"></i></a>SORIJIEUM <span style="color:#4ecdc4">ADMIN</span></span>
			<div id="adminname"><a href="">최민영</a> 님!&nbsp;&nbsp;&nbsp;<button class="ui mini teal button">Logout</button></div>
		</div>
	</header>
<!-- 상단 바 끝! -->


<!-- 사이드 메뉴 바 시작!-->
<aside>
<div class="menubar">
<nav>
	<ul class="vertical-menu">
		<li style="font-weight: 600; font-size:12pt"><a href="/sori/views/admin/adminIndexView.jsp"><i class="home icon"></i>HOME</a></li>
		<li style="font-weight: 600; font-size:12pt"><a href="javascript:;"><i class="book icon"></i>도서</a></li>
			<ul>
				<li><a href="/sori/views/admin/adminBookList.jsp">　도서목록</a></li>
				<li><a href="">　도서추가</a></li>
				<li><a href="">　도서신청내역</a></li>
			</ul>
		<li style="font-weight: 600; font-size:12pt"><a href=""><i class="user icon"></i>사용자</a></li>
			<ul>
				<li><a href="/sori/views/admin/adminUserListView.jsp">　회원정보조회</a></li>
				<li><a href="">　회원탈퇴관리</a></li>
				<li><a href="">　권한관리</a></li>
			</ul>
		<li style="font-weight: 600; font-size:12pt"><a href=""><i class="clipboard list icon"></i>게시판</a></li>
			<ul>
				<li><a href="">　게시물관리</a></li>
			</ul>
	</ul>
</nav>
</div>
</aside>
<!-- 사이드 메뉴 끝! -->




 <footer class="site-footer">
        <p>
          &copy; Copyrights <strong>sorijieum</strong>. All Rights Reserved<br>
          Created with sorijieum by @minyoung</a>
        </p>
        
        <a href="index.html#" class="go-top">
          <i class="fa fa-angle-up"></i>
          </a>
    </footer>
</body>
</html>