package pe.com.siraywasi.model;

public class TipoMateriaPrima {
	private int idTipoMateriaPrima;
	private String nombreTipoMateriaPrima;
	
	public TipoMateriaPrima() {
	}

	public TipoMateriaPrima(int idTipoMateriaPrima,
			String nombreTipoMateriaPrima) {
		this.idTipoMateriaPrima = idTipoMateriaPrima;
		this.nombreTipoMateriaPrima = nombreTipoMateriaPrima;
	}

	public int getIdTipoMateriaPrima() {
		return idTipoMateriaPrima;
	}

	public void setIdTipoMateriaPrima(int idTipoMateriaPrima) {
		this.idTipoMateriaPrima = idTipoMateriaPrima;
	}

	public String getNombreTipoMateriaPrima() {
		return nombreTipoMateriaPrima;
	}

	public void setNombreTipoMateriaPrima(String nombreTipoMateriaPrima) {
		this.nombreTipoMateriaPrima = nombreTipoMateriaPrima;
	}
	
	
}
