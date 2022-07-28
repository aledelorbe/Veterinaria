
package app;

import domain.*;

public class main {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota(20, "masculino", "rayas", "felino", "gatuno", "bañarse");
        Mascota mascota2 = new Mascota(10, "hembra", "bicho", "felino", "gatuno", "desparasitar");
        
        Cliente cliente1 = new Cliente("Alejandro", "Granados", "bello", "ixtapa", "los heroses", 
                5454, "mz", "casa", 4546848);
        cliente1.agregarMascota(mascota1);
        cliente1.agregarMascota(mascota2);
        
        Veterinaria vet = new Veterinaria();
        vet.agregarCliente(cliente1);
        
        //se agrega intencionalmente 2 veces al mismo cliente para que se vea que no se aceptan registros duplicados.
        vet.agregarCliente(cliente1); 
        
        vet.mostrarClientes();
        
        Mascota mascota3 = new Mascota(5, "hembra", "pancha", "reptil", "tortuga", "cambiar agua");
        cliente1.agregarMascota(mascota3);
        vet.mostrarClientes();
        
        cliente1.eliminarMascota(mascota1);
        vet.mostrarClientes();
       
    }
}
