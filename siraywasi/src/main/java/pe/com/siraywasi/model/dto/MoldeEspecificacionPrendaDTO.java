package pe.com.siraywasi.model.dto;

public class MoldeEspecificacionPrendaDTO {
	private int idMolde;
	private String nombreMolde;
	private String nombreCliente;
	private String estado;
	
	public MoldeEspecificacionPrendaDTO(int idMolde, String nombreMolde,
			String nombreCliente, String estado) {
		this.idMolde = idMolde;
		this.nombreMolde = nombreMolde;
		this.nombreCliente = nombreCliente;
		this.estado = estado;
	}
	public MoldeEspecificacionPrendaDTO() {
	}
	public int getIdMolde() {
		return idMolde;
	}
	public void setIdMolde(int idMolde) {
		this.idMolde = idMolde;
	}
	public String getNombreMolde() {
		return nombreMolde;
	}
	public void setNombreMolde(String nombreMolde) {
		this.nombreMolde = nombreMolde;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
