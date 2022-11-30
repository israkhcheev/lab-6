package dto.item;

import dto.Catalog;

public interface Item {

    String getName();

    void setName(String name);

    double getPrice();

    void setPrice(double price);

    Catalog getCatalog();

    void setCatalog(Catalog catalog);

}
