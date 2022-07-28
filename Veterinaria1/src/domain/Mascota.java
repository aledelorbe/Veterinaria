package domain;


import java.util.ArrayList;


public class Mascota {
    private static int contadorMascotas;
    
    private final int IdMascota;
    private int edad;
    private String genero;
    private String nombre;
    private String raza;
    private String especie;
    private String descripcion;

    private Mascota() {
        this.IdMascota = ++Mascota.contadorMascotas;
    }

    public Mascota(int edad, String genero, String nombre, String raza, String especie, String descripcion) {
        this();
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
        return "Mascota{" + "IdMascota=" + IdMascota + ", edad=" + edad + ", genero=" + genero + ", nombre=" + nombre + ", raza=" + raza + ", especie=" + especie + ", descripcion=" + descripcion + '}';
    }
    
    
    
    
}
