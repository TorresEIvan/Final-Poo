import java.util.ArrayList;

public class Combos extends Servicios{
    private int descuento;
    ArrayList <Servicios> combos;

    public Combos() { super();
    }


    public Combos(String nombre){
        super(nombre);
        combos = new ArrayList<>();
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    public void agregarServicios (Servicios servicios) {
        combos.add(servicios);
    }

    @Override
    public String mostrar() {
        return "Nombre: " + getNombre() + "Precio: " + calcularPrecio();
    }

    @Override
    public double calcularPrecio() {
        double total = 0;
        for (Servicios ser:combos) {
            total+= ser.calcularPrecio();
        }
        total= total - (total * descuento/100);
        return total;
    }
}
