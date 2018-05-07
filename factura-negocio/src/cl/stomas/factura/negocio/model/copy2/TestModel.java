package cl.stomas.factura.negocio.model.copy2;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestModel{
	
	// Deserializaci�n de datos no confiables
	
	// Este c�digo no intenta verificar la fuente o el contenido del archivo antes de deserializarlo.
	// Un atacante puede reemplazar el archivo deseado por un archivo que contenga un c�digo malicioso
	// arbitrario que se ejecutar� cuando se presione el bot�n.
	// Para mitigar esto, defina expl�citamente el final readObject () para evitar la deserializaci�n.
	
	public static void error(){
	
		try {
			File file = new File("object.obj");
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
			
			@SuppressWarnings("unused")
			javax.swing.JButton button = (javax.swing.JButton) in.readObject();
			in.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
		// RECOMENDACION VERACODE
	
		//	Se define el readObject() para evitar la deserializaci�n.
	
	    //	private final void readObject(ObjectInputStream in) throws java.io.IOException
		//  {
		//		throw new java.io.IOException("Cannot be deserialized"); 
		
		// 	}
	
}