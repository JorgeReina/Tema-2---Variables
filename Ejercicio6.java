/**
*
*	Ejercicio 6, programa que calcula el total de una factura.
* 
* 	Nombre del archivo: Ejercicio6.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio6 {
	public static void main(String[] args){
		
		double valor1 = 2;
		double valor2 = 4;
		double valor3 = 2;
		
		double iva = 1.21;
		
		double total = valor1 + valor2 + valor3;
		
		System.out.println("El total sin IVA es: " + total);
		System.out.println("El total con IVA es: " + (total * iva));
		
	}
}
