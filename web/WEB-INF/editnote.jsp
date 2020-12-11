<%-- 
    Document   : editnote
    Created on : Dec 1, 2020, 10:22:20 PM
    Author     : 783856
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <h1>Simple Note Keeper</h1>
          <h2>Edit Note</h2>
      
          
          <table>
              <tr>
                  <td><<label>Title:</label></td> 
                   <td><input type="text" value="${show}"></td> 
              </tr>
          </table>
        
           <br>
           <br>
                <table>
              <tr>
                  <td><<label>Contents:</label></td> 
                  <td><textarea rows="4" cols="50" value="${area}"></textarea></td> 
              </tr>
          </table>
           
            <a href="./arithmetic">Edit</a>
    </body>
</html>
