<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/jsp/common/jspHead.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <%@include file="/WEB-INF/jsp/common/bootstrapHead.jsp" %>
    <title>登录系统</title>
    <link rel="stylesheet" href="${ctx}/common/css/login.css"/>
</head>
<body>
<div class="container">

    <form class="form-signin" action="${ctx}/login" method="post">
        <h2 class="form-signin-heading">欢迎登录系统</h2>
        <label for="inputEmail" class="sr-only">邮件</label>
        <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus value="xxx@xxx.com">
        <br/>
        <label for="inputPassword" class="sr-only">密码</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> 记住我
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
    </form>

</div>
</body>
</html>
