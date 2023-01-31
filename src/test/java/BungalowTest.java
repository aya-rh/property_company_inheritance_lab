import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BungalowTest {

    Bungalow bungalow;

    @BeforeEach
    void setUp(){
        bungalow = new Bungalow("Brighton", 3, true);
    }

    @Test
    void calculateRent(){
        assertThat(bungalow.getLocation()).isEqualTo("Brighton");
    }
}
