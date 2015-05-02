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
import modelo.Bean.BeanVuelo;
import modelo.Dao.DAO_vuelo;

/**
 *
 * @author Andres Montoya
 */
@WebServlet(name = "ServletVuelo", urlPatterns = {"/ServletVuelo"})
public class ServletVuelo extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        
        int opcion=Integer.parseInt(request.getParameter("txtOpcion"));
        String idVuelo = request.getParameter("txtidVuelo");
        String hfSalida = request.getParameter("txtfhSalida");
        String hfLlegada = request.getParameter("txtfhLlegada");
        String origen = request.getParameter("txtorigen");
        String destino = request.getParameter("txtDestino");
        String aerolinea = request.getParameter("txtAerolinea");
        int tiempo = Integer.parseInt(request.getParameter("txtTiempo"));
        int precio = Integer.parseInt(request.getParameter("txtAerolinea"));
        int nPuestos = Integer.parseInt(request.getParameter("txtNpuestos"));
        
           BeanVuelo BVvuelo = new BeanVuelo(idVuelo, hfSalida, hfLlegada, origen, destino,  aerolinea, tiempo, precio, nPuestos);
           DAO_vuelo DVvuelo = new DAO_vuelo(BVvuelo);
           String mExito = "Operacion exitosa.";
           String mError = "Operacion Fallida.";
           
           switch(opcion)
            {
            case 1:// AGREGAR REGISTROS
                if(DVvuelo.agregarVuelo())
                    {
                     request.setAttribute("mensaje", mExito);
                    }
                else
                    {
                        request.setAttribute("mensaje", mError);
                    }
                request.getRequestDispatcher("index.jsp").forward(request, response);
            break;
            case 2://BORRAR REGISTROS

                
                if(DVvuelo.borrarVuelo())
                    {
                    request.setAttribute("mensaje", mExito);
                    }
                else
                    {
                        request.setAttribute("mensaje", mError);
                    }                
                request.getRequestDispatcher("index.jsp").forward(request, response);
            break;    
            case 3:
                if(DVvuelo.actualizarVuelo())
                    {
                    request.setAttribute("mensaje", mExito);
                    }
                else
                    {
                        request.setAttribute("mensaje", mError);
                    }
                request.getRequestDispatcher("index.jsp").forward(request, response);
            break;
        
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
