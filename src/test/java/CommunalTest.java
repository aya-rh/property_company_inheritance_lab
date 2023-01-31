import Model.Communal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CommunalTest {

    Communal communal;

    @BeforeEach
    void setup(){
        communal = new Communal("Manchester", 2, false);
    }

    @Test
    void getLocation(){
        assertThat(communal.printLocation()).isEqualTo("This communal flat is located in Manchester.");
    }


}
