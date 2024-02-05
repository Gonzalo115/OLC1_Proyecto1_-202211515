package Clases;

public class Documento {
    int id;
    String nombre;
    String ruta; 

    public Documento(int id, String nombre, String ruta) {
        this.id = id;
        this.nombre = nombre;
        this.ruta = ruta;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
}
