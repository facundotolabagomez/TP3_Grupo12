package ar.edu.unju.fi.ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
//		Agregue la clase Principal. Declare y cree un ArrayList donde se guardarán los diferentes objetos productos.
//		Muestre el siguiente menú de opciones:
//		1 – Nuevo producto
//		2 – Mostrar todos los productos
//		3 – Incrementar precio a todos los productos.
//		4 - Monto total de todos los productos
//		5 - Fin
//		Opción 1 permite crear un objeto de la clase Producto utilizando el constructor parametrizado.
//		Opción 2 muestra la lista de todos los productos.
//		Opción 3 Incrementa el precio de todos los productos en 100,25$.
//		Opción 4 suma todos los precios de los productos y muestra el resultado.
//		Opción 5 finaliza
	static ArrayList<Producto> productos = new ArrayList<Producto>();
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		do{
			System.out.println("1 – Nuevo producto\r\n" + "2 – Mostrar todos los productos\r\n" + "3 – Incrementar precio a todos los productos.\r\n" + "4 - Monto total de todos los productos\r\n" + "5 - Fin");
			opcion = scanner.nextInt();
		
			switch(opcion) {
				case 1: agregarProducto();
						break;
				case 2: mostrarLista();
					break;
				case 3: incrementarPrecio();
					break;
				case 4: sumarPrecios();
					break;
				case 5: System.out.println("Fin del programa");
					break;
				default: System.out.println("Opcion incorrecta");
			}
		}while(opcion != 5);
		scanner.close();
	}
	public static void agregarProducto() {
		System.out.println("Igrese codigo");
		String codigo = scanner.next();
		System.out.println("Igrese descripcion");
		String descripcion = scanner.next();
		descripcion += scanner.nextLine();
		System.out.println("Igrese precio");
		double precio = scanner.nextDouble();
		System.out.println("Igrese marca");
		String marca = scanner.next();
		Producto producto = new Producto(codigo, descripcion, precio, marca);
		productos.add(producto);
	}
	public static void mostrarLista(){
		for(Producto p: productos) {
			System.out.println("Codigo - " + p.getCodigo() + " | Descripcion - " + p.getDescripcion() + " | Precio - $" + p.getPrecio() + " | Marca - " + p.getMarca());
		}
	}
	public static void incrementarPrecio() {
		for(Producto p: productos) {
			p.setPrecio(p.getPrecio() + 100.25);
		}
	}
	public static void sumarPrecios() {
		double total = 0.0;
		for(Producto p: productos) {
			total += p.getPrecio();
		}
		System.out.println("Total precios: " + total);
	}
}
