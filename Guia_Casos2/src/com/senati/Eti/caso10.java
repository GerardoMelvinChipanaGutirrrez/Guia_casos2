package com.senati.Eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class caso10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Nombre del alumno: ");
		String empleado = sc.nextLine();
		System.out. println("Horas trabajadas: ");
		int ht = sc.nextInt();
		System.out. println("Tarifa por hora: ");
		int txh = sc.nextInt();
		System.out. println("Minutos de tardanza: ");
		float tardanza = sc.nextFloat();
		
		float bono=0, descuento=0;
		
		int importe = ht*txh;
		
		if (ht>60)
			bono = importe*0.13f;
		else
			bono=importe*0.04f;
		
		if (tardanza>15)
			descuento=importe*0.13f;
		else
			descuento=0;
		
		float alcanzado=ht+100/70;
		
		System.out.println("-----------");
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("Tarabajador.....: "+empleado);
		System.out.println("Horas trabajadas: "+ ht +"horas");
		System.out.println("Tarifa por horas: S/"+txh);
		System.out.println("Importe.........: S/"+ df.format(importe));
		System.out.println("Bono............: S/"+ df.format(bono));
		System.out.println("Descuento.......: S/"+ df.format(descuento));
		System.out.println("Meta alcanzada..: "+ df.format(alcanzado)+"%");
	}

}
