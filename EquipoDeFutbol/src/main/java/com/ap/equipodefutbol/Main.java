package com.ap.equipodefutbol;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ap.equipodefutbol.model.Equipo;
import com.ap.equipodefutbol.model.EquipoPrimeraDivision;
import com.ap.equipodefutbol.serializer.Serializer;

public class Main {

	public static void main(String[] args) {			  
		        
		        Scanner scanner = new Scanner(System.in);
		        Equipo equipo = null;
		        List<Equipo> equipos = new ArrayList<Equipo>();
		        
		        while (true) {
		        	//clearConsole();
		        	System.out.print("\\033[H\\033[2J");
		        	System.out.flush();
		            System.out.println("MENU:");
		            System.out.println("1. Crear equipo");
		            System.out.println("2. Mostrar equipo");
		            System.out.println("0. Salir");
		            System.out.print("Ingrese una opción: ");
		            
		            int opcion = scanner.nextInt();
		            scanner.nextLine();
		            
		            switch (opcion) {
		                case 1:
		                    System.out.print("Ingrese el nombre del equipo: ");		                   
		                    EquipoPrimeraDivision equipoenum = EquipoPrimeraDivision.valueOf(scanner.nextLine().toUpperCase());
		                    if(!checkDuplicados(equipoenum, equipos)) {
		                    	System.out.println("El equipo "+equipoenum.getNombreEquipo()+" ya fue ingresado.");
		                    	break;
		                    }
		                    System.out.print("Ingrese la cantidad de jugadores titulares: ");
		                    int titulares = scanner.nextInt();
		                    System.out.print("Ingrese la cantidad de jugadores suplentes: ");
		                    int suplentes = scanner.nextInt();
		                    System.out.print("Ingrese la cantidad de puntos: ");
		                    int puntos = scanner.nextInt();
		                    System.out.print("Ingrese la cantidad de partidos jugados: ");
		                    int partidosJugados = scanner.nextInt();
		                    scanner.nextLine();
		                    
		                    equipo = new Equipo(equipoenum, titulares, suplentes, puntos, partidosJugados);
		                    equipos.add(equipo);
		                    break;
		                case 2:
		                    if (equipo == null) {
		                        System.out.println("Debe crear un equipo primero.");
		                    } else {
		                        System.out.println(equipo);
		                    }
		                    break;
		                case 0:
		                	//Serializer
		                    System.out.println("Adiós!");
		                    return;
		                default:
		                    System.out.println("Opción inválida.");
		            }
		        }
		    }
		                                                        //equipo,suplente, puntos, partidos jugados
		//Equipo equipo1 = new Equipo(EquipoPrimeraDivision.UNION, 11, 7, 25, 10);
		//Equipo equipo2 = new Equipo(EquipoPrimeraDivision.BOCA_JUNIORS, 11, 7, 22, 9);
	
	private static boolean checkDuplicados(EquipoPrimeraDivision enumEquipo, List<Equipo> equipos) {
		if(equipos.size() > 0) {
			for(Equipo equipo  : equipos) {
				if(equipo.getNombre().equals(enumEquipo.getNombreEquipo())){
					return true;
				}
			}
		}
		return false;		
	}
	
	private static void clearConsole() {
		 String os = System.getProperty("os.name").toLowerCase();

	        // Ejecuta el comando de limpieza de la consola correspondiente al sistema operativo
	        if (os.contains("windows")) {
	            try {
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        } else {
	            System.out.print("\033[H\033[2J");
	            System.out.flush();
	        }
	        
	        System.out.println("La consola ha sido limpiada.");
	}

}
