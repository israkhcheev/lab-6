package dto;

import dto.item.Item;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
@EqualsAndHashCode
public class Cart {

    private final List<Item> items = new ArrayList<>();

    public boolean addItem(Item item) {
        return this.items.add(item);
    }

    public Item getItem(int index) {
        try {
            return items.get(index);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    public double getSummary() {
        return items.stream()
                .mapToDouble(Item::getPrice)
                .sum();
    }

    public boolean doOrder() {
        items.clear();
        return true;
    }

    public int size() {
        return items.size();
    }




}
