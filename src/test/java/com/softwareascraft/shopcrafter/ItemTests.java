package com.softwareascraft.shopcrafter;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Tag("Unit")
class ItemTests {

    @Test
    void getSKUReturns1() {
        Item item= new Item(1);
        assertThat(item.getSKU()).isEqualTo(1);
    }

    @Test
    void getSKUReturns2() {
        Item item = new Item(2);
        assertThat(item.getSKU()).isEqualTo(2);
    }
}
