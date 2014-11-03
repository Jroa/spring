package pe.com.siraywasi.model;

public class Prenda {
	private int idPrenda;
	private String nombrePrenda;
	
	public Prenda(){}
	
	public Prenda(int idPrenda, String nombrePrenda) {
		this.idPrenda = idPrenda;
		this.nombrePrenda = nombrePrenda;
	}
	public int getIdPrenda() {
		return idPrenda;
	}
	public void setIdPrenda(int idPrenda) {
		this.idPrenda = idPrenda;
	}
	public String getNombrePrenda() {
		return nombrePrenda;
	}
	public void setNombrePrenda(String nombrePrenda) {
		this.nombrePrenda = nombrePrenda;
	}
	
	
}
