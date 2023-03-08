package n1ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import n1ejercicio3.EscribeFichero;

public class DirectorioPC {

	public  static  FileWriter fichero = null;
	public static  PrintWriter pw = null;
	File directorio = null;
	static String salida = null
			
			;
	public DirectorioPC() {
 
	}
	public DirectorioPC(String Directorio ) {
		// TODO Auto-generated constructor stub
		  directorio = new File(Directorio);
	}
	
	public String[]  Contenido() {
		return directorio.list();
	}
	
	public  void ListaContenido() {

		String[] lista =  directorio.list();
         Arrays.sort(lista);
 
        for (String archivo : lista)  {
        	System.out.println("*****" +  archivo + "*****"  );
        };
	}
	
	public  void ListaArbolDirectorio(String directorionombre) throws IOException {
			File directorio = new File(directorionombre);
            salida = "pantalla";
 	        ficherosRecursivos(directorio, "\t");
	}	
	public  void ListaArbolDirectorio(String directorionombre, String ficheroSalida ) throws IOException {
	      File directorio = new File(directorionombre);
	      salida = "fichero";

	      EscribiendoFichero(ficheroSalida);
	      ficherosRecursivos(directorio, "\t");
	      fichero.close();
	}	
	
	public  void ListaArbolDirectorio() throws IOException {
		
		Properties propiedades = new Properties();
		propiedades.load(new FileReader("C:/Users/usuario/CURSOBCNACTIVA/configuracion.properties"));
		
		String directorioprop = propiedades.getProperty("directorio"); 
		String salidapro      = propiedades.getProperty("salida"); 
		
		 
	    File directorio = new File(directorioprop);
	    salida = "fichero";
	    
		System.out.println(directorio);
		System.out.println(salida);
		
        EscribiendoFichero(salidapro);
	    ficherosRecursivos(directorio, "\t");
	    fichero.close();
	}	
	
 
	
	public static void ficherosRecursivos(File directorio, String separador) throws IOException {
		
	     File[] ficheros  = directorio.listFiles();

	    if(ficheros != null){
	        for (int x = 0; x < ficheros.length; x++) {
	        	String Tipo = ( ficheros[x].isDirectory() ) ? "D"   : "F"    ;
	            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	            
	            String  linea = separador +  Tipo + " " +  ficheros[x].getName()  +  "  "  + " " + sdf.format(ficheros[x].lastModified());
	            DirectorioPC.SalidaFListaContenido(linea);
	            
	            
	            if (ficheros[x].isDirectory()) {
	                String nuevo_separador = separador + " ";
	                ficherosRecursivos(ficheros[x], nuevo_separador);
	            }
	        }
	    }
	}

	public  static void SalidaFListaContenido(String linea) throws IOException {
		
 
		if ( salida.equals("pantalla") ) {
			System.out.println(linea);
		}else {
			fichero.write(linea + "\n");
		};
	
	}
	public static void EscribiendoFichero (String rootSalida) throws IOException {
		
		 	fichero = new FileWriter(rootSalida );
	}	
	
	public static void LeerFichero( String fichero2 ) {

		// Fichero del que queremos leer
		File fichero = new File(fichero2);
		Scanner s = null;

		try {
			s = new Scanner(fichero);
			while (s.hasNextLine()) {
				String linea = s.nextLine(); 	// Guardamos la linea en un String
				System.out.println(linea);      // Imprimimos la linea
			}

		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			// Cerramos el fichero tanto si la lectura ha sido correcta o no
			try {
				if (s != null)
					s.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
	}
    
}
