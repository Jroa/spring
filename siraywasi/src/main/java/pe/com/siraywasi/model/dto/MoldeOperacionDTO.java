package pe.com.siraywasi.model.dto;

public class MoldeOperacionDTO {
	private int idMolde;
	private int idOperacion;
	private String nombreOperacion;
	
	
	
	public MoldeOperacionDTO(int idMolde, int idOperacion,
			String nombreOperacion) {
		this.idMolde = idMolde;
		this.idOperacion = idOperacion;
		this.nombreOperacion = nombreOperacion;
	}
	public MoldeOperacionDTO() {
	}
	public int getIdMolde() {
		return idMolde;
	}
	public void setIdMolde(int idMolde) {
		this.idMolde = idMolde;
	}
	public int getIdOperacion() {
		return idOperacion;
	}
	public void setIdOperacion(int idOperacion) {
		this.idOperacion = idOperacion;
	}
	public String getNombreOperacion() {
		return nombreOperacion;
	}
	public void setNombreOperacion(String nombreOperacion) {
		this.nombreOperacion = nombreOperacion;
	}
	
}
