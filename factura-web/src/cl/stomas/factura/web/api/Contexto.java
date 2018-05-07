
package cl.stomas.factura.web.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Clase que disponibiliza contexto rest para la aplicacion.
 * 
 * @author JeyPablic
 */
@ApplicationPath("/rest-services")
public class Contexto extends Application {

	public Contexto() {
		super();
	}
}
