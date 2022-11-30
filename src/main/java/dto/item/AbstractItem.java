package dto.item;

import dto.Catalog;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
public abstract class AbstractItem implements Item {

    private String name;
    private double price;
    private Catalog catalog;

    public AbstractItem(String name, double price, Catalog catalog) {
        this.name = name;
        this.price = price;
        this.catalog = catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
        catalog.
    }
}
