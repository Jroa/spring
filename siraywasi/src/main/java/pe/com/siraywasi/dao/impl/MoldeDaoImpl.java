package pe.com.siraywasi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pe.com.siraywasi.dao.MoldeDao;
import pe.com.siraywasi.model.dto.MoldeEspecificacionPrendaDTO;

@Repository
public class MoldeDaoImpl implements MoldeDao {

	@Override
	public List<MoldeEspecificacionPrendaDTO> listadoMoldeEspecificacionPrenda() {
		List<MoldeEspecificacionPrendaDTO> listadoMoldeEspecificacionPrenda = new ArrayList<MoldeEspecificacionPrendaDTO>();
		MoldeEspecificacionPrendaDTO moldeEspecificacionPrendaDTO = null;
		
		moldeEspecificacionPrendaDTO = new MoldeEspecificacionPrendaDTO(1,"Casaca Polar", "Plaza Vea", "Asignado");
		listadoMoldeEspecificacionPrenda.add(moldeEspecificacionPrendaDTO);

		moldeEspecificacionPrendaDTO = new MoldeEspecificacionPrendaDTO(2,"Pantalon Kids", "Plaza Vea", "Pendiente");
		listadoMoldeEspecificacionPrenda.add(moldeEspecificacionPrendaDTO);

		moldeEspecificacionPrendaDTO = new MoldeEspecificacionPrendaDTO(3,"Blusa Set", "Plaza Vea", "Pendiente");
		listadoMoldeEspecificacionPrenda.add(moldeEspecificacionPrendaDTO);
		
		moldeEspecificacionPrendaDTO = new MoldeEspecificacionPrendaDTO(4,"Falda Set", "Plaza Vea", "Pendiente");
		listadoMoldeEspecificacionPrenda.add(moldeEspecificacionPrendaDTO);

		return listadoMoldeEspecificacionPrenda;
	}

}
