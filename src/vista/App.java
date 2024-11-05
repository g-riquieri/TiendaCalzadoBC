package vista;

import modelo.Deportivo;
import modelo.Producto;

public class App {
    public static void main(String[] args) {
        Producto prod = new Producto("123ASD",5,120000) ; //Constructor

        Deportivo deportivo = new Deportivo(prod,"semana",44,"HEMA","cuero") ;

        System.out.println("Código de producto: " + prod.getCodigo());
        System.out.println("Stock de producto: " + prod.getStock());
        System.out.println("Precio vase de producto: " + prod.getValorBase());

        System.out.println(deportivo);
    }
}
