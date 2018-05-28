<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.bling.common.Const" %>
<%@ page import="com.bling.pojo.Staff" %>
<%
    Staff staff = (Staff) session.getAttribute(Const.CURRENT_USER);
    if (staff == null)
    {
        %>
  <jsp:forward page="/staff/login"></jsp:forward>
<%
    }
%>
<html>
<head>
    <title>Bling管理后台</title>
</head>
</html>