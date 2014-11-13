package pe.com.siraywasi.dao;

import java.util.List;

import pe.com.siraywasi.model.dto.MoldeOperacionDTO;

public interface MoldeOperacionDao {
	public List<MoldeOperacionDTO> listadoMoldeOperacion (int idMolde);
}
