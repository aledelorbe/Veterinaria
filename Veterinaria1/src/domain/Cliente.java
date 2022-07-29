package domain;


import java.util.*;


public class Cliente {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String colonia;
    private String municipio;
    private int cp;
    private String noExterior;
    private String noInterior;
    private long telefono;
    private Set<Mascota> mascotas;

    public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno, String colonia, String municipio, int cp, String noExterior, String noInterior, long telefono) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.colonia = colonia;
        this.municipio = municipio;
        this.cp = cp;
        this.noExterior = noExterior;
        this.noInterior = noInterior;
        this.telefono = telefono;
        this.mascotas = new HashSet();
    }

    // constructor para buscar cliente.
    public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return this.apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return this.apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getColonia() {
        return this.colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getMunicipio() {
        return this.municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public int getCp() {
        return this.cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getNoExterior() {
        return this.noExterior;
    }

    public void setNoExterior(String noExterior) {
        this.noExterior = noExterior;
    }

    public String getNoInterior() {
        return this.noInterior;
    }

    public void setNoInterior(String noInterior) {
        this.noInterior = noInterior;
    }

    public long getTelefono() {
        return this.telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
        
    public Set<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(Set<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", colonia=" + colonia + ", municipio=" + municipio + ", cp=" + cp + ", noExterior=" + noExterior + ", noInterior=" + noInterior + ", telefono=" + telefono + ", mascotas=" + mascotas + '}';
    }

    public void agregarMascota(Mascota mascota){
        this.mascotas.add(mascota);
    }
    
    public void eliminarMascota(Mascota mascota){
        this.mascotas.remove(mascota);
    }
    
}
