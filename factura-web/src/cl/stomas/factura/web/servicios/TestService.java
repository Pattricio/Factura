package cl.stomas.factura.web.servicios;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import cl.stomas.factura.negocio.model.EmpresaModel;
import cl.stomas.factura.negocio.model.FacturaModel;
import cl.stomas.factura.negocio.model.ProductoModel;

@Path("/test")
public interface TestService {
	
	@POST
	@Produces(MediaType.APPLICATION_JSON+";charset=utf-8")
	@Path("/guardarProducto")
	Response guardarProducto(final ProductoModel model);
	
	@POST
	@Produces(MediaType.APPLICATION_JSON+";charset=utf-8")
	@Path("/actualizarProducto")
	Response actualizarProducto(final ProductoModel model);
	
	@POST
	@Produces(MediaType.APPLICATION_JSON+";charset=utf-8")
	@Path("/eliminarProducto")
	Response eliminarProducto(final ProductoModel model);
	
	@POST
	@Produces(MediaType.APPLICATION_JSON+";charset=utf-8")
	@Path("/guardarEmpresa")
	Response guardarEmpresa(final EmpresaModel empresaModel);
	
	@POST
	@Produces(MediaType.APPLICATION_JSON+";charset=utf-8")
	@Path("/actualizarEmpresa")
	Response actualizarEmpresa(final EmpresaModel empresaModel);
	
	@POST
	@Produces(MediaType.APPLICATION_JSON+";charset=utf-8")
	@Path("/eliminarEmpresa")
	Response eliminarEmpresa(final EmpresaModel empresaModel);

	@POST
	@Produces(MediaType.APPLICATION_JSON+";charset=utf-8")
	@Path("/buscarProducto")
	Response buscarProducto(final ProductoModel productoModel);
	
	@POST
	@Produces(MediaType.APPLICATION_JSON+";charset=utf-8")
	@Path("/buscarEmpresa")
	Response buscarEmpresa(final EmpresaModel empresaModel);
	
	@POST
	@Produces(MediaType.APPLICATION_JSON+";charset=utf-8")
	@Path("/guardarFactura")
	Response guardarFactura(final FacturaModel facturaModel);
	
	@POST
	@Produces(MediaType.APPLICATION_JSON+";charset=utf-8")
	@Path("/buscarFactura")
	Response buscarFactura(final FacturaModel facturaModel);
	
	
	


}
