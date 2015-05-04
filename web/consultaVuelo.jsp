<%-- 
    Document   : consultaVueloUser
    Created on : 02-may-2015, 13:38:41
    Author     : Andres Montoya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Consultar Vuelo</title>
        <link rel="stylesheet" href="layout/styles/layout.css" type="text/css" />
        <link rel="stylesheet" href="layout/styles/bootstrap/css/bootstrap.css"/>
        <link rel="stylesheet" type="text/css" href="layout/styles/bootstrap/css/dark-hive/jquery-ui-1.10.4.custom.css">
       
        
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimun-scale=1.0">
    </head>
    <body id="myBody">
        <div class="wrapper">
            <div id="header">
                <%
                    String nombreUser = "";
                    
                    if(!(session.getAttribute("email") == null))
                    {
                        nombreUser = session.getAttribute("email").toString();
                    }
                    
                %>  
                <div align="right"><h1><%= nombreUser %></h1></div>
            <div id="logo">
                <a href="index.html"><img id="logo" src="images/EasyTicketsLogo.png" alt="" /></a>
            </div>
            <div id="topnav">
                <ul>
                    <li ><a href="index.jsp">Inicio</a></li>
                    <li class="active"><a href="VerOferta.html" target="_blank">Consultar Ofertas</a></li>
                    <li class="last"><a href="login.html">Ingresar a mi cuenta</a></li>
                </ul>
            </div>
                <br class="clear" />
            </div>
        </div>
<div class="wrapper">
  <div id="latest">
    <div class="fl_left3">
         <div class="center"><b>Ingrese los parametros de busqueda</b></div> <br> 
        <form class="form-horizontal">
            <div class="form-group">
            <div class="col-lg-11"><input type="text" class="form-control" id="origen" placeholder="Origen"></div>
            </div>
            <div class="form-group">
            <div class="col-lg-11"><input type="text" class="form-control" id="destino" placeholder="Destino"></div>
            </div>
            <div class="form-group">
            
            <div class="col-lg-11"><input type="text" class="form-control fecha"  name="fecha_salida" placeholder="Fecha de salida"></div>
            </div>
            <div class="form-group">
            <div class="col-lg-11"><input type="text" class="form-control fecha" id="fecha_llegada" placeholder="Fecha de llegada"></div>
            </div>
            <div class="form-group">
            <div class="col-lg-4"><input type="text" class="form-control" id="puesto" placeholder="Puestos"></div>
            </div>
            <div class="form-group">
                <div class="col-lg-3"><button type="submit" class="btn-custom btn-lg">Buscar</button></div>
                
            </div>
        </form>
    </div>
    <br class="clear" />
  </div>
</div>

<div class="wrapper">
  <div id="container">
    <div id="content">
      
      </div>
    
    <br class="clear" />
  </div>
</div>
<div class="wrapper">
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
    <script src="layout/styles/bootstrap/js/jquery.js"></script>
    <script src='layout/styles/bootstrap/js/jquery-ui-1.10.4.custom.min.js'></script>
    <script src="layout/styles/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="layout/styles/bootstrap/js/calendario.js"></script>
</body>
</html>
