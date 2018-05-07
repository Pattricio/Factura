package cl.stomas.factura.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import cl.stomas.factura.entidades.Empresa;
import cl.stomas.factura.entidades.Factura;
import cl.stomas.factura.entidades.Producto;
import cl.stomas.factura.negocio.model.EmpresaModel;
import cl.stomas.factura.negocio.model.FacturaModel;
import cl.stomas.factura.negocio.model.ProductoModel;

@Stateless
@Named(TestNegocio.NAME)
public class TestNegocio {
	
	/**
	 * Constante que define el nombre de la clase.
	 */
	public static final String NAME = "TestNegocio";
	
	/**
	 * Unidad de persistenca, objeto con el cual se pueden realizar las operaciones en base de datos.
	 * el nombre esta definido en el archivo Persistence.xml
	 */
	@PersistenceContext(name ="basePersist")
	private EntityManager em;
	
	/**
	 * Constructor de la clase.
	 */
	public TestNegocio(){
		super();
	}
	
	/**
	 * Metodo que se encara de realizar la logica necesaria.
	 * 
	 * @return String
	 */
	public String negocioTest(){
		return "testeando negocio...";
	}
	
	/**
	 * Metodo que se encarga de guardar un producto.
	 * 
	 * @param productoModel ProductoModel
	 */
	public String guardarProducto(final ProductoModel productoModel) {
		
		String respuesta = "Producto: ";
		Producto p;
		if(null == productoModel.getId()) {
			if(validarProducto(productoModel)== true)
			{
				p = new Producto();
				prepareProducto(p, productoModel);
				em.persist(p);
				respuesta = respuesta+"Creado con exito";
			}
			else
			{
				respuesta = respuesta+"Los campos no pueden estar vacios";
			}
		}else {
			if(validarProducto(productoModel)== true)
			{
				p = em.find(Producto.class, productoModel.getId());
				prepareProducto(p, productoModel);
				em.merge(p);
				respuesta = respuesta+"Actualizado con exito";
			}
			else
			{
				respuesta = respuesta+"Los campos no pueden estar vacios";
			}
		}
		return respuesta;
	}
	
	public String actualizarProducto(final ProductoModel productoModel) {
		
		String respuesta = "Producto: ";
		Producto p;
		
		if(null == productoModel.getId()) {
			if(validarProducto(productoModel)== true)
			{
				p = new Producto();
				prepareProducto(p, productoModel);
				em.persist(p);
				respuesta = respuesta+"Creado con exito";
			}
			else
			{
				respuesta = respuesta+"Los campos no pueden estar vacios";
			}
		}else {
			if(validarProducto(productoModel)== true)
			{
				p = em.find(Producto.class, productoModel.getId());
				
				prepareProducto(p, productoModel);
				em.merge(p);
				respuesta = respuesta+"Actualizado con exito";
			}
			else
			{
				respuesta = respuesta+"Los campos no pueden estar vacios";
			}
		}
		return respuesta;
	}
	public String eliminarProducto(final ProductoModel productoModel) {
		String respuesta = "Producto: ";
		Producto p;
		if(!productoModel.getId().toString().trim().isEmpty())
		{
					
				p = em.find(Producto.class, productoModel.getId());				
				prepareProducto(p, productoModel);
				em.remove(p);
				respuesta = respuesta+"Borrado con exito";
		}
		else
		{
			respuesta = respuesta+"Los campos no pueden estar vacios";
		}				
		return respuesta;
	}

	public String guardarEmpresa(final EmpresaModel empresaModel) {
		
		String respuesta = "Empresa: ";
		Empresa e;
		
		
		if(null == empresaModel.getId()) {
			
			if(validarEmpresa(empresaModel) == true)
			{
				
				e = new Empresa();
				prepareEmpresa(e, empresaModel);
				em.persist(e);
				respuesta = respuesta+"Creado con exito";
			}
			else
			{
				respuesta = respuesta+"Los campos no pueden estar vacios";
			}
			
		}else {
			if(validarEmpresa(empresaModel) == true)
			{
				e = em.find(Empresa.class, empresaModel.getId());
				prepareEmpresa(e, empresaModel);
				em.merge(e);
				respuesta = respuesta+"Actualizado con exito";
			}
			else
			{
				respuesta = respuesta+"Los campos no pueden estar vacios";
			}
		}
		return respuesta;
	}
	
	public String actualizarEmpresa(final EmpresaModel empresaModel) {
		
		String respuesta = "Empresa: ";
		Empresa e;
		
		if(null == empresaModel.getId()) {
			if(validarEmpresa(empresaModel) == true)
			{
				e = new Empresa();
				prepareEmpresa(e, empresaModel);
				em.merge(e);
				respuesta = respuesta+"Actualizado con exito";
			}
			else
			{
				respuesta = respuesta+"Los campos no pueden estar vacios";
			}
		}else {
			if(validarEmpresa(empresaModel) == true)
			{
				e = new Empresa();
				prepareEmpresa(e, empresaModel);
				em.merge(e);
				respuesta = respuesta+"Actualizado con exito";
			}
			else
			{
				respuesta = respuesta+"Los campos no pueden estar vacios";
			}
		}
		return respuesta;
	}
	
	public String eliminarEmpresa(final EmpresaModel empresaModel) {
		
		String respuesta = "Empresa: ";
		Empresa e;
			
		e = em.find(Empresa.class, empresaModel.getId());
		prepareEmpresa(e, empresaModel);
		em.remove(e);
		respuesta = respuesta+"Actualizado con exito";
	
		return respuesta;
	}
	
	public String buscarProducto(ProductoModel productoModel)
	{
		String respuesta = "";
		Producto b;
			
		b = em.find(Producto.class, productoModel.getId());
		
		List<Producto> producto = new ArrayList<Producto>();
		
		producto.add(b);
		respuesta = "Nombre: " + b.getNombre() +" Codigo: "+ b.getCodigo() +" Descripcion: "+ b.getDescripcion() +" Cantidad: "+ b.getCantidad();
		
		
	
		return respuesta;		
	}
	
	public String buscarEmpresa(EmpresaModel empresaModel)
	{
		String respuesta = "";
		Empresa e;
			
		e = em.find(Empresa.class, empresaModel.getId());
		
		respuesta = "Nombre de la empresa: " + e.getNombre() +" Razon social: "+ e.getRazonSocial() +" Rut: "+ e.getRut() +" Direccion: "+ e.getDireccion();
			
	
		return respuesta;		
	}		
	
	public String guardarFactura(final FacturaModel facturaModel) {
		
		
		String respuesta = "Factura: ";
		List<Producto> productos = new ArrayList<Producto>();	
		Factura f;
		f = new Factura();
		Query q = em.createQuery("select e from Empresa e where e.rut = :rut");
		q.setParameter("rut", facturaModel.getEmpresa().getRut());
		Empresa e = (Empresa)q.getSingleResult();
		
		
		for(int i = 0; i < facturaModel.getProductos().size(); i++)
		{	
		  Query q2 = em.createQuery("select p from Producto p where p.codigo = :codigo");
		  q2.setParameter("codigo", facturaModel.getProductos().get(i).getCodigo());
		  Producto p = (Producto)q2.getSingleResult();		  
		  productos.add(p);		  
		}		
		
		f.setEmpresa(e);
		f.setProductos(productos);		
		em.persist(f);
		respuesta = respuesta+"Creada con exito";
			
		return respuesta;
	}
	public String buscarFactura(FacturaModel facturaModel)
	{
		String respuesta = "";
		Factura f;
			
		f = em.find(Factura.class, facturaModel.getId());
		
		respuesta = "Rut de la empresa: " + f.getEmpresa().getRut() +" Nombre del producto: "+ f.getProductos().get(0).getNombre() + " Cantidad del producto: "+ f.getProductos().get(0).getCantidad();
			
	
		return respuesta;		
	}
	
	
	
	
	
	
	/**
	 * Metodo que se encarga de tomar los valores que vienen en el modelo, y setearlos en el objeto que se guardara.
	 * En este metodo es posible realizar las validaciones antes de guardar un elemento, ya sea para crear uno 
	 * nuevo, o para actualizar uno ya existente.
	 * 
	 * @param p Producto (Entidad)
	 * @param productoModel ProductoModel (Modelo)
	 */
	private void prepareProducto(final Producto p, final ProductoModel productoModel) {
		if(null != productoModel.getId()) {
			p.setId(productoModel.getId());
		}
		if(null != productoModel.getNombre() && productoModel.getNombre().trim().length() >= 1) {
			p.setNombre(productoModel.getNombre());
		}
		if(null != productoModel.getDescripcion()) {
			p.setDescripcion(productoModel.getDescripcion());
		}
		if(null != productoModel.getCodigo()) {
			p.setCodigo(productoModel.getCodigo());
		}
		if(null != productoModel.getCantidad()) {
			p.setCantidad(productoModel.getCantidad());
		}
	}
	private boolean validarProducto(final ProductoModel productoModel)
	{
		if(null != productoModel.getNombre() && productoModel.getNombre().trim().length() >= 1) 
		{
			if(null != productoModel.getDescripcion() && productoModel.getDescripcion().trim().length() >= 1)
			{
				if(null != productoModel.getCodigo() && productoModel.getCodigo().trim().length() >= 1)
				{
					if(null != productoModel.getCantidad() && productoModel.getCantidad().toString().trim().length() >= 1)
					{						
						return true;
					}
				}
			}			
		}
		return false;
	}
	
	
	private void prepareEmpresa(final Empresa e, final EmpresaModel empresaModel) {
		
		if(null != empresaModel.getId()) {
			e.setId(empresaModel.getId());
		}
		if(null != empresaModel.getNombre() && empresaModel.getNombre().trim().length() >= 1) {
			e.setNombre(empresaModel.getNombre());
		}
		if(null != empresaModel.getRazonSocial()) {
			e.setRazonSocial(empresaModel.getRazonSocial());
		}
		if(null != empresaModel.getRut()) {
			e.setRut(empresaModel.getRut());
		}
		if(null != empresaModel.getDireccion()) {
			e.setDireccion(empresaModel.getDireccion());
		}
	}
	
	private boolean validarEmpresa(final EmpresaModel empresaModel)
	{
		if(null != empresaModel.getNombre() && empresaModel.getNombre().trim().length() >= 1) 
		{
			if(null != empresaModel.getRazonSocial() && empresaModel.getRazonSocial().trim().length() >= 1)
			{
				if(null != empresaModel.getRut() && empresaModel.getRut().trim().length() >= 1)
				{
					if(null != empresaModel.getDireccion() && empresaModel.getDireccion().trim().length() >= 1)
					{
						return true;
					}
				}
			}			
		}
		return false;
	}
	
		
	

}
