package dia5;

import java.util.ArrayList;
import java.util.Arrays;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Producto> stock = new ArrayList<Producto>();
		
	    int x[] = {3,6,5,1,8,9};
	    String h[] = {"Manuel","Zacarias","Alberto"};
	    Arrays.sort(h);
	    Arrays.sort(x);
		
		//compareTo
		//stock.add(new Producto("WE34","HP",350));
		stock.add(new Ordenador("TR56","Lenovo",450,500,16));
		stock.add(new Camiseta("ER56","Nike",50,"XL"));
		
		//Ordenar productos por precio
		stock.sort(null);
		
		//Aplicar descuento a todos los productos.
		
		//Como no podemos a todos , sólo a los ordenadores
	/*	for(Producto p:stock) {
			//Convertir p a ordenador.
			if(p instanceof Ordenador) {
				Ordenador o = (Ordenador)p;
				o.aplicarDescuento();
			}
			else if(p instanceof Camiseta) {
				Camiseta c = (Camiseta)p;
				c.aplicarDescuento();
			}
		}*/
		
		for(Producto p : stock) {
			p.aplicarDescuento();
		}
		
		
		//Mostrar el stock
		for(Producto p : stock) {
			System.out.println(p);
		}
		
		
	}

}
