package com.softwareascraft.shopcrafter;

public class Item {
    private final int sku;

    public Item(int sku) {
        this.sku = sku;
    }

    public int getSKU() {
        return this.sku;
    }
}
