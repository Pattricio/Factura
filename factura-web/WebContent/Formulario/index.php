<!DOCTYPE html>

<html>

<head>
	<link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" href="css/slider.css">
	<link rel="stylesheet" href="css/estilos.css">
	<link rel="stylesheet" href="Registro/login.php">
	<title>Sonic Zone</title>
	<meta charset="utf-8">


	<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script src="main.js"></script>

</head>

<!-- INICIAR SESIÓN -->
<?php

session_start();    
include("Registro/config.php");

if(isset($_POST['iniciarsesion']))
{
    if(isset($_POST['userlogin']) && !empty($_POST['userlogin']) &&
       isset($_POST['pwlogin']) && !empty($_POST['pwlogin']))
    {

            $sqldos = "SELECT Usuario,Contrasena FROM usuarios WHERE Usuario='$_POST[userlogin]'";
            $recdos = mysqli_query($conexion,$sqldos);

            $sesion = mysqli_fetch_array($recdos);

            if(password_verify($_POST['pwlogin'], $sesion['Contrasena']))
            {
                $_SESSION['username'] = $_POST['userlogin'];
                header("location: Registro/registrado.html");
            }
            else
            {
                echo '<meta http-equiv="Refresh" content="0;URL=Registro/error.html">';
            }

    }
    else
    {
        echo '<meta http-equiv="Refresh" content="0;URL=Registro/error.html">';
    }
}
?>
<!-- INICIAR SESIÓN -->



<!-- Inicio Sesión -->
<header>	

<a href="#"><logo id="logo"><img src="images/logo.png"></logo></a> 

<form method="POST" action="">

<div style="position: absolute; top: 90px; left: 130px;">
<input id="usubox" type="text" name="userlogin" size="15" maxlength="20" placeholder="Usuario">
<input id="usupass" type="password" name="pwlogin" size="15" maxlength="20" placeholder="Contrase&ntilde;a">	
</div>

i
<input id="button" type=image src="images/init.png" name="iniciarsesion" value="Iniciar Sesión" style="position: absolute; left: 1200px; top: 35px;">
</input><br><br>




</form>


<div style="position: relative; top: -15px; left: -10px;">
	
<font face="Tw Cen MT" id="forget" size="2"><a href="Registro/recuperacion.html" style="text-decoration: none; color: white;">He olvidado mi cuenta</a></font>
<font face="Tw Cen MT" id="password" size="2"><a href="#" style="text-decoration: none; color: white;">Cambiar mi contraseña</a></font>

</div>



</header>


<div style="position: relative; top: 100px; left: 100px; width: 10%; height: 0%; padding: 0; margin: 0;">

<div id="registro" style="position: relative; top: -30px; left: -10px;"><a href="Registro/formulario.php"><img src="images/registrate.png"></a></div>

<font face="Tw Cen MT"><a href="#" style="text-decoration: none; color: white;">Menu Principal</a></font><br>
<font face="Tw Cen MT"><a href="#" style="text-decoration: none; color: white;">------------------</a></font><br>
<font face="Tw Cen MT"><a href="Noticias/noticias.html" style="text-decoration: none; color: white;">Noticias</a></font><br>
<font face="Tw Cen MT"><a href="Juegos/juegos.php" style="text-decoration: none; color: white;">Juegos</a></font><br>
<font face="Tw Cen MT"><a href="#" style="text-decoration: none; color: white;">Música</a></font><br>
<font face="Tw Cen MT"><a href="#" style="text-decoration: none; color: white;">Comic's</a></font><br>
<font face="Tw Cen MT"><a href="#" style="text-decoration: none; color: white;">Música</a></font><br>
<font face="Tw Cen MT"><a href="#" style="text-decoration: none; color: white;">Contacto</a></font><br>

</div>




<body background="images/Backgrounds/body1.jpg">




</body>

<br>
<footer style="position: relative; top: 70px;">

<center><p id="fotext" style="color: white;">Sonic Zone. diseño hecho por sonic, 2017</p></center>

<img id="facebook" src="images/face.png"> <font face="Tw Cen MT" id="face" size="3" style="color: white">SonicZone.facebook.com</font>
<img id="whatsapp" src="images/whats.png"> <font face="Tw Cen MT" id="num" size="3" style="color: white">+569 66503979</font>

</footer>

</html>