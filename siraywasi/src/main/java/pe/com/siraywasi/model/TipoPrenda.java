package pe.com.siraywasi.model;

public class TipoPrenda {
	private int idTipoPrenda;
	private String nombreTipoPrenda;
	
	public TipoPrenda(){}
	
	public TipoPrenda(int idTipoPrenda, String nombreTipoPrenda) {
		this.idTipoPrenda = idTipoPrenda;
		this.nombreTipoPrenda = nombreTipoPrenda;
	}
	public int getIdTipoPrenda() {
		return idTipoPrenda;
	}
	public void setIdTipoPrenda(int idTipoPrenda) {
		this.idTipoPrenda = idTipoPrenda;
	}
	public String getNombreTipoPrenda() {
		return nombreTipoPrenda;
	}
	public void setNombreTipoPrenda(String nombreTipoPrenda) {
		this.nombreTipoPrenda = nombreTipoPrenda;
	}
	
	
}
