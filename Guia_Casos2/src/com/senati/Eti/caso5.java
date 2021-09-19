package com.senati.Eti;

import java.util.Scanner;

public class caso5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Cantidad: ");
		int cantidad = sc.nextInt();
		
		System.out.print("Precio: ");
		float precio = sc.nextFloat();
		
		float dscto;
		
		float total = cantidad * precio;
		if (cantidad > 0)
			dscto = 0.1f * total;
		else
			dscto = 0;
		
		float neto = total - dscto;
		
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("Importe parcial..: "+ total);
		System.out.println("descuento........: "+ dscto);
		System.out.println("Importe totañl...: "+ neto);
		
		

	}

}
