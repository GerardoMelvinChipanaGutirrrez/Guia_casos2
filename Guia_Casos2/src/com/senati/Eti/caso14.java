package com.senati.Eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class caso14 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Nombre del alumno: ");
		String alumno = sc.nextLine();
		
		System.out.print("Carrera [DS-RC-DG]: ");
		String carrera = sc.nextLine();
		
		System.out.print("Turno [M-T-N]: ");
		String turno = sc.nextLine();
		
		String nombre_carrera = "", nombre_turno ="";
		float monto =0,dscto=0, total_sol=0,total_dol=0;
		
		switch (carrera) {
		case "DS":
			nombre_carrera="Desarrollo de Software";
			monto=1500;
		case "RC":
			nombre_carrera="Redes y Conectividad";
			monto=1400;
		case "DG":
			nombre_carrera="Diseño Gráfico";
			monto=1300;
		default:
			nombre_carrera="Desconocido";
			monto=0;
		}
		
		switch (turno) {
		case "M":
			nombre_turno="Mañana";
			dscto=0.1f*monto;
		case "T":
			nombre_turno="Tarde";
			dscto=0.2f*monto;
		case "N":
			nombre_turno="Noche";
			dscto=0.15f*monto;
		}
		
		total_sol=monto-dscto;
		total_dol=monto/3.33f;
		
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("Alumno(a).............: "+ alumno);
		System.out.println("Carrera...............: "+ nombre_carrera);
		System.out.println("Turno.................: "+ nombre_turno);
		System.out.println("Monto.................: S/"+ df.format(monto));
		System.out.println("Descuento aplicado....: S/"+ df.format(dscto));
		System.out.println("Total a pagar(soles)..: S/"+ df.format(total_sol));
		System.out.println("Total a pagar(dólares): S/"+ df.format(total_dol));

	}

}
