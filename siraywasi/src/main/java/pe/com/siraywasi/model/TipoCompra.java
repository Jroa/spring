package pe.com.siraywasi.model;

public class TipoCompra {
	private int idTipoCompra;
	private String nombreTipoCompra;
	
	
	
	public TipoCompra() {
	}
	public TipoCompra(int idTipoCompra, String nombreTipoCompra) {
		this.idTipoCompra = idTipoCompra;
		this.nombreTipoCompra = nombreTipoCompra;
	}
	public int getIdTipoCompra() {
		return idTipoCompra;
	}
	public void setIdTipoCompra(int idTipoCompra) {
		this.idTipoCompra = idTipoCompra;
	}
	public String getNombreTipoCompra() {
		return nombreTipoCompra;
	}
	public void setNombreTipoCompra(String nombreTipoCompra) {
		this.nombreTipoCompra = nombreTipoCompra;
	}
	
	
}
