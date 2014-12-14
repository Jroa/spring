package pe.com.siraywasi.model;

public class MoldeMedida {
	private int idMoldeMedida;
	private int idMolde;
	private String nombreMoldeMedida;
	
	
	
	public MoldeMedida() {
	}
	public MoldeMedida(int idMoldeMedida, int idMolde, String nombreMoldeMedida) {
		this.idMoldeMedida = idMoldeMedida;
		this.idMolde = idMolde;
		this.nombreMoldeMedida = nombreMoldeMedida;
	}
	public int getIdMolde() {
		return idMolde;
	}
	public void setIdMolde(int idMolde) {
		this.idMolde = idMolde;
	}
	public int getIdMoldeMedida() {
		return idMoldeMedida;
	}
	public void setIdMoldeMedida(int idMoldeMedida) {
		this.idMoldeMedida = idMoldeMedida;
	}
	public String getNombreMoldeMedida() {
		return nombreMoldeMedida;
	}
	public void setNombreMoldeMedida(String nombreMoldeMedida) {
		this.nombreMoldeMedida = nombreMoldeMedida;
	}
	
	
}
