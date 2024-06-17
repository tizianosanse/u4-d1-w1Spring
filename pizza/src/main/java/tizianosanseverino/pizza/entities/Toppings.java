package tizianosanseverino.pizza.entities;

import lombok.Getter;
import lombok.ToString;
import tizianosanseverino.pizza.entities.abstracts.MenuElement;


@ToString
@Getter
public class Toppings extends MenuElement {
    public Toppings(String name, String description, int price) {
        super(name, description, price);
    }
}
