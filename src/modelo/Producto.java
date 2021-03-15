package modelo;

public class Producto {

	private String nombrecito;
	private double precio;
	private boolean caducado;
	
	public Producto(String nombre, double precio) {
		super();
		this.nombrecito = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombrecito;
	}

	public void setNombre(String nombre) {
		this.nombrecito= nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isCaducado() {
		return caducado;
	}

	public void setCaducado(boolean caducado) {
		this.caducado = caducado;
	}
	
	
	
}
