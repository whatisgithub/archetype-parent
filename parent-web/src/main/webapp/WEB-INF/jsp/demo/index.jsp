<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<c:set var="res" value="${pageContext.request.contextPath}"/>


<html>
<head>
    <title>Title</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>


<body>
<h1>hello</h1>
<form method="post" name="form" action="${ctx}/demo/dtrDemo">

    name: <input type="text" name="name" value="zhangsna"/><br/>
    age: <input type="text" name="age" value="22"/><br/>
    sex: <input type="text" name="sex" value="男"/><br/>
    date: <input type="text" name="date" value="20160810120000"/><br/>

    <br/>
    <br/>
    <br/>
    <input type="submit" value="submit" />

</form>
</body>
</html>
