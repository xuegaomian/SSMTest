<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/19
  Time: 9:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>upload</title>
</head>
<body>
<form action="/user/upload" method="post" enctype="multipart/form-data">
    名字：<input type="text" name="id"/><br/>
    文件：<input type="file" name="file"/><br/>
    <input type="submit" value="提交"/>

    <a href="/user/download">点击下载</a>
</form>
</body>
</html>
