<!DOCTYPE HTML>
<html>
<head>
    <title>Murach's Java Servlets and JSP</title>
</head>
<body>

<h1>Cookies</h1>

<p>All persistent cookies have been removed from this browser.</p>

<p><a href="<%= response.encodeURL("index.jsp")%>">
    View list of albums</a>.</p>

<p><a href="<%= response.encodeURL("view_cookies.jsp")%>">
    View all cookies</a>.</p>

</body>
</html>