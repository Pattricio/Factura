package cl.stomas.factura.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name="seq_factura", sequenceName="seq_factura", allocationSize = 1, initialValue = 1)
@Table(name="factura")
public class Factura implements Serializable{

	private static final long serialVersionUID = 2413750888243186905L;
	
	@Id
	@GeneratedValue(generator="seq_factura", strategy = GenerationType.SEQUENCE)
	@Column(name="factura_id")
	private long id;
	
	@ManyToOne
	@JoinColumn(name="empresa")
	private Empresa empresa;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name="factura_producto", 
		joinColumns = {@JoinColumn(name="factura_id")},
		inverseJoinColumns = {@JoinColumn(name = "producto_id")}
	)
	
	
	private List<Producto> productos = new ArrayList<Producto>();

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the empresa
	 */
	public Empresa getEmpresa() {
		return empresa;
	}

	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	/**
	 * @return the productos
	 */
	public List<Producto> getProductos() {
		return productos;
	}

	/**
	 * @param productos the productos to set
	 */
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
}
