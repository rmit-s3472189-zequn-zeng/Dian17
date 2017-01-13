<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/static/js/answer.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/static/js/jquery-1.10.2.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="field">
		输入问题: <input type="text" id="userquestion" class="input-text">
	</div>
	<button type="submit" onclick="submitquestion()">提交</button>



	<h1 id="detail"></h1>
</body>
</html>