package cl.stomas.factura.web.servicios;



import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.core.Response;

import cl.stomas.factura.negocio.TestNegocio;
import cl.stomas.factura.negocio.model.EmpresaModel;
import cl.stomas.factura.negocio.model.FacturaModel;
import cl.stomas.factura.negocio.model.ProductoModel;
import cl.stomas.factura.web.api.BaseServicio;
import cl.stomas.factura.web.api.Respuesta;

@RequestScoped
@Named(TestServiceImpl.NAME)
public class TestServiceImpl extends BaseServicio implements TestService {
	
	/**
	 * Constante que define el nombre de la clase.
	 */
	public static final String NAME = "TestServiceImpl";
	
	/**
	 * Se inyecta la clase negocio para utlizar los metodos disponibles.
	 *
	 */
	@Inject
	private TestNegocio testNegocio;
	@Override
	public Response guardarProducto(final ProductoModel producto) {
		final Respuesta<String> respuesta = new Respuesta<String>(true);
		respuesta.setData(testNegocio.guardarProducto(producto));
		respuesta.setTotal(1L);
		return construirrespuesta(respuesta);
	}
		
	@Override
	public Response actualizarProducto(final ProductoModel producto) {
		final Respuesta<String> respuesta = new Respuesta<String>(true);
		respuesta.setData(testNegocio.actualizarProducto(producto));
		respuesta.setTotal(1L);
		return construirrespuesta(respuesta);
	}
	
	@Override
	public Response eliminarProducto(final ProductoModel producto) {
		final Respuesta<String> respuesta = new Respuesta<String>(true);
		respuesta.setData(testNegocio.eliminarProducto(producto));
		respuesta.setTotal(1L);
		return construirrespuesta(respuesta);
	}
	
	@Override
	public Response guardarEmpresa(final EmpresaModel empresaModel) {
		final Respuesta<String> respuesta = new Respuesta<String>(true);
		respuesta.setData(testNegocio.guardarEmpresa(empresaModel));
		respuesta.setTotal(1L);
		return construirrespuesta(respuesta);
	}
	
	@Override
	public Response actualizarEmpresa(final EmpresaModel empresaModel) {
		final Respuesta<String> respuesta = new Respuesta<String>(true);
		respuesta.setData(testNegocio.actualizarEmpresa(empresaModel));
		respuesta.setTotal(1L);
		return construirrespuesta(respuesta);
	}
	
	@Override
	public Response eliminarEmpresa(final EmpresaModel empresaModel) {
		final Respuesta<String> respuesta = new Respuesta<String>(true);
		respuesta.setData(testNegocio.eliminarEmpresa(empresaModel));
		respuesta.setTotal(1L);
		return construirrespuesta(respuesta);
	}
	
	
	@Override
	public Response buscarProducto(final ProductoModel productoModel) {
		final Respuesta<String> respuesta = new Respuesta<String>(true);
		respuesta.setData(testNegocio.buscarProducto(productoModel));
		respuesta.setTotal(1L);
		return construirrespuesta(respuesta);
	}
	
	@Override
	public Response buscarEmpresa(final EmpresaModel empresaModel) {
		final Respuesta<String> respuesta = new Respuesta<String>(true);
		respuesta.setData(testNegocio.buscarEmpresa(empresaModel));
		respuesta.setTotal(1L);
		return construirrespuesta(respuesta);
	}
	
	@Override
	public Response guardarFactura(final FacturaModel facturaModel) {
		final Respuesta<String> respuesta = new Respuesta<String>(true);
		respuesta.setData(testNegocio.guardarFactura(facturaModel));
		respuesta.setTotal(1L);
		return construirrespuesta(respuesta);
	}
	@Override
	public Response buscarFactura(final FacturaModel facturaModel) {
		final Respuesta<String> respuesta = new Respuesta<String>(true);
		respuesta.setData(testNegocio.buscarFactura(facturaModel));
		respuesta.setTotal(1L);
		return construirrespuesta(respuesta);
	}
	

}
