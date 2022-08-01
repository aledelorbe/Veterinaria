package domain;

import domain.*;
import java.util.*;

public class Veterinaria {
    
    private List<Cliente> clientes = new ArrayList();

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    
    public void mostrarClientes(){
        this.clientes.forEach(cliente -> {
            System.out.println(cliente);
            cliente.getMascotas().forEach(mascota ->{
                System.out.println("\t" + mascota);
            });
        });
    }
    
    public List<Mascota> busquedaMascotasCliente(Cliente clienteBus){
        List<Mascota> mascotasCli = new ArrayList();
        
        this.clientes.forEach(cliente->{
            if(cliente.getNombre().equalsIgnoreCase(clienteBus.getNombre()) &&
                    cliente.getApellidoPaterno().equalsIgnoreCase(clienteBus.getApellidoPaterno()) &&
                    cliente.getApellidoMaterno().equalsIgnoreCase(clienteBus.getApellidoMaterno()) )
            {
                cliente.getMascotas().forEach(mascota->{
                    mascotasCli.add(mascota);
                });
            }
            
        });
        
        return mascotasCli;
    }
    
    public void agregarClienteMascota(Cliente clienteBus, Mascota mascotaIn){
        
        if( this.clientes.isEmpty() )
        {
            clienteBus.agregarMascota(mascotaIn);
            this.clientes.add(clienteBus);
        }
        else
        {
            int i, respuesta = 0;
            
            for (i = 0; i < this.clientes.size(); i++) {
//                if ( this.clientes.get(i).equals(clienteBus) )
                if(this.clientes.get(i).getNombre().equalsIgnoreCase(clienteBus.getNombre()) &&
                    this.clientes.get(i).getApellidoPaterno().equalsIgnoreCase(clienteBus.getApellidoPaterno()) &&
                    this.clientes.get(i).getApellidoMaterno().equalsIgnoreCase(clienteBus.getApellidoMaterno()) )
                {
                    respuesta = 1;
                    break;
                }
            }
            
            if( respuesta == 1 )
                this.clientes.get(i).agregarMascota(mascotaIn);
            else{
                clienteBus.agregarMascota(mascotaIn);
                this.clientes.add(clienteBus);
            }
        }
    }
    
    
    
    //quizas quitar el equals por puros ignoreCase.
    //Validar que no se agrege una misma mascota dos veces.
    
    public void eliminarMascotaCliente(Cliente clienteBus, Mascota mascotaBus){

        for (int i = 0; i < this.clientes.size(); i++) {
            if(this.clientes.get(i).getNombre().equalsIgnoreCase(clienteBus.getNombre()) &&
                    this.clientes.get(i).getApellidoPaterno().equalsIgnoreCase(clienteBus.getApellidoPaterno()) &&
                    this.clientes.get(i).getApellidoMaterno().equalsIgnoreCase(clienteBus.getApellidoMaterno()) )
            {
                System.out.println("si existe el cliente");
                for (int j = 0; j < this.clientes.get(i).getMascotas().size(); j++) {
                    if( this.clientes.get(i).getMascotas().get(j).equals(mascotaBus) )
                    {
                        System.out.println("si existe la mascota");
                        System.out.println("mascota: " + this.clientes.get(i).getMascotas().get(j));
                        this.clientes.get(i).getMascotas().remove(j);
                    }
                }
               
            }
                
        }
    }
}