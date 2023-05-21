public class Cuerda extends Instrumento{
    /**
     * Variable que indica el tipo de la cuerda del instrumento.
     */
    private String tipoCuerda;
    /**
     * Variable que indica el numero de cuerdas del instrumento.
     */
    private int numCuerdas;
    /**
     * Variable que indica el tipo de sonido del instrumento de cuerda.
     */
    private String tipoSonido;

    /**
     * Constructor de instrumentos de cuerda.
     * @param tipo
     * @param codigo
     * @param precio
     * @param stock
     * @param material
     * @param tipoCuerda
     * @param numCuerdas
     * @param tipoSonido
     */
    public Cuerda(String tipo, String codigo, int precio, int stock, String material, String tipoCuerda, int numCuerdas, String tipoSonido) {
        super(tipo, codigo, precio, stock, material);
        this.tipoCuerda = tipoCuerda;
        this.numCuerdas = numCuerdas;
        this.tipoSonido = tipoSonido;
    }
    /**
     * Metodos para obtener las variables del objeto instrumento.
     */
    public String getTipoCuerda() {
        return tipoCuerda;
    }
    public int getNumCuerdas() {
        return numCuerdas;
    }
    public String getTipoSonido() {
        return tipoSonido;
    }
    public void setTipoCuerda(String tipoCuerda) {
        this.tipoCuerda = tipoCuerda;
    }
    public void setNumCuerdas(int numCuerdas) {
        this.numCuerdas = numCuerdas;
    }
    public void setTipoSonido(String tipoSonido) {
        this.tipoSonido = tipoSonido;
    }
}
