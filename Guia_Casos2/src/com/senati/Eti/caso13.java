package com.senati.Eti;

import java.util.Scanner;

public class caso13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Primer n�mero: ");
		int numero1 = sc.nextInt();
		System.out.println("Segundo n�mero: ");
		int numero2 = sc.nextInt();
		System.out.print("Operaci�n [1-6]: ");
		int operacion = sc.nextInt();
		
		String nombre_operacion ="";
		float resultado=0;
		
		switch (operacion) {
		case 1:
			resultado=numero1+numero2;
			nombre_operacion="Suma";
		case 2:
			resultado=numero1-numero2;
			nombre_operacion="Resta";
		case 3:
			resultado=numero1*numero2;
			nombre_operacion="Multiplicaci�n";
		case 4:
			if (numero2>0) {
				resultado=numero1/numero2;
				nombre_operacion="Multiplicaci�n";
			}
			else {
				resultado=0;
			    nombre_operacion="No es posible hallar la division";
			}
		case 5:
			if (numero2>0) {
				resultado=numero1%numero2;
				nombre_operacion="Resto";
			}
			else {
				resultado=0;
				nombre_operacion="No es posible hallar el resto entero";
			}
		case 6:
			resultado=numero1+numero2/2;
			nombre_operacion="Promedio";
		default:
			resultado=0;
		}
		
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("N�mero1....: "+ numero1);
		System.out.println("N�mero2....: "+ numero2);
		System.out.println("Operaci�n..: "+ nombre_operacion);
		System.out.println("Resultado..: "+ resultado);

	}

}
