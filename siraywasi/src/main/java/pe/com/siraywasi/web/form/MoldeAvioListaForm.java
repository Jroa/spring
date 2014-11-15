package pe.com.siraywasi.web.form;

public class MoldeAvioListaForm {
	private int idAvio;
	private String nombreAvio;
	private String estado;
	
	
	
	public MoldeAvioListaForm() {
	}
	public MoldeAvioListaForm(int idAvio, String nombreAvio, String estado) {
		this.idAvio = idAvio;
		this.nombreAvio = nombreAvio;
		this.estado = estado;
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
