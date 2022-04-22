package ar.edu.unju.fi.ejercicio3;

public class Alumno {

	public String nombre;
	public String apellido;
	public int libretaUniversitaria;
	public double notas[] = new double [5];
	
	public void calcularPromedio(double notas[]) {
		double sumanotas=0;
		for (int i=0;i<notas.length;i++) {
			sumanotas=sumanotas+notas[i];
		}
		double promedio=sumanotas/notas.length;
		System.out.println("El promedio es: "+promedio);
	}
	
	public void obtenerNotaMaxima(double notas[]) {
		double maxima=0;
		for (int i=0;i<notas.length;i++) {
			if (maxima<notas[i]) {
				maxima=notas[i];
			}
		}
		System.out.println("La nota máxima es: "+maxima);
	}
}
