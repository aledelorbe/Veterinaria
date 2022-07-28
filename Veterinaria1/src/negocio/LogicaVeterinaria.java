//
//package negocio;
//
//import domain.*;
//import java.util.*;
//
//public class LogicaVeterinaria {
//    
//    private Veterinaria vet = new Veterinaria();
//    
//    public void altaCliente(Cliente cliente)
//    {
//        this.vet.getClientes().add(cliente);
//    }
//    
//    public List<Mascota> busquedaMascotas(Cliente clienteBus)
//    {
//        List<Mascota> mascotasCli = null;
//        
//        this.vet.getClientes().forEach(elemento -> {
//            if( elemento.getNombre().equals(clienteBus.getNombre()) && 
//                    elemento.getApellidoPaterno().equals(clienteBus.getApellidoPaterno()) && 
//                    elemento.getApellidoMaterno().equals(clienteBus.getApellidoMaterno()) )
//            {
//                mascotasCli = elemento.getMascotas();
//            }
//        
//        });
//        
//        return mascotasCli;
//    }
//}
