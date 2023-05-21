public class SistemaImpl implements Sistema{
    /**
     * Método que actúa como Main
     */
    public SistemaImpl() {
        menuSistema();
    }
    @Override
    public void menuSistema() {
        ManagerCSV archivo = new ManagerCSV();
        archivo.leerArchivos(
                "C:\\Users\\gabri\\Downloads\\TALLER 3\\archivo csv\\Almacen.csv");
    }

    @Override
    public void agregarInstrumento() {

    }

    @Override
    public void venderInstrumento() {

    }

    @Override
    public void consultaInventarioTipo() {

    }

    @Override
    public void consultaInventarioCodigo() {

    }

    @Override
    public void datosInstrumento() {

    }

    @Override
    public void salir() {

    }
}
