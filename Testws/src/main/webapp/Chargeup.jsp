<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.jx.*"%>
<%

    jx j = new jx();
    List<List<Object>> list = null;
    List<Object> mlist = null;
    List<List<Object>> hlist = null;
    hlist=j.Test(list, mlist);

%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>

<body>
    <table border="1" cellspacing="2" cellpadding="1" align="center"
        width="80%">
        <%
            for (int i = 0; i < j.count; i++) {
        %>
        <tr>
            <%
                for (int k = 0; k < j.row1; k++) {
            %>
            <td><%=hlist.get(i).get(k)%></td>
            <%
                }
            %>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>