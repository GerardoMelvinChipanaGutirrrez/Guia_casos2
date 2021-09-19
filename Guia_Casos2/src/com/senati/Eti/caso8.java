package com.senati.Eti;

import java.util.Scanner;

public class caso8 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		System.out.print("Ingrese nota: ");
		int nota = sc.nextInt();
		
		String mensaje = "";
		
		switch (nota) {
		case nota>=0  nota<=7:
			mensaje ="Sin palabras";
		case nota>=8  nota<=10:
			mensaje ="Malo";
		case nota>=11 + nota<=14:
				mensaje ="Malo";
		case nota>=15 + nota<=17:
			mensaje ="Notable";
		case nota>=18 + nota<=20:
			mensaje ="Excelente";
		}
		

		System.out.println("-----------");
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("Estado obetnido: "+ mensaje);
	}
}
