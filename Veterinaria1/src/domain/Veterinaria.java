package domain;

import domain.*;
import java.util.*;

public class Veterinaria {
    
    // Se utiliza un set para evitar duplicacion de registros en los clientes.
    private List<Cliente> clientes = new ArrayList();

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    
    public void mostrarClientes(){
        this.clientes.forEach(elemento -> {
            System.out.println(elemento);
            elemento.getMascotas().forEach(mascota ->{
                System.out.println("\t" + mascota);
            });
        });
    }
    
    public List<Mascota> busquedaMascotasCliente(Cliente clienteBus){
        List<Mascota> mascotasCli = new ArrayList();
        
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
                if ( this.clientes.get(i).equals(clienteBus) )
                {
                    respuesta = 1;
                    break;
                }
            }
            
            if( respuesta == 1)
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
            if ( this.clientes.get(i).equals(clienteBus) )
            {
                System.out.println("si existe el cliente");
//                List<Mascota> listaM = new ArrayList(listaC.get(i).getMascotas());
                for (int j = 0; j < this.clientes.get(i).getMascotas().size(); j++) {
                    if( this.clientes.get(i).getMascotas().get(j).equals(mascotaBus) )
                    {
                        System.out.println("si existe la mascota");
                        System.out.println("mascota: " + this.clientes.get(i).getMascotas().get(j));
//                        listaM.remove(j);
                        this.clientes.get(i).getMascotas().remove(j);
                    }
                }
               
            }
                
        }
    }
}