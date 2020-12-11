<%-- 
    Document   : viewnote
    Created on : Dec 1, 2020, 10:03:10 PM
    Author     : 783856
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
          <h2>View Note</h2>
          
          <h3>Title: ${note.title}</h3>
          
          <h3>Contents</h3>
           <h3>${note.content}</h3>
           
            
          
            <a href="Note?edit"> Edit</a>
 
    </body>
</html>
