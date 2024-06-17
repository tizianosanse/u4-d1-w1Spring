package tizianosanseverino.pizza.entities;

import lombok.Getter;
import lombok.ToString;
import tizianosanseverino.pizza.entities.abstracts.MenuElement;

@ToString
@Getter
public class Drinks extends MenuElement {

    public Drinks(String name, String description, int price) {
        super(name, description, price);
    }
}
