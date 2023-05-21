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
}
