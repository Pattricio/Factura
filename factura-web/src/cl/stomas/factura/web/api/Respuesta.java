package cl.stomas.factura.web.api;

/**
 * Clase que representa la estructura para respuesta de los servicios.
 * 
 * @author JeyPablic
 * @param <T>
 */
public class Respuesta<T> {

	private boolean estado;
	private Long total;
	private String error;
	private T data;
	
    /**
     * Constructor de la clase.
     */
	public Respuesta() {
		super();
	}

	/**
     * Constructor de la clase. Permite setear el valor a la variable success.
     * 
     * @param success valor a setear
     */
	public Respuesta(final boolean estado) {
		super();
		this.setEstado(estado);	
	}
	
	/**
     * Permite obtener el valor almacenado en la variable data.
     * 
     * @return valor almacenado
     */
    public T getData() {
        return this.data;
    }

    /**
     * Permite setear el valor a la variable data.
     * 
     * @param data objeto a almacenar en la variable data
     */
    public void setData(final T data) {
        this.data = data;
    }

    /**
     * Permite setear el valor a la variable total.
     * 
     * @param total valor a setear
     */
    public void setTotal(final Long total) {
        this.total = total;
    }

    /**
     * Permite setear el valor a la variable total.
     * 
     * @param total valor a setear
     */
    public void setTotal(final Integer total) {
        this.total = Long.valueOf(total.longValue());
    }

    /**
     * Permite obtener el valor almacenado en la variable total.
     * 
     * @return valor variable total
     */
    public Long getTotal() {
        return this.total;
    }

    /**
     * Permite obtener el valor de la variable success.
     * 
     * @return valor variable estado
     */
    public boolean isEstado() {
        return this.estado;
    }

    /**
     * Permite setear el valor a la variable success.
     * 
     * @param estado valor a setear
     */
    public void setEstado(final boolean estado) {
        this.estado = estado;
    }

    /**
     * Permite obtener el valor de la variable error.
     * 
     * @return valor variable error
     */
    public String getError() {
        return this.error;
    }

    /**
     * Permite setear el valor a la variable error.
     * 
     * @param error valor a setear
     */
    public void setError(final String error) {
        this.error = error;
    }
}
