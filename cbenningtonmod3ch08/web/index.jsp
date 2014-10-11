<%@page import="util.CookieUtil"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>Murach's Java Servlets and JSP</title>
    </head>
    <body>

        <h1>List of albums</h1>
        <%
            Cookie[] cookies = request.getCookies();
        %>
        <% if (CookieUtil.getCookieValue(cookies, "firstNameCookie") != "") {
        %>

        <p>Welcome back, <%= CookieUtil.getCookieValue(cookies, "firstNameCookie")%>.
        </p>
        <%
            }
        %>
        <p>
            <a href="<%=response.encodeURL("checkUser?productCode=8601")%>">
                86 (the band) - True Life Songs and Pictures
            </a><br>

            <a href="<%=response.encodeURL("checkUser?productCode=pf01")%>">
                Paddlefoot - The first CD
            </a><br>

            <a href="<%= response.encodeURL("checkUser?productCode=pf02")%>">
                Paddlefoot - The second CD
            </a><br>

            <a href="<%= response.encodeURL("checkUser?productCode=jr01")%>">
                Joe Rut - Genuine Wood Grained Finish
            </a>
        </p>

    </body>
</html>