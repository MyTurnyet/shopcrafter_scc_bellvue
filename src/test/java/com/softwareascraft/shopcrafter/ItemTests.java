package com.softwareascraft.shopcrafter;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Tag("Unit")
class ItemTests {

    @Test
    void getSKUReturns1() {
        Item item= new Item(1, "Geoffrey");
        assertThat(item.getSKU()).isEqualTo(1);
    }

    @Test
    void getSKUReturns2() {
        Item item = new Item(2, "Geoffrey");
        assertThat(item.getSKU()).isEqualTo(2);
    }

    @Test
    void getNameReturnsJerry() {
        Item item = new Item(0, "Jerry");
        assertThat(item.getName()).isEqualTo("Jerry");
    }

    @Test
    void getNameReturnsGeoffrey() {
        Item item = new Item(0, "Geoffrey");
        assertThat(item.getName()).isEqualTo("Geoffrey");
    }
}
