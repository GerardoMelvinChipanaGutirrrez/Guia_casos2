package com.senati.Eti;

import java.util.Scanner;

public class caso2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Ingrese número: ");
		int n = sc.nextInt();
		 String mensaje ="";
		 
		 //condicional compuesta
		 if ((n% 2) == 0)
			 mensaje = "El número es par";
		 else
			 mensaje = "El número es impar";
		 
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("Resultado.....: "+ mensaje);

	}

}
