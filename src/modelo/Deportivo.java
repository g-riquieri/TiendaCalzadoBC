package modelo;

public class Deportivo extends Calzado {

    private String tipoDeporte;
    private String tipoMaterial;

    public Deportivo(Producto producto, String diaVenta, int talle, String tipoDeporte, String tipoMaterial) {
        super(producto, diaVenta, talle);
        this.tipoDeporte = tipoDeporte;
        this.tipoMaterial = tipoMaterial;
    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }
}
