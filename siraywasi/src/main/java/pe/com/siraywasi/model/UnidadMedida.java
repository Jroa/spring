package pe.com.siraywasi.model;

public class UnidadMedida {
	private int idUnidadMedida;
	private String nombreUnidadMedida;
	
	
	
	public UnidadMedida() {
	}
	public UnidadMedida(int idUnidadMedida, String nombreUnidadMedida) {
		this.idUnidadMedida = idUnidadMedida;
		this.nombreUnidadMedida = nombreUnidadMedida;
	}
	public int getIdUnidadMedida() {
		return idUnidadMedida;
	}
	public void setIdUnidadMedida(int idUnidadMedida) {
		this.idUnidadMedida = idUnidadMedida;
	}
	public String getNombreUnidadMedida() {
		return nombreUnidadMedida;
	}
	public void setNombreUnidadMedida(String nombreUnidadMedida) {
		this.nombreUnidadMedida = nombreUnidadMedida;
	}
}
