package com.softwareascraft.shopcrafter;

import java.util.Objects;

public class Item {
    private final int sku;
    private final String name;
    private final String category;

    public Item(int sku, String name, String category) {
        this.sku = sku;
        this.name = name;

        this.category = category;
    }

    public int getSKU() {
        return this.sku;
    }

    public String getName() {
        return this.name;
    }


    public boolean hasCategory(String category) {
        return Objects.equals(this.category, category);
    }
}
