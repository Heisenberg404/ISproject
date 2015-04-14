/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Bean.BeanUsuario;
import modelo.Dao.DAO_usuario;

/**
 *
 * @author Andres Montoya
 */
@WebServlet(name = "ServletUsuario", urlPatterns = {"/ServletUsuario"})
public class ServletUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
           
        String cedula = request.getParameter("txtcedula");
        String nombre = request.getParameter("txtnombre");
        String apellido = request.getParameter("txtapellido");
        String email = request.getParameter("txtemail");
        String telefono = request.getParameter("txttelefono");
        String nombreTarjeta = request.getParameter("txt_nombre_t");
        String numeroTarjeta = request.getParameter("txt_numero_t");
        String banco = request.getParameter("txt_banco");
        
        BeanUsuario BUusuario = new BeanUsuario(cedula, nombre, apellido, email, telefono, nombreTarjeta, numeroTarjeta, banco);
        DAO_usuario DUsuario = new DAO_usuario(BUusuario);
        String mExito = "Operacion exitosa.";
        String mError = "Operacion Fallida.";
        
        if (DUsuario.agregarRegistro())
            {
            request.setAttribute("mensaje", mExito);
            }
        else
            {
            request.getRequestDispatcher("index.jsp").forward(request, response);
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
