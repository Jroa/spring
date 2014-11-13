package pe.com.siraywasi.model.dto;

public class MateriaPrimaDTO {
	private int idMateriaPrima;
	private String nombreMateriaPrima;
	private int cantidad;
	private String nombreUnidadMedida;
	private double ultimoCosto;
	private String nombreProveedor;
	
	public int getIdMateriaPrima() {
		return idMateriaPrima;
	}
	public void setIdMateriaPrima(int idMateriaPrima) {
		this.idMateriaPrima = idMateriaPrima;
	}
	public String getNombreMateriaPrima() {
		return nombreMateriaPrima;
	}
	public void setNombreMateriaPrima(String nombreMateriaPrima) {
		this.nombreMateriaPrima = nombreMateriaPrima;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getNombreUnidadMedida() {
		return nombreUnidadMedida;
	}
	public void setNombreUnidadMedida(String nombreUnidadMedida) {
		this.nombreUnidadMedida = nombreUnidadMedida;
	}
	public double getUltimoCosto() {
		return ultimoCosto;
	}
	public void setUltimoCosto(double ultimoCosto) {
		this.ultimoCosto = ultimoCosto;
	}
	public String getNombreProveedor() {
		return nombreProveedor;
	}
	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}
	
	
}
