package n1ejercicio5;

 
	public class Empleado implements java.io.Serializable {
        public String nombre;
        public String direccion;
        public transient int DNI;
        public int numero;

        public void chequeCorreo()
        {
                System.out.println("Mandando cheque a " + nombre
                                        + " " + direccion);
        }
}
	
	