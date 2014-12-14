package pe.com.siraywasi.service;

import java.util.List;

import pe.com.siraywasi.model.Avio;
import pe.com.siraywasi.model.Molde;
import pe.com.siraywasi.model.MoldeAvio;
import pe.com.siraywasi.model.MoldeConfeccion;
import pe.com.siraywasi.model.MoldeMedida;
import pe.com.siraywasi.model.MoldeMedidaTalla;
import pe.com.siraywasi.model.dto.MoldeEspecificacionPrendaDTO;
import pe.com.siraywasi.model.dto.MoldeMedidaTallaDTO;
import pe.com.siraywasi.model.dto.MoldeOperacionDTO;

public interface MoldeService {
	public List<MoldeOperacionDTO> listadoMoldeOperacion (int idMolde);
	public List<MoldeEspecificacionPrendaDTO> listadoMoldeEspecificacionPrenda(); 
	public List<MoldeMedidaTallaDTO> listadoMoldeMedidaTalla(int idMolde, String tipoTalla);
	public List<Avio> listadoAvio();
	
	public int registrarMolde(Molde molde);
	public int registrarMoldeAvio(int idMolde, MoldeAvio moldeAvio);
	public int registrarMoldeMedida(int idMolde, MoldeMedida moldeMedida);
	public int registrarMoldeMedidaTalla(int idMoldeMedida, MoldeMedidaTalla moldeMedidaTalla);
	public int registrarMoldeConfeccion(int idMolde, MoldeConfeccion moldeConfeccion);	
}
