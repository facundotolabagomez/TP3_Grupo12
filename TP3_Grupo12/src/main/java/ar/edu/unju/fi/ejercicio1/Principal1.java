package ar.edu.unju.fi.ejercicio1;

import java.util.Scanner;

public class Principal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaraciones e instancias de arreglos
		int[] arregloUno;
		arregloUno=new int[5];
		int[] arregloDos;
		arregloDos=new int[5];
		
		Scanner scan = new Scanner (System.in);
		
		for (int i = 0; i< arregloUno.length;i++) {
			System.out.println("1 - Ingrese un numero: ");
			int valorUno = scan.nextInt();
			arregloUno[i]=valorUno;
		}
		System.out.println("---------------------------");
		for (int i = 0; i< arregloDos.length;i++) {
			System.out.println("2 - Ingrese un numero: ");
			//int valorDos = scan.nextInt();
			//arregloDos[i]=valorDos;
			arregloDos[i]=scan.nextInt();
			
		}
		System.out.println("---------------------------");
		try {
			for (int i = 0; i< arregloUno.length;i++) {
				int div = arregloUno[i]/arregloDos[i];
				System.out.println("*** "+arregloUno[i]+" dividido "+ arregloDos[i]+" es: "+div );
			}
		}catch(java.lang.ArithmeticException byzero) {
			System.out.println("cero no se puede dividir por cero");
		}
		scan.close();
		
}
}
