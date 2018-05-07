<!DOCTYPE html>
<html>
<head>
	<title>Mostrar</title>
</head>
<body>
	<center>
		<table border="2">
			<thead>
				<tr>
					<th>id</th>
					<th>Nombre</th>
					<th>Imagen</th>
					<th>Operaciones</th>
				</tr>
				

			</thead>
				<tbody>
					<?php
						include("conexion.php");

						$query = "SELECT * FROM perfil";
						$resultado= $conexion->query($query);
						while($row = $resultado->fetch_assoc()){
					?>
						<tr>
							<td><?php echo $row['id']; ?></td>
							<td><?php echo $row['estado']; ?></td>
							<td><img width="128px"; src="data:image/jpg;base64,<?php echo base64_encode($row['imagen']); ?>"></td>
							<th><a href="modificar.php?id=<?php echo $row['id'] ?>">Modificar</a></th>
							<th><a href="eliminar.php?id=<?php echo $row['id'] ?>">Eliminar</a></th>
						</tr>
					<?php
						}
					 ?>





				</tbody>
		</table>

	</center>
</body>
</html>