package pe.com.siraywasi.dao;

import java.util.List;

import pe.com.siraywasi.model.dto.MoldeMedidaTallaDTO;

public interface MoldeMedidaTallaDao {
	public List<MoldeMedidaTallaDTO> listadoMoldeMedidaTalla(int idMolde, String tipoTalla);
}
