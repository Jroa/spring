package pe.com.siraywasi.web.form;

public class MoldeConfeccionListaForm {
	private int idMolde;
	private int idMoldeConfeccion;
	private String nombreConfeccion;
	private String detalleConfeccion;
	
	
	
	public MoldeConfeccionListaForm() {
	}

	public MoldeConfeccionListaForm(int idMolde, int idMoldeConfeccion,
			String nombreConfeccion, String detalleConfeccion) {
		this.idMolde = idMolde;
		this.idMoldeConfeccion = idMoldeConfeccion;
		this.nombreConfeccion = nombreConfeccion;
		this.detalleConfeccion = detalleConfeccion;
	}

	public int getIdMolde() {
		return idMolde;
	}
	public void setIdMolde(int idMolde) {
		this.idMolde = idMolde;
	}
	public String getNombreConfeccion() {
		return nombreConfeccion;
	}
	public void setNombreConfeccion(String nombreConfeccion) {
		this.nombreConfeccion = nombreConfeccion;
	}
	public String getDetalleConfeccion() {
		return detalleConfeccion;
	}
	public void setDetalleConfeccion(String detalleConfeccion) {
		this.detalleConfeccion = detalleConfeccion;
	}

	public int getIdMoldeConfeccion() {
		return idMoldeConfeccion;
	}

	public void setIdMoldeConfeccion(int idMoldeConfeccion) {
		this.idMoldeConfeccion = idMoldeConfeccion;
	}
	
	
}
