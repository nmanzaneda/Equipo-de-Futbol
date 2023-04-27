package com.ap.equipodefutbol.serializer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.ap.equipodefutbol.model.Equipo;

public class Serializer {
	
	
	private String nameFile;
	private List<Equipo> equipos = new ArrayList();
	
	
	public Serializer(final String nameFile, final List<Equipo> equipos) {
		this.nameFile = nameFile;
		this.equipos = equipos;
	}
	

	
	public void serializerEquipo() {
		if(this.equipos.size() > 0) {
			for(Equipo equipo : equipos) {
				try {
			        FileOutputStream fileOut = new FileOutputStream("equipo.ser");
			        ObjectOutputStream out = new ObjectOutputStream(fileOut);
			        out.writeObject(equipo);
			        out.close();
			        fileOut.close();
			        System.out.println("El objeto Equipo ha sido serializado en el archivo equipo.ser");
			    } catch (IOException i) {
			        i.printStackTrace();
			    }
			}
			
		}
	}

}
