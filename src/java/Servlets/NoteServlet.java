/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Models.Note;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 783856
 */
public class NoteServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          
      String path = getServletContext().getRealPath("/WEB-INF/note.txt");
 
      BufferedReader br = new BufferedReader(new FileReader(new File(path)));
  
      String T1 = br.readLine();
      String C1 = br.readLine();
      Note N1 = new Note();
      N1.setTitle(T1);
      N1.setContent(C1);
      
      try{
       if( request.getParameter("edit") == null)
       {
       br.close();
       request.setAttribute("note", N1);
       request.getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
       return;
       } 
          
      if(request.getParameter("edit") != null) {
            request.getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
            return;
        }
      }
      catch(Exception e)
      {
        e.printStackTrace();
      }
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
      String newTitle = request.getParameter("show");
      String newContents = request.getParameter("show");
      
      String path = getServletContext().getRealPath("/WEB-INF/note.txt");
      PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false))); 
    
      pw.write(newTitle+"/n");
      pw.write(newContents);
      pw.close();
       
      
      BufferedReader br = new BufferedReader(new FileReader(new File(path)));
  
      String T1 = br.readLine();
      String C1 = br.readLine();
      Note N1 = new Note();
      N1.setTitle(T1);
      N1.setContent(C1);
      request.setAttribute("note", N1);
      request.getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }



}
