package pe.com.siraywasi.model;

public class MoldeConfeccion {
	private int idMolde;
	private int idMoldeConfeccion;
	private String nombreConfeccion;
	private String detalleConfeccion;
	
	public int getIdMolde() {
		return idMolde;
	}
	public void setIdMolde(int idMolde) {
		this.idMolde = idMolde;
	}
	public int getIdMoldeConfeccion() {
		return idMoldeConfeccion;
	}
	public void setIdMoldeConfeccion(int idMoldeConfeccion) {
		this.idMoldeConfeccion = idMoldeConfeccion;
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
}
