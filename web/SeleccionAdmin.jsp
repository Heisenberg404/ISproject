<%-- 
    Document   : adminVuelo
    Created on : 02-may-2015, 14:20:08
    Author     : Andres Montoya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>OpcionesVuelos</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="layout/styles/layout.css" type="text/css" />
        <link rel="stylesheet" href="layout/styles/bootstrap/css/bootstrap.css" />
        <link rel="stylesheet" type="text/css" href="layout/styles/bootstrap/css/dark-hive/jquery-ui-1.10.4.custom.css">
        <script src='layout/styles/bootstrap/js/jquery-1.10.2.js'></script>
        <script src='layout/styles/bootstrap/js/jquery-ui-1.10.4.custom.min.js'></script>
        <script type="text/javascript" src="layout/styles/bootstrap/js/jquery.ui.datepicker-es.js"></script>
    
    </head>
<body id="myBody">
<div class="wrapper">
  <div id="header">
    <div id="logo">
        <a href="index.jsp"><img id="logo" src="images/EasyTicketsLogo.png" alt="" /></a>
    </div>
    <div id="topnav">
      <ul>
          <li ><a href="index.jsp">Inicio</a></li>
        <li><a href="VerOferta.html">Consultar Ofertas</a></li>
        <li class="last"><a href="#sesion" data-toggle="modal">Ingresar a mi cuenta</a></li>
        
      </ul>
    </div>
    <br class="clear" />
  </div>
</div>
<div class="wrapper">
    <div id="latest">
        <div class="fl_center4">
            <div class="center"><b>Opciones de Administrador</b></div> <br> <br>
                <div class="row">
                    <div class="col-sm-4 col-md-4">
                        <a href="ServletInsertVuelo" ><img src="images/agregar.png" width="242px"><b>Insertar un vuelo</b></a>
                    </div>  
                    <br>
                    <div class="col-sm-4 col-md-4">
                        <a href="ServletRead"><img src="images/buscar.png" width="222px"><b>Consultar Todo</b></a>
                    </div>
                </div>    
            </div>
    <br class="clear" />
    </div>
</div>



<div class="wrapper">
  <div id="copyright">
    <p class="fl_left">Copyright &copy; 2014 - All Rights Reserved - <a href="#">Desarrollado por AM & AA</a></p>
    <p class="fl_right">Template by <a target="_blank" href="http://www.os-templates.com/" title="Free Website Templates">OS Templates</a></p>
    <br class="clear" />
  </div>
</div>
<div class="modal fade" id="sesion" role="dialog">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4><b>Seleccione su tipo de usuario</b></h4>
                </div>
                <div class="modal-body">
                    <div class="row">
                        <div class="col-sm-6 col-md-6">
                            <a href="LoginAdmin.jsp" class="thumbnail">
                                <img src="images/admin.jpg" alt="1">
                            </a>
                        </div>
                        <div class="col-sm-6 col-md-6">
                            <a href="loginUser.jsp" class="thumbnail">
                                <img src="images/cliente.jpg" alt="2">
                            </a>
                        </div>
                   </div>
                 </div>
            </div>
        </div>
    </div>       
    <script src="layout/styles/bootstrap/js/jquery.js"></script>
    <script src='layout/styles/bootstrap/js/jquery-ui-1.10.4.custom.min.js'></script>
    <script src="layout/styles/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="layout/styles/bootstrap/js/calendario.js"></script>
</body>
</html>
