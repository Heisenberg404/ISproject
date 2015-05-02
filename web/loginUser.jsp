<%-- 
    Document   : loginUser
    Created on : 02-may-2015, 10:10:05
    Author     : Andres Montoya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Ingreso de sesion</title>
    <link rel="stylesheet" href="layout/styles/layout.css" type="text/css" />
    <link rel="stylesheet" href="layout/styles/bootstrap/css/bootstrap.min.css" />
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimun-scale=1.0">
</head>
<body id="myBody">
<div class="wrapper">
  <div id="header">
    <div id="logo">
        <a href="index.html"><img id="logo" src="images/EasyTicketsLogo.png" alt="" /></a>
    </div>
    <div id="topnav">
      <ul>
        <li ><a href="index.jsp">Inicio</a></li>
        <li><a href="VerOferta.html">Consultar Ofertas</a></li>
        <li class="active"><a href="#sesion" data-toggle="modal">Ingresar a mi cuenta</a></li>
      </ul>
    </div>
    <br class="clear" />
  </div>
</div>
<div class="wrapper">
  <div id="latest">
      
   <div class="fl_left2">
       <form id="formInicioUser" action="ServletLoginUser" method="Post">
            <h2>Ingresa los datos para iniciar sesion como CLIENTE</h2> <br>
            <input class="form-control"  name="txtCorreo" type="text" placeholder="Digite su correo electronico"/> <br> <br>
            <input class="form-control"  name="txtPass" type="password" placeholder="Digite su contraseña"/>  <br> 
            <div><button class="btn btn-primary" id="btnIngresar" type="submit"/>Ingresar</div>
            <h3 class="center"><a href="RegistroUsuario.jsp">Registrase</a></h3>
        </form>
 </div>
    <br class="clear" />
    
  </div>
    
</div>
 <br>
 
<div class="wrapper">
  <div id="container">
    <div id="pie">
      <% if (request.getAttribute("errorInicioUser") != null)   {%>  
        ${errorInicioUser}
      <%}%>  
    </div>
    
    <br class="clear" />
  </div>
<<div class="wrapper">
  <div id="footer">
    <div id="newsletter">
      <h2>Dejanos tu correo para enviarte nuestras promociones !</h2>
      <form action="#" method="post">
        <fieldset>
          <legend>News Letter</legend>
          <input type="text" value="Enter Email Here&hellip;"  onfocus="this.value=(this.value=='Enter Email Here&hellip;')? '' : this.value ;" />
          <input type="submit" name="news_go" id="news_go" value="GO" />
        </fieldset>
      </form>
      <p>Para darte de baja <a href="#">click aqui &raquo;</a></p>
    </div>
    <div class="footbox">
      <h2>Siguenos en!</h2>
      <ul>
        <li><a href="#">Twitter</a></li>
        <li><a href="#">Facebook</a></li>
        <li><a href="#">Instagram</a></li>
       </ul>
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
                            <a href="loginAdmin.html" class="thumbnail">
                                <img src="images/admin.jpg" alt="1">
                            </a>
                        </div>
                        <div class="col-sm-6 col-md-6">
                            <a href="login.html" class="thumbnail">
                                <img src="images/cliente.jpg" alt="2">
                            </a>
                        </div>
                   </div>
                 </div>
            </div>
        </div>
    </div>
    <script src="layout/styles/bootstrap/js/jquery.js"></script>
    <script src="layout/styles/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
