package vista;

import modelo.Deportivo;
import modelo.Hombre;
import modelo.Mujer;
import modelo.Producto;

public class App {
    public static void main(String[] args) {
        Producto prod = new Producto("123ASD",5,100000) ; //Constructor

        Hombre hombre = new Hombre(prod,"semana",45,"rojo");

        Mujer mujer = new Mujer(prod,"fin de semana",36,"verde", 5);

        Deportivo deportivo = new Deportivo(prod,"semana",44,"HEMA","cuero") ;

        System.out.println("Código de producto: " + prod.getCodigo());
        System.out.println("Stock de producto: " + prod.getStock());
        System.out.println("Precio vase de producto: " + prod.getValorBase());
        System.out.println("el valor de venta del producto es: "+deportivo.valorVenta());
        System.out.println("el valor de IVA del producto es: "+deportivo.impuestoIVA());
    }
}
