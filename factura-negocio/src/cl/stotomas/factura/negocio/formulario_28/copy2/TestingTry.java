package cl.stotomas.factura.negocio.formulario_28.copy2;

import java.applet.Applet;


public class TestingTry {
	
		// Inclusión de funcionalidades de esfera de control que no es de confianza
	
		// Un atacante puede insertar funcionalidades maliciosas dentro de este programa.
		// Las Applet comprometen la seguridad. ya que sus funcionalidades se pueden adaptar a la Web
		// Ademas la entrega de acceso de credenciales es engorrosa para el cliente.
	
		public final class TestApplet extends Applet {
		private static final long serialVersionUID = 1L;
		}
		
		//Comparación de referencias de objeto en lugar de contenido de objeto
		
		// El if dentro de este código no se ejecutará.
		// porque se prioriza el String a mostrar.
		
		public final class compareStrings{
		
			public String str1;
			public String str2;
			
			public void comparar()
			{
				if (str1 == str2)
				{
					System.out.println("str1 == str2");
				}
			}
			
			
			// 	RECOMENDACIÓN VERACODE 
			
			// 	Utilizar equals para realizar la comparación.
			// 	public void comprar()
			//	{
			//		if (str1.equals (str2)) 
			//		{
			//			System.out.println ("str1 es igual a str2");
			//		}
			//	}
								
	}			
		
}


