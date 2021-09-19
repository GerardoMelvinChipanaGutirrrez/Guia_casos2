package com.senati.Eti;

import java.util.Scanner;

public class caso9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Nombre del alumno: ");
		String nombre = sc.nextLine();
		
		System.out.print("Nota 1 [0 - 20]: ");
		int nt1 = sc.nextInt();
		System.out.print("Nota 2 [0 - 20]: ");
		int nt2 = sc.nextInt();
		System.out.print("Asistencia [0 - 12]: ");
		float nt3 = sc.nextFloat();
		
		float promedio = (float)(nt1*0.3+nt2*0.7);
		float porcentaje = nt3/12*100;
		String estado ="Desaprobado";
		
		if (promedio >= 13 && porcentaje >= 70)
			estado = "Aprobado";
		
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("Alumno.....: "+ nombre);
		System.out.println("Promedio...: "+ promedio);
		System.out.println("Asistencia.: "+ porcentaje + "%");
		System.out.println("Estado.....: "+ estado);
		
	}

}
