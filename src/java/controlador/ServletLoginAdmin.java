
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Dao.DAO_IS_admin;

/**
 *
 * @author Andres Montoya
 */
@WebServlet(name = "ServletLoginAdmin", urlPatterns = {"/ServletLoginAdmin"})
public class ServletLoginAdmin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String alias = request.getParameter("txtUsuario");
        String pass = request.getParameter("txtPass");
        
        DAO_IS_admin Iadmin = new DAO_IS_admin();
        
        if (Iadmin.validar(alias, pass))
        {
            //es necesario cambiar el destino al que se enviara al usuario al momento de iniciar sesion!
            request.getRequestDispatcher("adminVuelo.jsp").forward(request, response);
        }
        else
        {
            request.setAttribute("errorInicioAdmin", "<script>alert('Usuario y/o contraseña no validas')</script>");
            request.getRequestDispatcher("LoginAdmin.jsp").forward(request, response);
        }    
//        
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