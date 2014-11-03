package pe.com.siraywasi.model;

public class TipoTela {
	private int idTipoTela;
	private String nombreTela;
	
	public TipoTela() {
	}
	
	public TipoTela(int idTipoTela, String nombreTela) {
		this.idTipoTela = idTipoTela;
		this.nombreTela = nombreTela;
	}
	
	public int getIdTipoTela() {
		return idTipoTela;
	}
	public void setIdTipoTela(int idTipoTela) {
		this.idTipoTela = idTipoTela;
	}
	public String getNombreTela() {
		return nombreTela;
	}
	public void setNombreTela(String nombreTela) {
		this.nombreTela = nombreTela;
	}
	
	
}
