public class ListaInstrumento {
    private int cantidadActual;
    private int cantidadMaxima;
    private ListaInstrumento listaInstrumentos[];
    public ListaInstrumento(int cantidadMaxima){
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = 0;
        this.listaInstrumentos = new ListaInstrumento[cantidadMaxima];
    }
    public int getCantidadActual() {
        return cantidadActual;
    }
    public int getCantidadMaxima() {
        return cantidadMaxima;
    }
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }
}
