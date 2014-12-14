package pe.com.siraywasi.dao;

import java.util.List;

import pe.com.siraywasi.model.MateriaPrima;
import pe.com.siraywasi.model.dto.MateriaPrimaDTO;

public interface MateriaPrimaDao {
	public List<MateriaPrimaDTO> listadoMateriaPrima();
	public boolean registrarMateriaPrima(MateriaPrima materiaPrima);
	public boolean eliminarMateriaPrima(int idMateriaPrima);
}
