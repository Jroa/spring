package pe.com.siraywasi.service;

import java.util.List;

import pe.com.siraywasi.model.dto.MoldeEspecificacionPrendaDTO;
import pe.com.siraywasi.model.dto.MoldeOperacionDTO;

public interface MoldeService {
	public List<MoldeOperacionDTO> listadoMoldeOperacion (int idMolde);
	public List<MoldeEspecificacionPrendaDTO> listadoMoldeEspecificacionPrenda(); 
}
