package fs.apidef.identifyservice.java.homework15;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class Car {
    @Test
    void checkCar() {
        String car[] = new String[]{"KIA", "MAZDA", "MERCEDES", "VIOS", "HONDA"};
        assertThat(car).hasSize(5)
                .isNotNull()
                .doesNotHaveDuplicates();

    }
}

