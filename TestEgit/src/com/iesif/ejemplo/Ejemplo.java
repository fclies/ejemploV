package com.iesif.ejemplo;

public class Ejemplo {

	public static void main(String[] args) {
		int n=4;
		double a=5.2;
		char c= 'n';
		
		System.out.println("N = " + n);
		System.out.println("A = " + a);
		System.out.println("C = " + c);
		

		//suma
		double suma = n +a;
		System.out.println("El valor de la suma es " + suma);
		

		//Resta 
		double resta = a-n;
		System.out.println("El valor de la resta de (" + a + ") y (" + n + ") es = " + resta);


		//Mostrar valor numérico de c
		int cChar = (int) c;
		System.out.println("El valor numérico del caracter (" + c + ") es = " + cChar);
	}
}