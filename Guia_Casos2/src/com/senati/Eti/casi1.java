package com.senati.Eti;

import java.util.Scanner;

public class casi1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Ingrese edad: ");
		int edad = sc.nextInt();
		
		String estado = "Menor de edad";
		
		//condicional simple
		if (edad >= 18)
			estado = "Mayor de edad";
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("Estado.....: "+ estado);
	}

}
