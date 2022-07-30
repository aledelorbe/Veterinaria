package domain;

import domain.*;
import java.util.*;

public class Veterinaria {
    // Se utiliza un set para evitar duplicacion de registros en los clientes.
    private Set<Cliente> clientes = new HashSet();

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    
    
//    public void agregarCliente(Cliente cliente){
//        this.clientes.add(cliente);
//    }
    
    public void mostrarClientes(){
        this.clientes.forEach(elemento -> {
            System.out.println(elemento);
            elemento.getMascotas().forEach(mascota ->{
                System.out.println("\t" + mascota);
            });
        });
    }
    
    public Set<Mascota> busquedaMascotasCliente(Cliente clienteBus){
        
        Set<Mascota> mascotasCli = new HashSet();
        
        this.clientes.forEach(elemento->{
            if(elemento.getNombre().equalsIgnoreCase(clienteBus.getNombre()) &&
                    elemento.getApellidoPaterno().equalsIgnoreCase(clienteBus.getApellidoPaterno()) &&
                    elemento.getApellidoMaterno().equalsIgnoreCase(clienteBus.getApellidoMaterno()) )
            {
                elemento.getMascotas().forEach(mascota->{
                    mascotasCli.add(mascota);
                });
            }
            
        });
        
        return mascotasCli;
    }
    
    public void eliminarMascotaCliente(Cliente clienteBus, Mascota mascotaBus){
        
        Mascota mascotaEli = null;
        
        this.clientes.forEach(elemento->{
            if(elemento.getNombre().equalsIgnoreCase(clienteBus.getNombre()) &&
                    elemento.getApellidoPaterno().equalsIgnoreCase(clienteBus.getApellidoPaterno()) &&
                    elemento.getApellidoMaterno().equalsIgnoreCase(clienteBus.getApellidoMaterno()) )
            {
                System.out.println("elemento = " + elemento);
                
                elemento.getMascotas().forEach(mascota->{
                    if(mascota.getNombre().equalsIgnoreCase(mascotaBus.getNombre()) &&
                    mascota.getEspecie().equalsIgnoreCase(mascotaBus.getEspecie()) &&
                    mascota.getDescripcion().equalsIgnoreCase(mascotaBus.getDescripcion()) )
                    {
//                        mascotaEli = mascota;
                        System.out.println("mascota " + mascota);
                    
                    }
                });
            }
            
        });
        
    }
    
    public boolean validarExistenciaCliente(Cliente clienteBus){
        boolean respuesta = false;
        
        if( this.clientes.contains(clienteBus) )
            respuesta = true;
        
        return respuesta;
    }
    
//    public void agregarClienteMascota(Cliente clienteBus, Mascota mascotaIn){
//        
//        this.clientes.forEach(cliente->{
//            if(cliente.getNombre().equalsIgnoreCase(clienteBus.getNombre()) &&
//                    cliente.getApellidoPaterno().equalsIgnoreCase(clienteBus.getApellidoPaterno()) &&
//                    cliente.getApellidoMaterno().equalsIgnoreCase(clienteBus.getApellidoMaterno()) )
//            {
//                cliente.agregarMascota(mascotaIn);
//                return;
//            }
//        });
//        
////        clienteBus.agregarMascota(mascotaIn);
////        this.clientes.add(clienteBus);
//    }
    
    
    public void agregarClienteMascota(Cliente clienteBus, Mascota mascotaIn){

        this.clientes.forEach(cliente->{
            if(cliente.getNombre().equalsIgnoreCase(clienteBus.getNombre()) &&
                    cliente.getApellidoPaterno().equalsIgnoreCase(clienteBus.getApellidoPaterno()) &&
                    cliente.getApellidoMaterno().equalsIgnoreCase(clienteBus.getApellidoMaterno()) )
                cliente.agregarMascota(mascotaIn);
        });
    }
    
    public void agregarCliente(Cliente clienteBus, Mascota mascotaIn){
    
        clienteBus.agregarMascota(mascotaIn);
        this.clientes.add(clienteBus);
    }
}