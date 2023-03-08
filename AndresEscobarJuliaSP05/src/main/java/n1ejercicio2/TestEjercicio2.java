package n1ejercicio2;

import java.io.IOException;

import n1ejercicio1.DirectorioPC;

public class TestEjercicio2 {

	public TestEjercicio2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
   	 String  rootDir = "C:/Users/usuario/Documents/ondriveoffice265/OneDrive/Cursos_2023";
   	 String  rootDir2 = "C:/Users/usuario/Documents/ondriveoffice265/OneDrive/2022copiaMovil";
   	 String  rootDir3 = "C:/Users/usuario/Documents/ondriveoffice265/OneDrive/2022copiaMovil/Download";
   	 
     DirectorioPC directorio = new DirectorioPC();
     directorio.ListaArbolDirectorio(rootDir3);	
		
		
	}

}
