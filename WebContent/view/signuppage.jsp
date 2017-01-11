<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>欢迎来到17点, 请登录</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/static/css/login.css">
</head>
<body>
	<div id="content">
        <form  action ="SignUpServlet" id="popup_login_form" name="popup_login_form" method="post" autocomplete="off">
            <h2>欢迎来到17点, 请登录</h2>
            <fieldset>
                <div class="field">
                    <input type="text" name="newUsername" class="input-text" placeholder="手机号">
                </div>
                <div class="field">
                    <input class="login_pwd" type="password" name="password" placeholder="密码">
                    <span class="tips">
                </div>
                <div class="field">
                    <input class="login_pwd" type="password" name="passwordRetype" placeholder="请再输一次密码">
                    <span class="tips">
                </div>
                <div class="field">
                    <input class="btn btn-dongxi" type="submit" value="注册">
                </div>
            </fieldset>
        </form>
    </div>
</body>
</html>