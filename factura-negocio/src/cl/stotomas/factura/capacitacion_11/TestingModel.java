package cl.stotomas.factura.capacitacion_11;


public class TestingModel {

	class Echo {
		
			// Control de Proceso
		
			// Posible reemplazo de librería por una maliciosa
			// Donde además s enos muestra el nombre explícito de esta.
		
			public native void runEcho();
			{
				System.loadLibrary("echo"); // Se carga librería

			}
			public void main(String[] args)
			{
				new Echo().runEcho();	
			}
			
		}
	
	
	public final class compareStrings{
		
		public String hola;
		public String adios;
		
		public void comparar()
		{
			if (hola == adios)
			{
				System.out.println("hola == adios");
			}
		}		
	
	}
		
	
}
