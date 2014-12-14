package pe.com.siraywasi.model;

public class MoldeAvio {
	private int idMoldeAvio;
	private int idMolde;
	private int idAvio;
	
	
	
	public MoldeAvio() {
	}
	public MoldeAvio(int idMoldeAvio, int idMolde, int idAvio) {
		this.idMoldeAvio = idMoldeAvio;
		this.idMolde = idMolde;
		this.idAvio = idAvio;
	}
	public int getIdMolde() {
		return idMolde;
	}
	public void setIdMolde(int idMolde) {
		this.idMolde = idMolde;
	}
	public int getIdMoldeAvio() {
		return idMoldeAvio;
	}
	public void setIdMoldeAvio(int idMoldeAvio) {
		this.idMoldeAvio = idMoldeAvio;
	}
	public int getIdAvio() {
		return idAvio;
	}
	public void setIdAvio(int idAvio) {
		this.idAvio = idAvio;
	}
	
	
}
