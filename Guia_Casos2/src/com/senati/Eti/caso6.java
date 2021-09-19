package com.senati.Eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class caso6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese el sueldo: ");
		int sueldo = sc.nextInt();
		
		float impuesto = 0;
		if (sueldo>2800)
			impuesto = sueldo*5/100;
		else
			impuesto = sueldo*2/100;
		System.out.println("-----------");
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("perimetro del triágulo: "+ df.format(impuesto));
		
	}

}
