<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/30
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    内嵌页
    <table>
        <c:forEach items="${list}" var="attr">
            <tr>
                <td>${attr.shxmMch}:</td>
                <c:forEach items="${attr.valueList}" var="val">
                    <td>${val.shxzh}${val.shxzhMch}</td>
                </c:forEach>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
