import java.util.ArrayList;

public class ElectroYTec {
    private String razonSocial;
    ArrayList<Servicios> misServicios;

    public ElectroYTec(String razonSocial) {
        this.razonSocial = razonSocial;
        misServicios = new ArrayList<>();
    }

    public void agregarServicios(Servicios servicios) {
        misServicios.add(servicios);
    }

    public String mostrarLista() {
        String lista = "";
        for (Servicios ser : misServicios) {
            lista += ser.mostrar() + ("\n");
        }
        return lista;
    }
}
