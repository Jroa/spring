package pe.com.siraywasi.model;

public class MoldeMedidaTalla {
	private int idMoldeMedidaTalla;
	private int idMoldeMedida;
	private String tipoTalla;
	private String corte;
	private String prendaFinal;
	
	public MoldeMedidaTalla() {
	}
	
	public MoldeMedidaTalla(int idMoldeMedidaTalla, int idMoldeMedida,
			String tipoTalla, String corte, String prendaFinal) {
		this.idMoldeMedidaTalla = idMoldeMedidaTalla;
		this.idMoldeMedida = idMoldeMedida;
		this.tipoTalla = tipoTalla;
		this.corte = corte;
		this.prendaFinal = prendaFinal;
	}

	public int getIdMoldeMedida() {
		return idMoldeMedida;
	}
	public void setIdMoldeMedida(int idMoldeMedida) {
		this.idMoldeMedida = idMoldeMedida;
	}
	public int getIdMoldeMedidaTalla() {
		return idMoldeMedidaTalla;
	}
	public void setIdMoldeMedidaTalla(int idMoldeMedidaTalla) {
		this.idMoldeMedidaTalla = idMoldeMedidaTalla;
	}

	public String getTipoTalla() {
		return tipoTalla;
	}
	public void setTipoTalla(String tipoTalla) {
		this.tipoTalla = tipoTalla;
	}
	public String getCorte() {
		return corte;
	}
	public void setCorte(String corte) {
		this.corte = corte;
	}
	public String getPrendaFinal() {
		return prendaFinal;
	}
	public void setPrendaFinal(String prendaFinal) {
		this.prendaFinal = prendaFinal;
	}
	
	
}
