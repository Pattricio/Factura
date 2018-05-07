package cl.stomas.factura.negocio.model.copy.copy2;

public class EmpresaModel {

	private Long id;
	private String nombre;
	private String razonSocial;
	private String rut;	
	private String direccion;
	
	/**
	 * 
	 */
	public EmpresaModel() {
		super();
	}
	/**
	 * @param id
	 * @param nombre
	 * @param razonSocial
	 * @param direccion
	 */
	public EmpresaModel(Long id, String nombre, String razonSocial, String rut, String direccion) {
		super();
		setId(id);
		setNombre(nombre);
		setRazonSocial(razonSocial);
		setRut(rut);
		setDireccion(direccion);
		
	}
	
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the razonSocial
	 */
	public String getRazonSocial() {
		return razonSocial;
	}
	/**
	 * @param razonSocial the razonSocial to set
	 */
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
