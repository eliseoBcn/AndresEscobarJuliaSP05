package n1ejercicio5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializarObjeto {

    public static void main(String[] args)
    {
            Empleado  e = new Empleado();
            e.nombre = "Martin Miranda";
            e.direccion = "Mercedes Sosa, Santa Monica";
            e.DNI = 29087695;
            e.numero = 333;

            try
            {
                    FileOutputStream archivo = new
                                    FileOutputStream("C:/Users/usuario/CURSOBCNACTIVA/empleado.ser");
                    ObjectOutputStream salida = new
                                    ObjectOutputStream(archivo);
                    salida.writeObject(e);
                    salida.close();
                    archivo.close();
                    System.out.println("Datos guardados en empleado.ser");
            }
            catch (IOException i)
            {
                    i.printStackTrace();
            }
    
    	}
   	}
