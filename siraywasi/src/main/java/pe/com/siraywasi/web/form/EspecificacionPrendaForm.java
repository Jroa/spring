package pe.com.siraywasi.web.form;

import java.util.Date;

import pe.com.siraywasi.model.Prenda;
import pe.com.siraywasi.model.TipoPrenda;
import pe.com.siraywasi.model.TipoTela;

public class EspecificacionPrendaForm {

	private String nombrePrenda;
	private Date fechaProbable;
	private TipoTela tipoTela = new TipoTela(); 
	private Prenda prenda = new Prenda();
	private TipoPrenda tipoPrenda = new TipoPrenda();
	
	private boolean indicadorEstampado = false;
	private boolean indicadorBordado = false;
	
	public boolean isIndicadorEstampado() {
		return indicadorEstampado;
	}
	public void setIndicadorEstampado(boolean indicadorEstampado) {
		this.indicadorEstampado = indicadorEstampado;
	}
	public boolean isIndicadorBordado() {
		return indicadorBordado;
	}
	public void setIndicadorBordado(boolean indicadorBordado) {
		this.indicadorBordado = indicadorBordado;
	}
	public TipoPrenda getTipoPrenda() {
		return tipoPrenda;
	}
	public void setTipoPrenda(TipoPrenda tipoPrenda) {
		this.tipoPrenda = tipoPrenda;
	}
	public String getNombrePrenda() {
		return nombrePrenda;
	}
	public void setNombrePrenda(String nombrePrenda) {
		this.nombrePrenda = nombrePrenda;
	}
	public Date getFechaProbable() {
		return fechaProbable;
	}
	public void setFechaProbable(Date fechaProbable) {
		this.fechaProbable = fechaProbable;
	}
	public TipoTela getTipoTela() {
		return tipoTela;
	}
	public void setTipoTela(TipoTela tipoTela) {
		this.tipoTela = tipoTela;
	}
	public Prenda getPrenda() {
		return prenda;
	}
	public void setPrenda(Prenda prenda) {
		this.prenda = prenda;
	}
	
	
}
