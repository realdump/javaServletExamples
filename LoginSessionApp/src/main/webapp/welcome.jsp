<html>
<head><title>Welcome</title></head>
<body>
<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    String username = (String) session.getAttribute("username");
    if (username == null) {
        response.sendRedirect("login.jsp");
    }
%>
<h2>Welcome, <%= username %>!</h2>
<a href="logout">Logout</a>
</body>
</html>
