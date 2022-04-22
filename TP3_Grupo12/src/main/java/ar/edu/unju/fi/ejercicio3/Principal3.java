package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Principal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno alumno = new Alumno();
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("Ingresar nombre del alumno: ");
		alumno.nombre=a.nextLine();
		System.out.println("Ingresar apellido del alumno: ");
		alumno.apellido=a.nextLine();
		System.out.println("Ingresar LU del alumno: ");
		alumno.libretaUniversitaria=a.nextInt();
		for(int i=0;i<alumno.notas.length;i++) {
			int aux=i+1;
			System.out.println("Ingrese la "+aux+"° nota: ");
			alumno.notas[i]=a.nextDouble();
		}
		System.out.println("--------------");
		alumno.calcularPromedio(alumno.notas);
		alumno.obtenerNotaMaxima(alumno.notas);
		a.close();
	}
}
