public abstract class Servicios {
    private String nombre;
    private String descripcion;

    public Servicios() {
    }

    public Servicios(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Servicios(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public abstract String mostrar();
    public abstract double calcularPrecio();

}
