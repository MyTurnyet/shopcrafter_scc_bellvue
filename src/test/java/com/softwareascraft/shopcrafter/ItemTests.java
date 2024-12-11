package com.softwareascraft.shopcrafter;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Tag("Unit")
class ItemTests {

    @Test
    void itemExists() {
        Item item= new Item();
        assertThat(item.getSKU()).isEqualTo(1);
    }
}
