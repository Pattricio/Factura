package cl.stomas.factura.negocio.model.copy.copy;

public class ProductoModel {

	private Long id;
	private String nombre;
	private String descripcion;
	private String codigo;
	private Long cantidad;
	/**
	 * 
	 */
	public ProductoModel() {
		super();
	}
	/**
	 * @param id
	 * @param nombre
	 * @param descripcion
	 * @param codigo
	 * @param cantidad
	 */
	public ProductoModel(Long id, String nombre, String descripcion, String codigo, Long cantidad) {
		super();
		setId(id);
		setNombre(nombre);
		setDescripcion(descripcion);
		setCodigo(codigo);
		setCantidad(cantidad);
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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the cantidad
	 */
	public Long getCantidad() {
		return cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
