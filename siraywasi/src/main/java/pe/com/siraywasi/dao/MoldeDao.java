package pe.com.siraywasi.dao;

import java.util.List;

import pe.com.siraywasi.model.Molde;
import pe.com.siraywasi.model.MoldeAvio;
import pe.com.siraywasi.model.MoldeConfeccion;
import pe.com.siraywasi.model.MoldeMedida;
import pe.com.siraywasi.model.MoldeMedidaTalla;
import pe.com.siraywasi.model.dto.MoldeEspecificacionPrendaDTO;

public interface MoldeDao {
	public List<MoldeEspecificacionPrendaDTO> listadoMoldeEspecificacionPrenda(); 
	
	public int registrarMolde(Molde molde);
	public int registrarMoldeAvio(int idMolde, MoldeAvio moldeAvio);
	public int registrarMoldeMedida(int idMolde, MoldeMedida moldeMedida);
	public int registrarMoldeMedidaTalla(int idMoldeMedida, MoldeMedidaTalla moldeMedidaTalla);
	public int registrarMoldeConfeccion(int idMolde, MoldeConfeccion moldeConfeccion);
}
