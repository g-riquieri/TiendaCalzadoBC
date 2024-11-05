package modelo;

public class Formal extends Calzado {
    private String color;

    public Formal(Producto producto, String diaVenta, int talle, String color) {
        super(producto, diaVenta, talle);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
