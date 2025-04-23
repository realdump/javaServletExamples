<%@ page language="java" session="true" %>
<%
String username = (String) session.getAttribute("username");
if (username == null) {
    response.sendRedirect("login.jsp");
    return;
}
%>
<html>
<head><title>Welcome</title></head>
<body>
    <h2>Welcome, <%= username %>!</h2>
    <a href="logout">Logout</a>
</body>
</html>