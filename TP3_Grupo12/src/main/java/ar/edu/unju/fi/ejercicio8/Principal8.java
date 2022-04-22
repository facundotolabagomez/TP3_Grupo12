package ar.edu.unju.fi.ejercicio8;

import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio3.Alumno;

public class Principal8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Alumno> arrayAlum = new ArrayList<Alumno>();
		Scanner a = new Scanner (System.in);
		int eleccion=1;
		
		do {
			System.out.println("-------------------------------------");
			System.out.println("Elija una opcion: ");
			System.out.println("1 – Nuevo alumno ");
			System.out.println("2 – Eliminar alumno");
			System.out.println("3 – Modificar notas alumno");
			System.out.println("4 – Mostrar todos los alumnos");
			System.out.println("5 - Mostrar los que superan el promedio de 6");
			System.out.println("6 – Salir");
			System.out.println("-------------------------------------");
			eleccion = a.nextInt();
			
			switch (eleccion){
			case 1: 
				Alumno alumno = new Alumno();
				System.out.println("Ingresar nombre del alumno: ");
				alumno.nombre=a.next();
				System.out.println("Ingresar apellido del alumno: ");
				alumno.apellido=a.next();
				System.out.println("Ingresar LU del alumno: ");
				alumno.libretaUniversitaria=a.nextInt();
				for(int i=0;i<alumno.notas.length;i++) {
					int aux=i+1;
					System.out.println("Ingrese la "+aux+"° nota: ");
					alumno.notas[i]=a.nextDouble();
				}
				arrayAlum.add(alumno);
				break;
			case 2:
				System.out.println("Ingresar la LU del alumno: ");
				int lu=a.nextInt();
				boolean bandera = false;
				for (int i=arrayAlum.size();i>0;i--) {
					Alumno al = new Alumno();
					al.libretaUniversitaria=arrayAlum.get(i-1).libretaUniversitaria;
					if (al.libretaUniversitaria==lu) {
						System.out.println("Alumno "+arrayAlum.get(i-1).nombre +" "+ arrayAlum.get(i-1).apellido + " fue eliminado");
						arrayAlum.remove(i-1);
						bandera=true;
					}
				}
				if (!bandera) {
					System.out.println("No existe el alumno");
				}
				break;
			case 3:
				System.out.println("Ingresar la LU del alumno: ");
				int libu=a.nextInt();
				for (int i=0;i<arrayAlum.size();i++) {
					Alumno al = new Alumno();
					al.libretaUniversitaria=arrayAlum.get(i).libretaUniversitaria;
					if (al.libretaUniversitaria==libu) {
						al.notas=arrayAlum.get(i).notas;
						for(int j=0;j<al.notas.length;j++) {
							int aux=j+1;
							System.out.println("Ingrese la "+aux+"° nota: ");
							al.notas[j]=a.nextDouble();
						}
						arrayAlum.get(i).notas=al.notas;
					}
				}
				break;
			case 4:
				for (int i=0;i<arrayAlum.size();i++) {
					System.out.println("NOMBRE "+arrayAlum.get(i).nombre);
					System.out.println("APELLIDO "+arrayAlum.get(i).apellido);
					System.out.println("LU "+arrayAlum.get(i).libretaUniversitaria);
					Alumno alum = new Alumno();
					alum.notas=arrayAlum.get(i).notas;
					for(int j=0;j<alum.notas.length;j++) {
						System.out.println("NOTA "+(j+1)+" = "+ alum.notas[j]);
					}
				}
			case 5:
				System.out.println("-----Alumnos que superan el promedio 6-------");
				for (int i=0;i<arrayAlum.size();i++) {
					Alumno alumProm = new Alumno ();
					alumProm.nombre = arrayAlum.get(i).nombre;
					alumProm.apellido = arrayAlum.get(i).apellido;
					alumProm.notas=arrayAlum.get(i).notas;
					double sumanota = 0;
					for(int j=0;j<alumProm.notas.length;j++) {
						sumanota = sumanota+alumProm.notas[j];
					}
					double promedio = sumanota/alumProm.notas.length;
					if (promedio >= 6) {
						System.out.println("Alumno= "+alumProm.nombre+" "+alumProm.apellido);
					}
				}
			default:
			}
			
		}while(eleccion != 6);
		
		a.close();
	}
}
