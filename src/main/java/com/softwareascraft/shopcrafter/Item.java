package com.softwareascraft.shopcrafter;

public class Item {
    private final int sku;
    private final String name;

    public Item(int sku, String name) {
        this.sku = sku;
        this.name = name;
    }

    public int getSKU() {
        return this.sku;
    }

    public String getName() {
        return this.name;
    }
}
