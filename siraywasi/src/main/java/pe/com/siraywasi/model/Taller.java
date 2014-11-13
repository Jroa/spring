package pe.com.siraywasi.model;

public class Taller {
	private int idTaller;
	private String nombreTaller;
	
	public Taller() {
	}

	public Taller(int idTaller, String nombreTaller) {
		this.idTaller = idTaller;
		this.nombreTaller = nombreTaller;
	}

	public int getIdTaller() {
		return idTaller;
	}

	public void setIdTaller(int idTaller) {
		this.idTaller = idTaller;
	}

	public String getNombreTaller() {
		return nombreTaller;
	}

	public void setNombreTaller(String nombreTaller) {
		this.nombreTaller = nombreTaller;
	}
}
