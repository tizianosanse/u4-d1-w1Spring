package tizianosanseverino.pizza.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Menu {
   @Bean
    public Pizza getPizza() {
       return new Pizza("pizza margherita","mozzarella e pomodoro",5);
   };
   @Bean
    public Toppings getTop(){
       return new Toppings("Cheese","92 calorie",1);
   }
    @Bean
    public Drinks getDrink(){
        return new Drinks("Lemonade","128 calorie",2);
    }

}
