package modelo;

public class Peaje {
    
    private int id;
    private String nombre;
    private String direccion;
    private String Lugar;

    public Peaje(int id, String nombre, String direccion, String Lugar) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.Lugar = Lugar;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    @Override
    public String toString() {
        return "Peaje{" + "id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", Lugar=" + Lugar + '}';
    }

}
