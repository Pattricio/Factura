package cl.stomas.factura.web.api;

import javax.ws.rs.core.Response;
/**
 * Clase que pone a disposicion de los servicios funcionalidades comunes.
 * @author JeyPablic
 *
 */
public class BaseServicio {
	
    private static final String CACHE_CONTROL = "Cache-Control";
    private static final String NO_CACHE = "no-cache";
    private static final String EXPIRES = "Expires";
    private static final String PRAGMA = "Pragma";
    private static final Integer EXPIRE_TIME = 0;

    /**
     * Constructor de la clase.
     */
    public BaseServicio() {
        super();
    }
	
    /**
     * Metodo que construye el response para un servicio determinado.
     * 
     * @param respuesta objeto con los datos a devolver
     * @return objeto reponse
     */
	public Response construirrespuesta(final Respuesta<?> respuesta){
		return Response.ok(respuesta).header(CACHE_CONTROL, NO_CACHE).header(PRAGMA, NO_CACHE)
                .header(EXPIRES, EXPIRE_TIME).build();
	}

}
