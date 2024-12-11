package com.softwareascraft.shopcrafter;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Tag("Unit")
class CategoryTests {
    @Test
    void pants() {
        ItemCategory itemCategory = new ItemCategory();
        assertThat(itemCategory.isCategory("Food")).isTrue();
    }
}
