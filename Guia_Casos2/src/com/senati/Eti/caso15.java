package com.senati.Eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class caso15 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("Cliente: ");
		String cliente=sc.nextLine();
		System.out.println("Producto [TB-LT-MN-IM]: ");
		String producto=sc.nextLine();
		System.out.println("Cantidad: ");
		int cantidad=sc.nextInt();
		System.out.println("Forma de pago [C1-C2]: ");
		String pago=sc.nextLine();
		
		String nombre_producto="",nombre_pago="";
		float precio=0,descuento=0;
		
		switch (producto) {
		case "TB":
			nombre_producto="Tablet";
			precio=350;
		case "LT":
			nombre_producto="Laptop";
			precio=2300;
		case "MN":
			nombre_producto="Monitor";
			precio=850;
		case "IM":
			nombre_producto="Impresora";
			precio=680;
		default:
			precio=0;
		}
		
		float importe= precio*cantidad;
		
		switch (pago) {
		case "C1":
			nombre_pago="Contado";
			descuento=importe*0.05f;
		case "C2":
			nombre_pago="Contado";
			descuento=importe*0.05f;
		}
		
		float total=importe-descuento;
		
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("Cliente........: "+ cliente);
		System.out.println("Producto.......: "+ nombre_producto);
		System.out.println("Precio.........: S/"+ precio);
		System.out.println("Cantidad.......: "+ cantidad);
		System.out.println("Importe........: S/"+ df.format(importe));
		System.out.println("Forma de pago..: "+ nombre_pago);
		System.out.println("Descuento......: S/"+ df.format(total));
	}

}
