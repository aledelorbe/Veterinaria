package domain;
import java.util.Objects;


public class Mascota {
    
    private String nombre;
    private int edad;
    private String genero;
    private String raza;
    private String especie;
    private String descripcion;

    
    //Constructor para buscar una mascota. Contiene los datos necesarios para saber si dos mascotas son iguales o no.
    // Tambien se utilizo para buscar a determinada mascota de entre todas las que tiene determinado cliente.
    public Mascota(String nombre, String especie, String descripcion) {
        this.nombre = nombre;
        this.especie = especie;
        this.descripcion = descripcion;
    }

    // Constructor de todos los datos que deberia tener un cliente.
    public Mascota(String nombre, int edad, String genero, String raza, String especie, String descripcion) {
        this.edad = edad;
        this.genero = genero;
        this.nombre = nombre;
        this.raza = raza;
        this.especie = especie;
        this.descripcion = descripcion;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
    
    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", raza=" + raza + ", especie=" + especie + ", descripcion=" + descripcion + '}';
    }

    // A diferencia de la clase cliente, aqui si se utiliza el metodo equals, pues los datos nombre, especie 
    // y descripcion, son datos con los cuales no interactua una segunda vez un usuario, es decir, no son insertados 
    // una segunda vez a traves del teclado si no son extraidos de el jTable, entonces forzosamente tendran los mismos
    // caracteres minusculos y mayusculos.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mascota other = (Mascota) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.especie, other.especie)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        return true;
    }
}
