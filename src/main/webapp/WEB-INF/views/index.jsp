<%-- 
    Document   : index
    Created on : 09.07.2016, 12:09:03
    Author     : eguseynov
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Bootstrap core CSS -->
        <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
        <link href="static/css/style.css" rel="stylesheet" type="text/css">
        <title>JSP Page</title>
    </head>
    <body>
        <header><jsp:include page="/WEB-INF/views/header.jsp"></jsp:include></header>
        <h1>Hello World!</h1>
        <!-- Bootstrap core JavaScript-->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
        <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    </body>
</html>
