<%@ include file = "/view/model-header.jsp" %>

<form  action ="SignUpServlet" id="popup_login_form" name="popup_login_form" method="post" autocomplete="off">
            <h2>欢迎来到17点, 请登录</h2>
            <fieldset>
                <div class="field">
                    <input type="text" name="username" class="input-text" placeholder="手机号">
                </div>
                <div class="field">
                    <input class="login_pwd" type="password" name="password" placeholder="密码">
                    <span class="tips">
                </div>
                <div class="field">
                    <input class="login_pwd" type="password" name="password_retype" placeholder="请再输入一次密码">
                    <span class="tips">
                </div>
                <div class="field">
                    <input class="btn btn-dongxi" type="submit" value="注册">
                </div>
            </fieldset>
        </form>

<%@ include file = "/view/model-footer.jsp"%>