public class ServicioFactory {
    private static ServicioFactory instancia;


    public final String SIMPLE = "Simple";

    public final String COMBO = "Combo";

    private ServicioFactory() {}

    public static ServicioFactory obtenerInstancia(){
        if (instancia == null){
            instancia = new ServicioFactory();
        }
        return instancia;
    }
    public Servicios crearServicios (String codigo, String nombre){
        switch (codigo) {
            case "Simple":
                return new Simples(nombre);
            case "Combo":
                return new Combos(nombre);
        }
        return null;
    }
}
