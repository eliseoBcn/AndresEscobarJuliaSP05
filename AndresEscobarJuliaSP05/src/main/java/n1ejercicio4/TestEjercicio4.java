package n1ejercicio4;

import n1ejercicio1.DirectorioPC;

public class TestEjercicio4 {

	public TestEjercicio4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
	   	 String  rootDir = "C:/Users/usuario/Documents/ondriveoffice265/OneDrive/Cursos_2023";
	   	 String  rootDir2 = "C:/Users/usuario/Documents/ondriveoffice265/OneDrive/2022copiaMovil";
	   	 String  rootDir3 = "C:/Users/usuario/Documents/ondriveoffice265/OneDrive/2022copiaMovil/Download";
	   	 String  rootSalida  = "C:/Users/usuario/CURSOBCNACTIVA/listadodirectorios.txt";
	   	 
 
   	 	DirectorioPC.LeerFichero(rootSalida);
	     
	 
	}

}
