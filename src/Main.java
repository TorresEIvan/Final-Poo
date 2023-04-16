public class Main {
    public static void main(String[] args) {
        ServicioFactory creadorServicios = ServicioFactory.obtenerInstancia();
        ElectroYTec electroYTec = new ElectroYTec( "ElectroYTec");
        Simples servicio1 = (Simples) creadorServicios.crearServicios(creadorServicios.SIMPLE, "Venta Aire Acondicionado" );
        servicio1.setPrecioBase(65000);
        servicio1.setColocacion(false);
        Simples servicio2 = (Simples) creadorServicios.crearServicios(creadorServicios.SIMPLE, "Colocacion Aire Acondicionado");
        servicio2.setPrecioBase(10000);
        servicio2.setColocacion(true);
        Combos combos = (Combos) creadorServicios.crearServicios(creadorServicios.COMBO, "Full Aire Acondicionado");
        combos.agregarServicios(servicio1);
        combos.agregarServicios(servicio2);
        combos.setDescuento(10);

        electroYTec.agregarServicios(servicio1);
        electroYTec.agregarServicios(servicio2);
        electroYTec.agregarServicios(combos);

        System.out.println(electroYTec.mostrarLista());

    }
}