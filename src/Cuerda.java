public class Cuerda extends Instrumento{
    private String tipoCuerda;
    private int numCuerdas;
    private String tipoSonido;
    public Cuerda(String tipo, String codigo, int precio, int stock, String material, String tipoCuerda, int numCuerdas, String tipoSonido) {
        super(tipo, codigo, precio, stock, material);
        this.tipoCuerda = tipoCuerda;
        this.numCuerdas = numCuerdas;
        this.tipoSonido = tipoSonido;
    }
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
