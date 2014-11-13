package pe.com.siraywasi.model;

public class Avio {
	private int idAvio;
	private String nombreAvio;
	
	public Avio() {
	}
	
	public Avio(int idAvio, String nombreAvio) {
		this.idAvio = idAvio;
		this.nombreAvio = nombreAvio;
	}

	public int getIdAvio() {
		return idAvio;
	}
	public void setIdAvio(int idAvio) {
		this.idAvio = idAvio;
	}
	public String getNombreAvio() {
		return nombreAvio;
	}
	public void setNombreAvio(String nombreAvio) {
		this.nombreAvio = nombreAvio;
	}
	
	
}
