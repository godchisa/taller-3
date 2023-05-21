public class Percusion extends Instrumento{
    private String tipoSonido;
    private String altura;
    public Percusion(String tipo, String codigo, int precio, int stock, String material, String tipoSonido, String altura) {
        super(tipo, codigo, precio, stock, material);
        this.tipoSonido = tipoSonido;
        this.altura = altura;
    }

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
