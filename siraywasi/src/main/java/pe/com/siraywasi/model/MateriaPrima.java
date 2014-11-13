package pe.com.siraywasi.model;

public class MateriaPrima {
	private int idMateriaPrima;
	private String nombreMateriaPrima;
	private int idMarca;
	private int cantidad;
	private int idProveedor;
	private String tipoCompra;
	private int idUnidadMedida;
	private double costo;
	private String detalle;
	
	
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
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
	public int getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}
	public String getTipoCompra() {
		return tipoCompra;
	}
	public void setTipoCompra(String tipoCompra) {
		this.tipoCompra = tipoCompra;
	}
	public int getIdUnidadMedida() {
		return idUnidadMedida;
	}
	public void setIdUnidadMedida(int idUnidadMedida) {
		this.idUnidadMedida = idUnidadMedida;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
}
