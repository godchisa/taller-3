public class Percusion extends Instrumento{
    /**
     * Variable que indica el tipo de sonido del instrumento de percusion.
     */
    private String tipoSonido;
    /**
     * Variable que indica la altura del instrumento.
     */
    private String altura;

    /**
     * Constructor para los instrumentos de percusion.
     * @param tipo
     * @param codigo
     * @param precio
     * @param stock
     * @param material
     * @param tipoSonido
     * @param altura
     */

    public Percusion(String tipo, String codigo, int precio, int stock, String material, String tipoSonido, String altura) {
        super(tipo, codigo, precio, stock, material);
        this.tipoSonido = tipoSonido;
        this.altura = altura;
    }

    /**
     * Metodos que obtienen y cambian las variables del instrumento.
     */

    public String getTipoSonido() {
        return tipoSonido;
    }
    public String getAltura() {
        return altura;
    }
    public void setTipoSonido(String tipoSonido) {
        this.tipoSonido = tipoSonido;
    }
    public void setAltura(String altura) {
        this.altura = altura;
    }
}
