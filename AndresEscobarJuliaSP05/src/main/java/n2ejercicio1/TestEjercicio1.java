package n2ejercicio1;

import java.io.IOException;

import n1ejercicio1.DirectorioPC;

public class TestEjercicio1 {

	public TestEjercicio1() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws IOException {
		
		 DirectorioPC  directorio = new  DirectorioPC();
		 
		 //  Sin parametros leemos directamente del fichero de configuracion //
		 // C:/Users/usuario/CURSOBCNACTIVA/configuracion.properties         //
		 
		 directorio.ListaArbolDirectorio();	
 
	}
}
