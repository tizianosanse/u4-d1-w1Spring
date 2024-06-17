package tizianosanseverino.pizza.entities.abstracts;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public abstract class MenuElement {
    private String name;
    private String description;
    private int price;

public MenuElement(String name, String description, int price) {
    this.name = name;
    this.description = description;
    this.price = price;
}
}
