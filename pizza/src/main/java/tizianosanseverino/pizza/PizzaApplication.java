package tizianosanseverino.pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tizianosanseverino.pizza.entities.Drinks;
import tizianosanseverino.pizza.entities.Pizza;
import tizianosanseverino.pizza.entities.Toppings;

@SpringBootApplication
public class PizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzaApplication.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PizzaApplication.class);
		Pizza pizza = ctx.getBean(Pizza.class);
		Toppings top = ctx.getBean(Toppings.class);
		Drinks drink = ctx.getBean(Drinks.class);
		System.out.println(pizza);
		System.out.println(top);
		System.out.println(drink);

		ctx.close();



	}

}
