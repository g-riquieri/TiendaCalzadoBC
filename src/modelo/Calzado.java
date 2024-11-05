package modelo;

public class Calzado {

    protected Producto producto;
    protected String diaVenta;
    protected int talle;

    public Calzado(Producto producto, String diaVenta, int talle) {
        this.producto = producto;
        this.diaVenta = diaVenta;
        this.talle = talle;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getDiaVenta() {
        return diaVenta;
    }

    public void setDiaVenta(String diaVenta) {
        this.diaVenta = diaVenta;
    }

    public int getTalle() {
        return talle;
    }

    public void setTalle(int talle) {
        this.talle = talle;
    }

    public int valorVenta(){
        int valorVenta = -1;

        if(this.diaVenta.equalsIgnoreCase("semana")){
            valorVenta = (int) this.producto.getValorBase() - Math.round(this.producto.getValorBase()*15/100);
        }else if(this.diaVenta.equalsIgnoreCase("fin de semana")){};

        return valorVenta;
    }

}
