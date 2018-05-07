package cl.stomas.factura.negocio.model.copy;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

// El uso de un algoritmo criptográfico roto o arriesgado es un riesgo
// innecesario que puede dar lugar a la divulgación de información sensible.

public class ErrorModel
{
	public static String decryptMessage(final byte[] message, byte[] secretKey)
	{
		try {
			// CÓDIGO VULNERABLE
			
			 final SecretKeySpec KeySpec = new SecretKeySpec(secretKey, "DES");
			// final Cipher 		cipher = Cipher.getInstance("DES/ECB/PKCS5Padding"); 
			// cipher.init(Cipher.DECRYPT_MODE, KeySpec);
			
			
			// RECOMENDACIÓN VERACODE
			
			 final Cipher cipher = Cipher.getInstance("DES...");
			cipher.init(Cipher.DECRYPT_MODE, KeySpec);
			
			return new String(cipher.doFinal(message));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}
	
}



