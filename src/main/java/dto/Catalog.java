package dto;

import dto.item.Item;
import enums.SortEnum;
import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Data
public class Catalog {

    private static List<Item> items = new ArrayList<>();

    private String name;

    public int getSize() {
        return items.stream()
                .filter(i -> i.getCatalog().getName().equals(this.name))
                .map(i -> i.getClass().getName())
                .collect(Collectors.toSet())
                .size();
    }

    public List<Item> printAndSortCatalog(SortEnum sortBy) {
        return switch (sortBy) {
            case NAME -> print(Comparator.comparing(Item::getName));
            case PRICE -> print(Comparator.comparing(Item::getPrice));
        };
    }

    private List<Item> print(Comparator<Item> comparator) {
        AtomicLong num = new AtomicLong(0);
        return items.stream()
                .filter(i -> i.getCatalog().getName().equals(this.name))
                .sorted(comparator)
                .peek(item -> System.out.printf("%d. Название товара: %s. Цена: %f", num.getAndIncrement(), item.getName(), item.getPrice()))
                .collect(Collectors.toList());
    }

}
