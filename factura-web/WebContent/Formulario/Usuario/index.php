<!DOCTYPE html>

<html>

<head>
	<link rel="stylesheet" type="text/css" href="../css/style.css">
    <link rel="stylesheet" href="../css/slider.css">
	<link rel="stylesheet" href="../css/estilos.css">
	<link rel="stylesheet" href="../Registro/login.php">
	<title>Sonic Zone</title>
	<meta charset="utf-8">


	<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script src="../main.js"></script>

</head>


<header>	

<a href="#"><logo id="logo"><img src="../images/logo.png"></logo></a> 

<font face="Tw Cen MT"><a href="../Registro/perfil.php" style="text-decoration: none; color: white;
position: absolute; left: 1200px; top: 30px;">Perfil</a></font><br>

<font face="Tw Cen MT"><a href="../index.php" style="text-decoration: none; color: white;
position: absolute; left: 1200px; top: 50px;">Cerrar Sesión</a></font><br>



		<!--MOSTRAR PEFIL -->
					<?php
						include("../Registro/Perfil/conexion.php");

						$query = "SELECT * FROM perfil";
						$resultado= $conexion->query($query);
						while($row = $resultado->fetch_assoc()){
					?>
						
				<img width="50px" 
				style="position: absolute; left: 1120px; top: 20px;"  
				src="data:image/jpg;base64,<?php echo base64_encode($row['imagen']); ?>"> 

						
					<?php
						}
					 ?>
		<!--MOSTRAR PEFIL -->



</header>


<div style="position: relative; top: 100px; left: 100px; width: 10%; height: 0%; padding: 0; margin: 0;">



<font face="Tw Cen MT"><a href="#" style="text-decoration: none; color: white;">Menu Principal</a></font><br>
<font face="Tw Cen MT"><a href="#" style="text-decoration: none; color: white;">------------------</a></font><br>
<font face="Tw Cen MT"><a href="../Noticias/noticias.html" style="text-decoration: none; color: white;">Noticias</a></font><br>
<font face="Tw Cen MT"><a href="../Juegos/juegos.php" style="text-decoration: none; color: white;">Juegos</a></font><br>
<font face="Tw Cen MT"><a href="#" style="text-decoration: none; color: white;">Música</a></font><br>
<font face="Tw Cen MT"><a href="#" style="text-decoration: none; color: white;">Comic's</a></font><br>
<font face="Tw Cen MT"><a href="#" style="text-decoration: none; color: white;">Música</a></font><br>
<font face="Tw Cen MT"><a href="#" style="text-decoration: none; color: white;">Contacto</a></font><br>

</div>




<body background="../images/Backgrounds/body1.jpg">



	<div class="wrap">
		<ul class="tabs">
			<li><a href="#tab1"><span font face="Tw Cen MT" size=3 color="black" class="tab-text">Sonic Zone</span></a></li>
			<li><a href="#tab2"></span><span font face="Tw Cen MT" size=3 color="black" class="tab-text">Juegos</span></a></li>
			<li><a href="#tab3"></span><span font face="Tw Cen MT" size=3 color="black" class="tab-text">Música</span></a></li>
			<li><a href="#tab4"></span><span font face="Tw Cen MT" size=3 color="black" class="tab-text">Noticias</span></a></li>
			<li><a href="#tab5"></span><span font face="Tw Cen MT" size=3 color="black" class="tab-text">Contacto</span></a></li>
		</ul>

		<div class="secciones">

			<article id="tab1" style="position: relative; top: 150px;">
			
				<!--MOSTRAR PEFIL -->
					<?php
						include("../Registro/Perfil/conexion.php");

						$query = "SELECT * FROM perfil";
						$resultado= $conexion->query($query);
						while($row = $resultado->fetch_assoc()){
					?>

						<div style="position: absolute; left: 170px; top: -90px;">
							Estado: <?php echo $row['estado']; ?>
						</div>

						<img width="100px";
					    style="position: absolute; top: -100px; left: 50px;" 
						src="data:image/jpg;base64,<?php echo base64_encode($row['imagen']); ?>">

					<?php
						}
					 ?>
				<!--MOSTRAR PEFIL -->
			
			
				<font face="Tw Cen MT" size=3 color="black">
					<hr>
					<font face="Tw Cen MT" size=3 color="black" style="position: relative; top: 30px;">
					Bienvenido a la página oficial de Sonic Zone.<br>
					Aquí podrás acceder al contenido gratuito de <br>
					Sonic The Hedgehog, las descargas de Juegos <br>
					Discografías, Comic's y otras noticias acerca <br>
					de Sonic The Hedgehog, recuerda también formar <br>
					parte de nuestra comunidad en facebook donde <br>
					también escucharémos tus inquietudes, ahora <br>
					no esperes más y busca todo el contenido que <br>
					buscabás completamente gratis.	
					</font>

					<div class="slider" style="position: relative; top: -150px;">
  					    <ul>
  						<li><img src="../images/Slider/1.jpg"></li>
  						<li><img src="../images/Slider/2.png"></li>
  						<li><img src="../images/Slider/3.jpg"></li>
  						<li><img src="../images/Slider/4.jpg"></li>
  						</ul>
  					</div>
  					<hr style="position: relative; top: -140px;">
				</font>
			</article>

		<article id="tab2">

		<img style="position: absolute; top: 330px; left: 50px;" src="../images/sar.jpg">
			<img style="position: absolute; top: 330px; left: 230px;" src="../images/su.png">
			<img style="position: absolute; top: 330px; left: 410px;" src="../images/s4.jpg">
			<img style="position: absolute; top: 330px; left: 590px;" src="../images/sa2.jpg">



		<font face="Tw Cen MT" size=3 color="black">
					<hr>
					<font face="Tw Cen MT" size=3 color="black" style="position: relative; top: 30px;">
					Descubre los juegos que podrás descargar desde.<br>
					la página, aquí los encontrarás todos, debes<br>
					asegurarte de que tendrás los recursos y el <br>
					ordenador bien equipado para jugarlos todos y<br>
					tranquilo ! que si algún enlace o alguno de los<br>
					juegos no te funcionan siempre podrás contactarme <br>
					te ayudaré o al menos te diré que ordenador vas<br>
					a necesitar para que tu juego funcioone, las<br>
					descargas son gratuitas !.	
					</font>

					<div class="slider" style="position: relative; top: -150px;">
  					    <ul>
  						<li><img src="../images/Slider/5.jpg"></li>
  						<li><img src="../images/Slider/6.jpg"></li>
  						<li><img src="../images/Slider/7.jpg"></li>
  						<li><img src="../images/Slider/8.jpg"></li>
  						</ul>
  					</div>
  					<hr style="position: relative; top: -140px;">
				</font>
			</article>

		
		<article id="tab3" style="position: relative; top: 150px;">
		<font face="Tw Cen MT" size=3 color="black">

					<div style="position: absolute; top: -110px;">
						<li>Crush 40</li>
						<li>Song of Angels</li>
						<li>The True Blue</li>
						<li>The True Colors</li>
						<li>Sonic Heroes Vocal</li>
						<li>Face To Faith</li>
						<li>Sonic Riders</li>
					</div>

					<div style="position: absolute; top: -110px; left: 300px;">
						<li>Lost And Found</li>
						<li>Blue Blur</li>
						<li>Cuts Unleashed</li>
						<li>Several Wills</li>
						<li>Sonic Rush</li>
						<li>Sonic Rush Adventure</li>
						<li>Sonic Boom</li>
					</div>

					<div style="position: absolute; top: -110px; left: 600px;">
						<li>Hybrid Colors</li>
						<li>Planetary Pieces</li>
						<li>The Best of Crush 40</li>
						<li>Sonic Adventure Songs</li>
						<li>Withouth Boundaries</li>
						<li>Tales of Knighthood</li>
						<li>Sonic Youth</li>
					</div>
						

					<hr>
					<font face="Tw Cen MT" size=3 color="black" style="position: relative; top: 30px;">
					Te gustan las canciones que cantan detrás de<br>
					cada escena en cada juego o los efectos de sonido<br>
					dentro del mundo de Sonic, pués los artistas de<br>
					dichas canciones tienen un montón de discografías<br>
					que podrás encontrar aquí, busca la discografía<br>
					que te gusta y descargala podrás apreciar el<br>
					Rock de Crush 40 en toda su luz, además podrás<br>
					descargar los soundtrackas de cada escene y es<br>
					completamente gratis.	
					</font>

					<div class="slider" style="position: relative; top: -150px;">
  					    <ul>
  						<li><img src="../images/Slider/9.jpg"></li>
  						<li><img src="../images/Slider/10.jpg"></li>
  						<li><img src="../images/Slider/11.jpg"></li>
  						<li><img src="../images/Slider/12.jpg"></li>
  						</ul>
  					</div>
  					<hr style="position: relative; top: -140px;">
				</font>
			</article>

			<article id="tab4">
				<hr style="position: relative; left: 10px; top: 10px;"><br><br><br>
				<!-- Noticia 01 -->
				<img src="../images/Noticias/menu.jpg" style="position: relative; width: 10%; top: -20px;">
				<br>
				<div style="position: relative; top: -90px; left: 85px;"><font face="Tw Cen MT" size=3 color="black">
				Sabías que el aclamado Sonic Manía fue un éxito dentro del fandom ? Muchos esperaban con<br>
				ansías el regreso del querido erizo y logró debutar con gran éxito dentro del mercado y entre<br> 
				los fans, bastante polémica se generó por el asunto ya que muchos esperaban una vuelta<br>
				a los éxitos clásico del erizo en sus buenos años, enterate de esta noticia aquí.

				<a href="#" style="text-decoration: none;"><font face="Tw Cen MT" size=3 color="blue" 
			    style="position: absolute; left: 545px; top: 70px;">entrar</font></a></font><br></div>

				<div style="position: relative; top: -50px;"><hr></div>

				<!-- Noticia 02 -->
				<img src="../images/Noticias/menu2.jpg" style="position: relative; width: 10%; top: -30px;">
				<div style="position: relative; top: -100px; left: 85px;"><font face="Tw Cen MT" size=3 color="black">
				Ya se viene Sonic Forces ! la nueva aventura de Sonic y compañía, que aventuras les esperará<br> 
				a nuestros amigos ? muchos fans esperaban la venida de nuestro querido erizo, no ha sido nada<br> 
				fácil satisfacer a los duros fans, pero parece que SEGA y el sonic team han optado por darles<br>
				ambas opciones a sus seguidores esperando calmar la tormenta. Enterate de la noticia aquí.<br>

				<a href="#" style="text-decoration: none;"><font face="Tw Cen MT" size=3 color="blue"
			    style="position: absolute; left: 545px; top: 85px;">entrar</font></a></font><br>

				<hr style="position: relative; left: -90px; top: 20px;">

				   <!-- Noticia 03 -->
			 <div style="position: absolute; top: 170px; left: -70px;">
				<img src="../images/Noticias/menu3.jpg" style="position: relative; width: 12%; top: -35px; left: -10px;">
				<div style="position: relative; top: -110px; left: 85px;"><font face="Tw Cen MT" size=3 color="black">
				Ya se viene Sonic Forces ! la nueva aventura de Sonic y compañía, que aventuras les esperará<br> 
				a nuestros amigos ? muchos fans esperaban la venida de nuestro querido erizo, no ha sido nada<br> 
				fácil satisfacer a los duros fans, pero parece que SEGA y el sonic team han optado por darles<br>
				ambas opciones a sus seguidores esperando calmar la tormenta. Enterate de la noticia aquí.<br>

				<a href="#" style="text-decoration: none;"><font face="Tw Cen MT" size=3 color="blue"
			    style="position: absolute; left: 545px; top: 75px;">entrar</font></a></font><br><br>

			    </div>
			</div><br>
		 </div>	
	</article>

			<article id="tab5">

				<hr>
				<br>
					<div><font face="Tw Cen MT" size=3 color="black" style="position: relative; top: 20px; left: 400px;">
					Siguenos a través de facebook ! y ayudanos<br> 
					con un like, y se parte de la gran comunidad<br> 
					que con muucho esfuerzo se mantiene bastante<br> 
					unida. y comparte tus opiniones referente a<br>
					Sonic y además participa u organiza tus propios<br>
					eventos y gana los especiales que harémos en<br> 
					la comunidad. además atenderemos tus dudas o<br> 
					sobre algún pedido que haga falta.</font></div>
			
		<!--LIKE BOX-->
        <div id="b_col3" style="position: relative; left: -0px; top: -120px;">
        <iframe src="https://www.facebook.com/plugins/page.php?href=https%3A%2F%2Fwww.facebook.com%2FSonicZonex%2F&tabs=timeline&width=340&height=500&small_header=false&adapt_container_width=true&hide_cover=false&show_facepile=true&appId" width="340" height="130" style="border:none;overflow:hidden" scrolling="no" frameborder="0" allowTransparency="true"></iframe>
        <!--LIKE BOX-->
      	<div style="position: relative; left: 0px; top: 55px;"><hr></div> 
			</article>

		</div>
	</div>


</body>

<br>
<footer style="position: relative; top: 70px;">

<center><p id="fotext" style="color: white;">Sonic Zone. diseño hecho por sonic, 2017</p></center>

<img id="facebook" src="../images/face.png"> <font face="Tw Cen MT" id="face" size="3" style="color: white">SonicZone.facebook.com</font>
<img id="whatsapp" src="../images/whats.png"> <font face="Tw Cen MT" id="num" size="3" style="color: white">+569 66503979</font>

</footer>

</html>