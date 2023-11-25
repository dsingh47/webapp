<%-- 
    Document   : error_page
    Created on : 21-Oct-2023, 8:40:33 am
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>sorry ! something wrong...</title>
         <!<!-- css -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
      .primary-background{
     clip-path: polygon(30% 0, 70% 0, 100% 0, 100% 87%, 70% 100%, 30% 100%, 0 89%, 0 0);
        }
    </style>
    </head>
    <body>
        <div class="container text-center">
            <img src="img/error.png" class="img-fluid">
            <h3 class="display-3">Sorry ! Something wrong....</h3>
            <%= exception %>
            <a href="Index.jsp" class="btn primary-background btn-lg text-white mt-3">Home</a>
            
        </div>
    </body>
</html>
