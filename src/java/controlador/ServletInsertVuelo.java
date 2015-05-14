/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import EJB.ejbVuelo;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andres Montoya
 */
@WebServlet(name = "ServletInsertVuelo", urlPatterns = {"/ServletInsertVuelo"})
public class ServletInsertVuelo extends HttpServlet {

    
    @EJB
    private ejbVuelo ejbTVuelo;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        if(request.getMethod().equals("GET"))
        {
            request.getRequestDispatcher("InsertVuelo.jsp").forward(request, response);
        }
        if(request.getMethod().equals("POST"))
        {
            ejbTVuelo.gettVuelo().setIdvuelo(request.getParameter("txtIdVuelo"));
            ejbTVuelo.gettVuelo().setFechaSalida(Date.valueOf(request.getParameter("txtFechaS")));
            ejbTVuelo.gettVuelo().setFechaLlegada(Date.valueOf(request.getParameter("txtFechaL")));
            ejbTVuelo.gettVuelo().setHoraSalida(request.getParameter("txtHoraS"));
            ejbTVuelo.gettVuelo().setHoraLlegada(request.getParameter("txtHoraL"));
            ejbTVuelo.gettVuelo().setOrigen(request.getParameter("txtOrigen"));
            ejbTVuelo.gettVuelo().setDestino(request.getParameter("txtDestino"));
            ejbTVuelo.gettVuelo().setTiempo_vuelo(new Integer (request.getParameter("txtTiempo")));
            ejbTVuelo.gettVuelo().setAerolinea(request.getParameter("txtAerolinea"));
            ejbTVuelo.gettVuelo().setN_puestos(new Integer (request.getParameter("txtN_puestos")));
            ejbTVuelo.gettVuelo().setDestino(request.getParameter("txtDestino"));
            
            String mensaje_respuesta;
            if(ejbTVuelo.insert())
            {
                mensaje_respuesta="OK";
                request.setAttribute("mensaje", "<script>alert('Registro ingresado con exito')</script>");
            
            }
            else
            {
                mensaje_respuesta="wrong";
                request.setAttribute("mensaje", "<script>alert('Registro no ingresado con exito')</script>");
            request.getRequestDispatcher("SeleccionAdmin.jsp").forward(request, response);
            
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
