package pe.com.siraywasi.service;

import java.util.List;

import pe.com.siraywasi.model.Marca;
import pe.com.siraywasi.model.Proveedor;
import pe.com.siraywasi.model.TipoCompra;
import pe.com.siraywasi.model.UnidadMedida;
import pe.com.siraywasi.model.dto.MateriaPrimaDTO;

public interface MateriaPrimaService {
	public List<MateriaPrimaDTO> listadoMateriaPrima();
	public List<Marca> listadoMarca();
	public List<Proveedor> listadoProveedor();
	public List<TipoCompra> listadoTipoCompra();
	public List<UnidadMedida> listadoUnidadMedida();
}
