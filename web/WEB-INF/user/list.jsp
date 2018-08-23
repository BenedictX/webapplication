<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/08/23
  Time: 09:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
     <table>
       <c:forEach items="${users}" var="user">
       <tr>
         <td>${user.uid}</td>
         <td>${user.username}</td>
         <td>${user.password}</td>
         <td>${user.age}</td>
       </tr>
       </c:forEach>
     </table>
  </body>
</html>
