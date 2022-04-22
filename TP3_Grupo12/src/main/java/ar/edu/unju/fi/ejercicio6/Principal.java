package ar.edu.unju.fi.ejercicio6;

import java.util.Scanner;

public class Principal {

//	6.- Solicite al usuario que ingrese 10 números enteros por consola y guardarlos en un arreglo de tipo
//	entero. Luego muestre los números en orden inverso, es decir, el primero que se introduce es el último en
//	mostrarse y viceversa.
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[10];
		int n;
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Ingrese un numero");
			n = scanner.nextInt();
			numeros[i] = n;
		}
		scanner.close();
		for(int i = numeros.length-1; i >= 0; i--) {
			System.out.println(numeros[i]);
		}
	}

}
