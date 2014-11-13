package pe.com.siraywasi.web.form;

import pe.com.siraywasi.model.TipoPrenda;
import pe.com.siraywasi.model.TipoTejido;
import pe.com.siraywasi.model.TipoTela;

public class PrendaForm {
	private int idPrenda;
	private String nombrePrenda;
	private TipoPrenda tipoPrenda;
	private TipoTela tipoTela;
	private TipoTejido tipoTejido;
	private String detalle;
	
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
	public TipoPrenda getTipoPrenda() {
		return tipoPrenda;
	}
	public void setTipoPrenda(TipoPrenda tipoPrenda) {
		this.tipoPrenda = tipoPrenda;
	}
	public TipoTela getTipoTela() {
		return tipoTela;
	}
	public void setTipoTela(TipoTela tipoTela) {
		this.tipoTela = tipoTela;
	}
	public TipoTejido getTipoTejido() {
		return tipoTejido;
	}
	public void setTipoTejido(TipoTejido tipoTejido) {
		this.tipoTejido = tipoTejido;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	

	
	
}
