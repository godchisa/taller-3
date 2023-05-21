public class ListaInstrumento {
    /**
     * Variable que indica la cantidad actual y maxima de la lista
     */
    private int cantidadActual;
    private int cantidadMaxima;
    /**
     * Contenedor de instrumentos.
     */
    private ListaInstrumento listaInstrumentos[];

    /**
     * Constructor contenedor de instrumentos.
     * @param cantidadMaxima
     */
    public ListaInstrumento(int cantidadMaxima){
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = 0;
        this.listaInstrumentos = new ListaInstrumento[cantidadMaxima];
    }
    /**
     * Metodos que obtienen y cambian las variables del instrumento.
     */
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
