
package formulario.de.contacto;

public class FormularioDeContacto {

    public static void main(String[] args) {
        char nombre;
        String correo;
        double calificacion;
        int edad;
        long telefono;
        String mensaje;
        boolean terminos;
        
        nombre = 'R';
        correo = "rominaperez@gmail.com";
        calificacion = 7.5;
        edad = 19;
        telefono = 98665666;
        mensaje = "Estoy muy satisfecha con el servicio";
        terminos = true;
       
        System.out.println("Nombre: " +nombre);
        System.out.println("Correo: " +correo);
        System.out.println("Calificación: " +calificacion);
        System.out.println("Edad: "  +edad);
        System.out.println("Teléfono: " +telefono);
        System.out.println("Mensaje: " +mensaje);
        System.out.println("Acepta términos y condiciones: " +terminos);
        
       
    }
    
}
