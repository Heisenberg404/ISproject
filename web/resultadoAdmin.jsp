<%-- 
    Document   : resultadoAdmin
    Created on : 09-may-2015, 18:19:34
    Author     : Andres Montoya
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Vuelos</title>
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
          
      </ul>
    </div>
    <br class="clear" />
  </div>
</div>

<div class="wrapper">
    <div id="latest">
        <div class="fl_center4">
            <div class="center"><b>INFORMACION DEL resultado</b></div> <br> 
            <div id="latest">
            <h1>Procesamiento</h1>
            <h3><%=request.getAttribute("mensaje")%></h3>
            <br class="clear" />
            </div>
            <p> 
                <label>
                    <a href="ServletInsertVuelo">Regresar</a>
                </label>  
            </p>
        </div>
        <br class="clear" />
    </div>
</div>

<div class="wrapper">
  <div id="copyright">
    <p class="fl_left">Copyright &copy; 2014 - All Rights Reserved - Desarrollado por AM & AA</p>
    <br class="clear" />
  </div>
</div>
</body>
</html>