package pe.com.siraywasi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.siraywasi.dao.MarcaDao;
import pe.com.siraywasi.dao.MateriaPrimaDao;
import pe.com.siraywasi.dao.ProveedorDao;
import pe.com.siraywasi.dao.TipoCompraDao;
import pe.com.siraywasi.dao.UnidadMedidaDao;
import pe.com.siraywasi.model.Marca;
import pe.com.siraywasi.model.Proveedor;
import pe.com.siraywasi.model.TipoCompra;
import pe.com.siraywasi.model.UnidadMedida;
import pe.com.siraywasi.model.dto.MateriaPrimaDTO;
import pe.com.siraywasi.service.MateriaPrimaService;

@Service
public class MateriaPrimaServiceImpl implements MateriaPrimaService {

	@Autowired
	private MateriaPrimaDao materiaPrimaDao;
	
	@Autowired
	private MarcaDao marcaDao;
	
	@Autowired
	private ProveedorDao proveedorDao;
	
	@Autowired
	private TipoCompraDao tipoCompraDao;
	
	@Autowired
	private UnidadMedidaDao unidadMedidaDao;
	
	@Override
	public List<MateriaPrimaDTO> listadoMateriaPrima() {
		List<MateriaPrimaDTO> listadoMateriaPrima = materiaPrimaDao.listadoMateriaPrima();
		return listadoMateriaPrima;
	}

	@Override
	public List<Marca> listadoMarca() {
		List<Marca> listadoMarca = marcaDao.listadoMarca();
		return listadoMarca;
	}

	@Override
	public List<Proveedor> listadoProveedor() {
		List<Proveedor> listadoProveedor = proveedorDao.listadoProveedor();
		return listadoProveedor;
	}

	@Override
	public List<TipoCompra> listadoTipoCompra() {
		List<TipoCompra> listadoTipoCompra = tipoCompraDao.listadoTipoCompra();
		return listadoTipoCompra;
	}

	@Override
	public List<UnidadMedida> listadoUnidadMedida() {
		List<UnidadMedida> listadoUnidadMedida = unidadMedidaDao.listadoUnidadMedida();
		return listadoUnidadMedida;
	}
	
	
}
