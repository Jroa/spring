package pe.com.siraywasi.model;

public class TipoTela {
	private int idTipoTela;
	private String nombreTipoTela;
	
	public TipoTela() {
	}

	public TipoTela(int idTipoTela, String nombreTipoTela) {
		this.idTipoTela = idTipoTela;
		this.nombreTipoTela = nombreTipoTela;
	}

	public int getIdTipoTela() {
		return idTipoTela;
	}

	public void setIdTipoTela(int idTipoTela) {
		this.idTipoTela = idTipoTela;
	}

	public String getNombreTipoTela() {
		return nombreTipoTela;
	}

	public void setNombreTipoTela(String nombreTipoTela) {
		this.nombreTipoTela = nombreTipoTela;
	}
	

	
	
}
