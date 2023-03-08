package n1ejercicio5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DesSerializarObjeto {

	public DesSerializarObjeto() {
		// TODO Auto-generated constructor stub
	}

	
    public static void main(String[] args)
    {
            Empleado e = null;
            try
            {
                    FileInputStream archivo = new
                                    FileInputStream("empleado.ser");
                    ObjectInputStream entrada = new
                                    ObjectInputStream(archivo);
                    e = (Empleado) entrada.readObject();
                    entrada.close();
                    archivo.close();
            }
            catch(IOException i)
            {
                    i.printStackTrace();
                    return;
            }
            catch(ClassNotFoundException c)
            {
                    System.out.println("Clase Empleadono encontrada");
                    c.printStackTrace();
                    return;
            }

            System.out.println("Deserializando al empleado...");
            System.out.println("Nombre: " + e.nombre);
            System.out.println("Direccion: " + e.direccion);
            System.out.println("DNI: " + e.DNI);
            System.out.println("Numero: " + e.numero);
    }	
	
	
	
	
	
	
	
}
