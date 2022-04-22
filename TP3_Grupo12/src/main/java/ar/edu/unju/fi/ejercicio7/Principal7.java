package ar.edu.unju.fi.ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> frutas = new ArrayList<String>();
		Scanner scan = new Scanner (System.in);
		String eleccion;
		
		do {
			System.out.println("---- Ingrese una fruta: ----");
			frutas.add(scan.nextLine());
			
			System.out.println("¿Desea Ingresar mas datos? S/N");
			eleccion=scan.nextLine();
			eleccion=eleccion.toLowerCase();
		}while(!eleccion.equals("n"));
		
		for (int i=0;i<frutas.size();i++) {
			if (i%2 ==0) {
				System.out.println(frutas.get(i));
			}
				
		}
		
		System.out.println("Ingrese un nro entero positivo: ");
		int indice = scan.nextInt();
		
		if (indice>=0) {
			if (indice<=frutas.size()) {
				frutas.remove(indice);
			}
		}else {
			System.out.println("Dije entero positivo");
		}
		
		System.out.println("Elementos de frutas");
		System.out.println(frutas);
		System.out.println("Cantidad de elementos "+frutas.size());
		
		scan.close();
	}
	

}
