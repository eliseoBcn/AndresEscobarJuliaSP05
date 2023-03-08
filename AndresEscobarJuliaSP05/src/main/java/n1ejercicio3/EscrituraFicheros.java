package n1ejercicio3;

import java.io.FileWriter;

public class EscrituraFicheros {

 
		public static void main(String[] args) {
		   	 String  rootSalida  = "C:/Users/usuario/CURSOBCNACTIVA/listadodirectorios.txt";
		   	 
			String[] lineas = { "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "..." };

			/** FORMA 1 DE ESCRITURA **/
			FileWriter fichero = null;
			try {

				fichero = new FileWriter(rootSalida );

				// Escribimos linea a linea en el fichero
				for (String linea : lineas) {
					fichero.write(linea + "\n");
				}

				fichero.close();

			} catch (Exception ex) {
				System.out.println("Mensaje de la excepción: " + ex.getMessage());
			}
		}	
		
		
		
		
		
		
		
 

}
