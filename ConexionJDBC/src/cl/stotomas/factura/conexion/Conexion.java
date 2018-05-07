package cl.stotomas.factura.conexion; // Ruta de f�cil acceso.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	static final String URL = "jdbc:postgresql://localhost:5432/eclipse"; // url de la conexi�n
	static final String USER = "patricio"; // usuario con privilegios de postgre
	static final String PASS = "123"; // contrasena del rol creado

	// clase para la cadena de conexi�n.
	public static Connection crearConexion() throws ClassNotFoundException, SQLException{
	Class.forName("org.postgresql.Driver");
	
	// USO DE CONTRASE�A CODIFICADA
	
	// Cualquiera puede obtener acceso a esta contrasena al no estar crifrada
	
	Connection conexion = DriverManager.getConnection(URL, USER, PASS);
	
	if (conexion != null)   // si conexi�n existe realiza la conexion
	{
		System.out.print("Conexion establecida...");
		return conexion;
	}
		return null;
	}
	
}
