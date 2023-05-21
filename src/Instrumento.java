public class Instrumento {
    /**
     * Asignamos atributos
     */
    private String tipo;
    private String codigo;
    private int precio;
    private int stock;
    private String material;
    public Instrumento(String tipo, String codigo, int precio, int stock, String material) {
        this.tipo = tipo;
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
        this.material = material;
    }

    /**
     * hacemos los getter
     * @return
     */
    public String getTipo() {
        return tipo;
    }
    public String getCodigo() {
        return codigo;
    }
    public int getPrecio() {
        return precio;
    }
    public int getStock() {
        return stock;
    }
    public String getMaterial() {
        return material;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
}
