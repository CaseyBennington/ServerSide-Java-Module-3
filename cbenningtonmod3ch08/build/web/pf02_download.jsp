<!DOCTYPE HTML>

<%@ page import="business.Product"%>
<html>
<head>
    <title>Murach's Java Servlets and JSP</title>
</head>
<body>

<% 
    Product product = (Product) session.getAttribute("product"); 
    String productCode = product.getCode();
    String productDesc = product.getDescription();
%>

<h1>Downloads</h1>

<table cellpadding="5" border="1">
<tr><td colspan="2"><b><%=productDesc%></b></td></tr>
<tr><td width="200"><b>Song title</b></td>
    <td width="150"><b>Audio Format</b></td>
</tr>
<tr><td>Neon Lights</td>
    <td><a href="/cbenningtonmod3ch08/sound/<%= productCode%>/neon.mp3">MP3</a></td>
</tr>
<tr><td>Tank Hill</td>
    <td><a href="/cbenningtonmod3ch08/sound/<%= productCode%>/tank.mp3">MP3</a></td>
</tr>
</table>

<p><a href="<%= response.encodeURL("index.jsp")%>">
    View list of albums</a>.</p>

<p><a href="<%= response.encodeURL("view_cookies.jsp")%>">
    View all cookies</a>.</p>

</body>
</html>