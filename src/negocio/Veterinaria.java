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
    
    public boolean existeCliente(Cliente clienteBus, int indice[]){
        
        boolean respuesta = false;
        
        for (int i = 0; i < this.clientes.size(); i++) {
            if(this.clientes.get(i).getNombre().equalsIgnoreCase(clienteBus.getNombre()) &&
                    this.clientes.get(i).getApellidoPaterno().equalsIgnoreCase(clienteBus.getApellidoPaterno()) &&
                    this.clientes.get(i).getApellidoMaterno().equalsIgnoreCase(clienteBus.getApellidoMaterno()) )
            {
                respuesta = true;
                indice[0] = i;
            }
        }
        
        return respuesta;
    }
    
    
    public boolean existeMascota(int indice[], Mascota mascotaBus){
        
        boolean respuesta = false;
        List<Mascota> mascotas = this.clientes.get(indice[0]).getMascotas();
        
        for (int i = 0; i < mascotas.size(); i++) {
            if( mascotas.get(i).getNombre().equalsIgnoreCase(mascotaBus.getNombre()) &&
                        mascotas.get(i).getEspecie().equalsIgnoreCase(mascotaBus.getEspecie()) &&
                        mascotas.get(i).getDescripcion().equalsIgnoreCase(mascotaBus.getDescripcion()) )
            respuesta = true;
        }
        
        return respuesta;
    }
    
    
    public void agregarMascotaACliente(int indice[], Mascota mascotaIns){
        this.clientes.get(indice[0]).agregarMascota(mascotaIns);
    }
    
    public void agregarClienteYMascota(Cliente clienteIns, Mascota mascotaIns){
        clienteIns.agregarMascota(mascotaIns);
        this.clientes.add(clienteIns);
    }
            
    public void agregarClienteMascota(Cliente cliente, Mascota mascota){
        
        int indice[] = {0};
        
        if( this.existeCliente(cliente, indice) ){
            if( !this.existeMascota(indice, mascota) ){
                this.agregarMascotaACliente(indice, mascota);
            }
        }
        else
            this.agregarClienteYMascota(cliente, mascota);
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