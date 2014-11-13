package pe.com.siraywasi.model;

public class Prenda {
	private int idPrenda;
	private String nombrePrenda;
	private int idTipoPrenda;
	private int idTipoTela;
	private int idTipoTejido;
	private String detalle;
	
	public Prenda(){}
	
	

	public Prenda(int idPrenda, String nombrePrenda, int idTipoPrenda,
			int idTipoTela, int idTipoTejido, String detalle) {
		this.idPrenda = idPrenda;
		this.nombrePrenda = nombrePrenda;
		this.idTipoPrenda = idTipoPrenda;
		this.idTipoTela = idTipoTela;
		this.idTipoTejido = idTipoTejido;
		this.detalle = detalle;
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


	public int getIdTipoPrenda() {
		return idTipoPrenda;
	}


	public void setIdTipoPrenda(int idTipoPrenda) {
		this.idTipoPrenda = idTipoPrenda;
	}


	public int getIdTipoTela() {
		return idTipoTela;
	}


	public void setIdTipoTela(int idTipoTela) {
		this.idTipoTela = idTipoTela;
	}


	public int getIdTipoTejido() {
		return idTipoTejido;
	}


	public void setIdTipoTejido(int idTipoTejido) {
		this.idTipoTejido = idTipoTejido;
	}


	public String getDetalle() {
		return detalle;
	}


	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	
}
