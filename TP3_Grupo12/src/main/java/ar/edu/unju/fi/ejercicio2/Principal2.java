package ar.edu.unju.fi.ejercicio2;

import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ingreso = new Scanner(System.in);
		int multiplicandos[] = {0,1,2,3,4,5,6,7,8,9,10};
				
		boolean band=true;
		String respuesta;
		
		do {
		System.out.println("Ingrese valor");		
		int valor=ingreso.nextInt();
		if (valor>0 & valor<10) {
		for( int i=0;i<multiplicandos.length;i++) {
			System.out.println(valor+" x "+multiplicandos[i]+" = "+valor*multiplicandos[i]);
						
			}
		}else {
			System.out.println("Solo Valores del 1 al 9 inclusive");
		}
		
		
		System.out.println("Desea ingresar Otro Valor? SI/NO");
		respuesta = ingreso.next();
		if(respuesta.equalsIgnoreCase("NO")){
			band=false;
		}
		    
		    
		}while(band);
		ingreso.close();
	}

}
