// Esta clase se creo para reliazar pruebas de los metodos que se iban creando.
package app;

import negocio.Veterinaria;
import domain.*;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("rayas", 20, "masculino", "felino", "gatuno", "bañarse");
        Mascota mascota2 = new Mascota("bicho", 10, "hembra", "felino", "gatuno", "desparasitar");
        
        Cliente cliente1 = new Cliente("Alejandro", "Granados", "bello", "ixtapa", "los heroses", 
                5454, "mz", "casa", 4546848);
        cliente1.agregarMascota(mascota1);
        cliente1.agregarMascota(mascota2);
        
        Veterinaria vet = new Veterinaria();
//        vet.agregarCliente(cliente1); //se agrega intencionalmente 2 veces al mismo cliente para que se vea que no se aceptan registros duplicados.
//        vet.agregarCliente(cliente1); 
        vet.mostrarClientes();
//        
//        Mascota mascota3 = new Mascota(5, "hembra", "pancha", "reptil", "tortuga", "cambiar agua");
//        cliente1.agregarMascota(mascota3);
//        vet.mostrarClientes();
//        
//        cliente1.eliminarMascota(mascota1);
//        vet.mostrarClientes();
//       
//        // busqueda.
//        System.out.println("-----------------------------");
//        String nombre = "Alejandro";
//        String paterno = "Granados";
//        String materno = "bello";
//        
//        Cliente cliente4 = new Cliente(nombre, paterno, materno);
//        Set<Mascota> mascotasCli = vet.busquedaMascotas(cliente4);
//        
//        mascotasCli.forEach(elemento->{
//            System.out.println(elemento);
//        });
        
    }
}
