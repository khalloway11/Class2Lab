<%-- 
    Document   : PageGenerator2
    Created on : Sep 1, 2015, 3:56:39 PM
    Author     : Keiji
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <%
                for(int i = 1; i <= 3; i++){
                    out.println("<tr>");
                    for(int j = 1; j <= 3; j++){
                        out.println("<td>" + i*j + "</td>");
                    }
                    out.println("</tr>");
                }
              %>  
        </table>
    </body>
</html>
