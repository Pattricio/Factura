<?php

 $conexion = new mysqli("localhost","root","","formulario");

 		if($conexion)
 		{
 			//echo "Conexion Exitosa";
 		}
 		else
 		{
 			echo "Conexion Fallida";
 		}
?>