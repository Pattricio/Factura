package cl.stomas.factura.negocio.model.copy2;

import java.util.List;

// import cl.stomas.factura.entidades.Empresa;
// import cl.stomas.factura.entidades.Producto;

public class FacturaModel {
	
	private Long id;
	private EmpresaModel empresa;
	private List<ProductoModel> productos;
	/**
	 * 
	 */
	public FacturaModel() {
		super();
	
	}
	/**
	 * @param id
	 * @param empresa
	 * @param productos
	 */
	public FacturaModel(Long id, EmpresaModel empresa, List<ProductoModel> productos) {
		super();
		setId(id);
		setEmpresa(empresa);
		setProductos(productos);
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
	 * @return the empresa
	 */
	public EmpresaModel getEmpresa() {
		return empresa;
	}
	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(EmpresaModel empresa) {
		this.empresa = empresa;
	}
	/**
	 * @return the productos
	 */
	public List<ProductoModel> getProductos() {
		return productos;
	}
	/**
	 * @param productos the productos to set
	 */
	public void setProductos(List<ProductoModel> productos) {
		this.productos = productos;
	}
	
	

}
