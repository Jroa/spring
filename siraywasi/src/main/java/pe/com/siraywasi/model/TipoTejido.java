package pe.com.siraywasi.model;

public class TipoTejido {
	private int idTipoTejido;
	private String nombreTipoTejido;
	
	public TipoTejido() {
	}

	public TipoTejido(int idTipoTejido, String nombreTipoTejido) {
		this.idTipoTejido = idTipoTejido;
		this.nombreTipoTejido = nombreTipoTejido;
	}

	public int getIdTipoTejido() {
		return idTipoTejido;
	}

	public void setIdTipoTejido(int idTipoTejido) {
		this.idTipoTejido = idTipoTejido;
	}

	public String getNombreTipoTejido() {
		return nombreTipoTejido;
	}

	public void setNombreTipoTejido(String nombreTipoTejido) {
		this.nombreTipoTejido = nombreTipoTejido;
	}
	
	
}
