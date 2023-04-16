public class Simples extends Servicios{
    private double precioBase;
    private boolean colocacion;

    public Simples() { super();
    }
    public Simples (String nombre) {
        super(nombre);
    }

    public Simples(String nombre, double precioBase) {
        super(nombre);
        this.precioBase = precioBase;
    }

    public Simples(String nombre, double precioBase, boolean colocacion) {
        super(nombre);
        this.precioBase = precioBase;
        this.colocacion = colocacion;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setColocacion(boolean colocacion) {
        this.colocacion = colocacion;
    }

    @Override
    public String mostrar() {
        return  "Nombre: " + getNombre() + "Precio: " + calcularPrecio();
    }

    @Override
    public double calcularPrecio() {
        if (colocacion){
            return precioBase*1.1;
        }
        return precioBase;
    }

    }
