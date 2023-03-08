package n1ejercicio1;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;

import java.util.Arrays;
import java.util.Iterator;

import n1ejercicio3.EscribeFichero;

/**
 * Hello world!
 *
 */
public class TestEjercicio1 
{   
	// Método para listar todos los archivos en un directorio con Apache Commons IO

	
    public static void main( String[] args )
    {

    	 String  rootDir = "C:/Users/usuario/Documents/ondriveoffice265/OneDrive/Cursos_2023";
    	 String  rootDir2 = "C:/Users/usuario/Documents/ondriveoffice265/OneDrive/2022copiaMovil";
    	 String  rootDir3 = "C:/Users/usuario/Documents/ondriveoffice265/OneDrive/2022copiaMovil/Download";
    	 
         DirectorioPC directorio = new DirectorioPC(rootDir3 );
         
         directorio.ListaContenido();
        
    }
}
