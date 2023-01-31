import Model.Bungalow;
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

    // method overloading test
    @Test
    void canProvideTestingInformation__noArgument(){
        String expected = "No testing is guaranteed";
        assertThat(bungalow.testingInformation()).isEqualTo(expected);
    }
    @Test
    void canProvideTestingInformation__withArgument(){
        String expected = "Testing complete for all aspects of building including: apparatus, equipment, and fitting.";
        assertThat(bungalow.testingInformation("all aspects of building including: apparatus, equipment, and fitting")).isEqualTo(expected);
    }

}
