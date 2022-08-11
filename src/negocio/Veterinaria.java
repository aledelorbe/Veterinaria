// Esta clase si bien podria pensarse que es una entidad mas del proyecto, esta clase
// contiene metodos que se encargan de validar las reglas de la aplicacion, como 
// determinar si un cliente ya existe en los registros, determinar si una mascota 
// ya existe en los registros de un mismo cliente, entre otras reglas.
package negocio;

import domain.*;
import domain.Cliente;
import domain.Mascota;
import java.util.*;

public class Veterinaria {
    
    private List<Cliente> clientes = new ArrayList();

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    // Metodo diseñado para poder saber que mascotas tiene cierto cliente.
    public void mostrarClientes(){
        this.clientes.forEach(cliente -> {
            System.out.println(cliente);
            cliente.getMascotas().forEach(mascota ->{
                System.out.println("\t" + mascota);
            });
        });
    }
    
    // Metodo que se encarga de extraer los datos de todas las mascotas que tiene 
    // cierto cliente.
    public List<Mascota> busquedaMascotasCliente(Cliente clienteBus){
        List<Mascota> mascotasCli = new ArrayList();
        
        this.clientes.forEach(cliente->{ // se busca entre todos los clientes que hay en la veterinaria.
            // Si se tiene un cliente cuyo nombre, apellido paterno y materno sean los mismo que los 
            // introducidos por el usuairo para relizar la busqueda.
            if(cliente.getNombre().equalsIgnoreCase(clienteBus.getNombre()) &&
                    cliente.getApellidoPaterno().equalsIgnoreCase(clienteBus.getApellidoPaterno()) &&
                    cliente.getApellidoMaterno().equalsIgnoreCase(clienteBus.getApellidoMaterno()) )
            {
                // Entonces extrae los datos de todas las mascotas que tiene dicho cliente.
                cliente.getMascotas().forEach(mascota->{
                    mascotasCli.add(mascota);
                });
            }
            
        });
        
        return mascotasCli;
    }
    
    // Metodo que se encarga de dar de alta a una mascota, pero validando si su
    // dueño (cliente) ya tiene datos en la veterinaria, por que de ser asi, se busca
    // los datos del dueño y se le agrega la mascota, pero si no es el caso, se da de
    // alta al cliente junto a su respectiva mascota.
    public void agregarClienteMascota(Cliente clienteBus, Mascota mascotaIn){
        
        // si no hay algun cliente registrado en la veterinaria.
        if( this.clientes.isEmpty() )
        {
            // entonces asocia a que la mascota le pertenece al cliente y da de alta a ambos en la veterinaria.
            clienteBus.agregarMascota(mascotaIn);
            this.clientes.add(clienteBus);
        }
        else // si hay clientes registrados en la veterinaria.
        {
            int i, respuesta = 0;
            
            // Buscar de entre todos los clientes, cual tiene el nombre, apellido paterno y materno iguales a los 
            // introducidos por el usuairo para relizar la alta de cliente.
            for (i = 0; i < this.clientes.size(); i++) {
                if(this.clientes.get(i).getNombre().equalsIgnoreCase(clienteBus.getNombre()) &&
                    this.clientes.get(i).getApellidoPaterno().equalsIgnoreCase(clienteBus.getApellidoPaterno()) &&
                    this.clientes.get(i).getApellidoMaterno().equalsIgnoreCase(clienteBus.getApellidoMaterno()) )
                {
                    respuesta = 1;
                    break;
                }
            }
            
            // si el cliente ya estaba dado de alta en la veterinaria.
            if( respuesta == 1 ){
                
                List<Mascota> mascotas = this.clientes.get(i).getMascotas();
                int respuesta2 = 0;
                
                // Entonces de todas sus mascotas que tiene registradas, busca si el registro de su
                // mascota ya existe.
                for (int j = 0; j < this.clientes.get(i).getMascotas().size(); j++) {
                    if( mascotas.get(j).getNombre().equalsIgnoreCase(mascotaIn.getNombre()) &&
                        mascotas.get(j).getEspecie().equalsIgnoreCase(mascotaIn.getEspecie()) &&
                        mascotas.get(j).getDescripcion().equalsIgnoreCase(mascotaIn.getDescripcion()) )
                    {
                        respuesta2 = 1;
                        break;
                    }
                }
                
                // Si la mascota no esta dada de alta, la agrega al respectivo clietne.
                if( respuesta2 == 0 )
                    this.clientes.get(i).agregarMascota(mascotaIn);
            }
            else{ 
            // si el cliente no estaba dado de alta en la veterinaria, dar de alta al cliente y dar de alta
            // a su respectiva mascota.
                clienteBus.agregarMascota(mascotaIn);
                this.clientes.add(clienteBus);
            }
        }
    }

    // Metodo diseñado para dar de baja los datos de cierta mascota la cual pertenece
    // a cierto cliente.
    public void eliminarMascotaCliente(Cliente clienteBus, Mascota mascotaBus){

        // buscar de entre todos los cliente que hay en la veterianria.
        for (int i = 0; i < this.clientes.size(); i++) {
            // Si existen los datos del cliente.
            if(this.clientes.get(i).getNombre().equalsIgnoreCase(clienteBus.getNombre()) &&
                    this.clientes.get(i).getApellidoPaterno().equalsIgnoreCase(clienteBus.getApellidoPaterno()) &&
                    this.clientes.get(i).getApellidoMaterno().equalsIgnoreCase(clienteBus.getApellidoMaterno()) )
            {
                System.out.println("si existe el cliente");
                // buscar de entre todos las mascota que tiene el cliente.
                for (int j = 0; j < this.clientes.get(i).getMascotas().size(); j++) {
                    // Si existen los datos de la mascota.
                    if( this.clientes.get(i).getMascotas().get(j).equals(mascotaBus) )
                    {
                        // Eliminar los datos de la mascota.
                        System.out.println("si existe la mascota");
                        System.out.println("mascota: " + this.clientes.get(i).getMascotas().get(j));
                        this.clientes.get(i).getMascotas().remove(j);
                    }
                }
               
            }
                
        }
    }
}