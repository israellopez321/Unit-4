package ejemplo1;

import ejemplo1.PizzaEnumeradores.EstadoPizza;
import ejemplo1.PizzaEnumeradores.TamanoPizza;
import ejemplo1.PizzaEnumeradores.TipoPizza;

public class PrincipalPizza {
	public static void main(String[] args) {
		
		PizzaEnumeradores pizza1 = new PizzaEnumeradores(TamanoPizza.valueOf("FAMILIAR") , TipoPizza.valueOf("MARGARITA") , EstadoPizza.valueOf("PEDIDA"));
		
		
		
	}
}
