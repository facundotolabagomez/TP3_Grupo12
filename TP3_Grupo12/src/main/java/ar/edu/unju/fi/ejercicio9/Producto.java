package ar.edu.unju.fi.ejercicio9;

public class Producto {

//	9.- Cree una clase java con nombre Producto con los siguientes atributos:
//	 código
//	 descripción
//	 precio
//	 marca
	private String codigo;
	private String descripcion;
	private double precio;
	private String marca;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Producto(String codigo, String descripcion, double precio, String marca) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.marca = marca;
	}
	
	
}
