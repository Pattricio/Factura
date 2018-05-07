<?php
	include("conexion.php");

 		$nombre = $_POST['nombre'];
 		$Imagen = addslashes(file_get_contents($_FILES['Imagen']['tmp_name']));

 		$query = "INSERT INTO perfil(estado,imagen) VALUES('$nombre','$Imagen')";
 		$resultado = $conexion->query($query);

 		if($resultado)
 		{ 			
 			header("location: /Sonic/Usuario/index.php");
 		}
 		else
 		{
 			echo "No funciono";
 		}
?>



