package cl.stotomas.factura.negocio.ia_22.copy2;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

//import cl.stomas.factura.negocio.testing.TestingFinal.Echo;

public class TestingError {
	
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

	}

}