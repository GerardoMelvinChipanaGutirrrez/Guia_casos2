package com.senati.Eti;

import java.util.Scanner;

public class caso11 {
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Ingrese n�mero [1 - 7]: ");
		int n = sc.nextInt();
		
		String nombre_dia="";
		
		//condicional multiple
		switch (n) {
		case 1:
			nombre_dia="Domingo";
			break;
		case 2:
			nombre_dia="Lunes";
			break;
		case 3:
			nombre_dia="Martes";
			break;
		case 4:
			nombre_dia="Mi�rcoles";
			break;
		case 5:
			nombre_dia="Jueves";
			break;
		case 6:
			nombre_dia="Viernes";
			break;
		}
		
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("D�a de la semana.....: "+ nombre_dia);
		}
}