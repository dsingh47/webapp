
package com.appp.servlets;

import com.appp.dao.UserDao;
import com.appp.entites.User;
import com.appp.helper.connectionProvider;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

 @MultipartConfig
public class ReigsterServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           
            
            // fetch all form data
            String check=request.getParameter("check");
            if(check==null)
            {
                out.println("box not checked");
            }else{
                String name =request.getParameter("user_name");
                String email =request.getParameter("user_email");
                String password =request.getParameter("user_password");
                String gender =request.getParameter("gender");
                String about =request.getParameter("about");
                
                // crate  user object and set all dsata to object
                User user=new User(name,email,password,gender,about);
                
                //create a user dao object
                UserDao dao = new UserDao(connectionProvider.getConnection());
                        if(dao.saveUser(user)){
                            // save
                            out.println("done");
                         }else{
                            out.println("error");
                        }
            }
            
           
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
