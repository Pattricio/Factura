package cl.stotomas.factura.negocio.init_9.copy.copy;

import java.applet.Applet;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;


public class TestingFinal {
	
	public static String decryptMessage(final byte[] message, byte[] secretKey)
	{
		try {
			// CÓDIGO VULNERABLE
			
			final SecretKeySpec KeySpec = new SecretKeySpec(secretKey, "DES");
			final Cipher 		cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
			cipher.init(Cipher.DECRYPT_MODE, KeySpec);
			
			// RECOMENDACIÓN VERACODE
			
			// final Cipher cipher = Cipher.getInstance("DES...");
			// cipher.init(Cipher.DECRYPT_MODE, KeySpec);
			
			return new String(cipher.doFinal(message));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	
	class Echo {
		
		// Control de Proceso
	
		// Posible reemplazo de librería por una maliciosa
		// Donde además se nos muestra el nombre explícito de esta.
	
		public native void runEcho();
		{
			System.loadLibrary("echo"); // Se carga librería

		}
		public void main(String[] args)
		{
			new Echo().runEcho();	
		}
		
		
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
		
		}
	
	}
	
}
