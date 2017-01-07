<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>17点 , 是起点</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/static/css/public.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/static/css/main.css">
<link rel="SHORTCUT ICON"
	href="<%=request.getContextPath()%>/static/images/logo1.ico">
<script src="<%=request.getContextPath()%>/static/js/move.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/static/js/jquery-1.10.2.js"></script>
</head>
<body>
	<!-- 导航的部分 -->
	<div class="nav">
		<div class="container">
			<a href="index.html"><h1>
					<img src="<%=request.getContextPath()%>/static/images/logo123.png"
						width="36" height="36"><span>17点</span>
				</h1></a>
			<ul>
				<li><a href="" class="color-blue">首页</a></li>
				<li><a href="html/course.html">课程</a></li>
				<li><a href="html/course.html">小组</a></li>
				<li><a href="html/answer.html">问答</a></li>
				<li><a href="html/community.html">社区</a></li>
			</ul>
			<div class="nav-right">
				<%
					HttpSession session = request.getSession(true);
					String currentid = session.getId();
					String id = request.getSession().getId();
					out.print("currentid: "+ currentid);
					out.print("id: "+id );
					if (currentid.equals(id)) {
				%>
					<a href="<%=request.getContextPath()%>/view/userDetail.jsp"
					id="login"><%=request.getSession().getAttribute("username")%></a>
				
				<%
					}
					else {						
						%>
						<a href="<%=request.getContextPath()%>/view/loginpage.jsp"
					id="login">Login></a>
						<% 
					}
				%>
				<span>|</span> <a
					href="<%=request.getContextPath()%>/LogoutServlet"
					id="register">Logout</a>
			</div>
		</div>
	</div>