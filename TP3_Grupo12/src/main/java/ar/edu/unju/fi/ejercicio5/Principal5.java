package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Principal5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese una cadena de texto:  ");
		String txt=scan.nextLine();
		
		char arreglo[] = new char [txt.length()];  
		int j=0;
		
		for (int i=txt.length(); i>0; i--){
			arreglo[j] = txt.charAt(i-1);
			j=j+1;
		}  
		scan.close();
		System.out.println(arreglo);
	}
}
