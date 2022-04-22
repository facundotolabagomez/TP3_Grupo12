package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Principal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ingreso = new Scanner(System.in);
		int [] numeros = new int [8];
		
		System.out.println("Ingrese Numeros");
		
				
		for( int i=0;i<numeros.length;i++) {
			numeros[i]= ingreso.nextInt();			
		}
		
		for( int i=0;i<numeros.length;i++) {
			if (numeros[i]% 2 == 0) {
				System.out.println(numeros[i]+" par ");
			}else {
				System.out.println(numeros[i]+" impar ");
				}
			}ingreso.close();
	}

}
