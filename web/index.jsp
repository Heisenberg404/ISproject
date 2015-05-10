<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Tiquetes</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link rel="stylesheet" href="layout/styles/bootstrap/css/bootstrap.css" />
<link rel="stylesheet" href="layout/styles/layout.css" type="text/css" />
</head>
<body id="myBody">
    <div class="wrapper">
        <div id="header">
            <div align="right"><h1></h1></div>
            <div id="logo">
                <a href="index.html"><img id="logo" src="images/EasyTicketsLogo.png" alt="" /></a>
            </div>
        <div id="topnav">
            <ul>
                <li class="active"><a href="index.jsp">Inicio</a></li>
                <li><a href="VerOferta.html">Consultar Ofertas</a></li>
                <li class="last"><a href="#sesion" data-toggle="modal">Ingresar a mi cuenta</a></li>
            </ul>
        </div>
        <br class="clear" />
        </div>
    </div>
    <div class="wrapper">
    <div id="latest">
      <div class="fl_left"><a href="#"><img src="images/miami.jpg" alt="" /></a></div>
      <div class="fl_right">
        <h2>Conozca el paraiso de Miami con nosotros.</h2>
        <p>Miami es una ciudad estadounidense ubicada en la parte sureste de Florida 
            alrededor del río Miami, entre los Everglades y el océano Atlántico.</p>
        <ul>
          <li><a href="#"><img src="images/miamiSmall1.jpg" alt="" /></a></li>
          <li><a href="#"><img src="images/miamiSmall2.jpg" alt="" /></a></li>
      <li class="last"><a href="#"><img src="images/miamiSmall3.jpg" alt="" /></a></li>
        </ul>
      </div>
      <br class="clear" />
    </div>
</div>
    <div class="wrapper">
  <div id="intro">
    <ul>
      <li >
        <h2>Disfrute de londres</h2>
        <div class="imgholder"><a href="#"><img src="images/londres1.jpg"  /></a></div>
        <p>Londres, capital política y económica del Reino Unido, es una de las ciudades más visitadas del mundo debido a su carácter especial y cosmopolita.Para conocer Londres es necesario visitarla y vivirla, dejando que el toque especial de la ciudad y sus gentes nos seduzcan a través de su acogedora inmensidad. </p>
        <p>Londres tiene algo que engancha y a todos gusta, Londres es diversión, cultura, luces y color.</p>
        <p class="readmore"><a href="#">Seguir leyendo... &raquo;</a></p>
      </li>
      <li>
        <h2>Disfrute de la capital Gaucha</h2>
        <div class="imgholder"><a href="#"><img src="images/BuenosAires1.jpg"  /></a></div>
        <p>Buenos Aires, Está situada en la región centro-este del país, sobre la orilla occidental del Río de la Plata, en plena llanura pampeana.</p>
        <p>Su perfil urbano es marcadamente ecléctico. Se mezclan, a causa de la inmigración, los estilos art decó, art nouveau, neogótico y el francés borbónico. Por esto último se la conoce en el mundo por el apodo de "La París de América"</p>
        <p class="readmore"><a href="#">Seguir leyendo... &raquo;</a></p>
      </li>
        <li class="last">
        <h2>Conozca la gran manzana</h2>
        <div class="imgholder"><a href="#"><img src="images/imgNewYork1.jpg"/></a></div>
        <p>La Ciudad de Nueva York está ubicada en la costa esta de los Estados Unidos, unas 1000 millas al norte de Florida 
            y 200 millas al sur de Boston. Está en la boca del Río Hudson y se encuentra dividida en cinco distritos o barrios. 
            La Isla Long está al este de la Ciudad de Nueva York y
            el estado de Nueva Jersey está justo al otro lado del Río Hudson, al oeste. </p>
        <p class="readmore"><a href="#">Seguir Leyendo  &raquo;</a></p>
      </li>
    </ul>
    <br class="clear" />
  </div>
</div>
    <div class="wrapper">
  <div id="container">
    <div id="content">
      <%= session.getAttribute( "email" ) %>
      <h2> Que es "EasyTickets"</h2>
      <p>Somos una empresa creada para facilitar la compra de los usuarios de tiquetes para volar, ayudando
          a nuestros clientes en la gestion y abordaje, ademas brindando las mejores asesorias sobre los destinos turisticos y en que temporada
          es mas recomendado viajar.<a href="http://www.os-templates.com/">Tiquetes al aire </a>.</p>
      </div>
    <div id="column">
      <div class="holder">
        <h2>Disfruta Medellin</h2>
        <ul id="latestnews">
          <li class="last"><img class="imgl" src="images/imgMedellin1.jpg" alt="" />
            <p><strong> Los Paisas!</strong></p>
            <p>Medellín fue elegida como la ciudad más innovadora del mundo, en el marco del concurso City of the Year,
                que organizan The Wall Street Journal y Citigroup. La capital antioqueña compitió con Nueva York y Tel Aviv;
                la decisión dependió de una votación abierta al público por Internet</p>
            <p class="readmore"><a href="#">Seguir leyendo... &raquo;</a></p>
          </li>
        </ul>
      </div>
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
    <div class="modal fade" id="sesion" role="dialog">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4><b>SELECCIONE SU TIPO DE USUARIO</b></h4>
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
    <script src="layout/styles/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>