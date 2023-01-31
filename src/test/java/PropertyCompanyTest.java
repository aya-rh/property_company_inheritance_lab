import Model.Bungalow;
import Model.PropertyCompany;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PropertyCompanyTest {

    PropertyCompany propertyCompany;

    @BeforeEach
    void setUp(){
        propertyCompany = new PropertyCompany("Aya's Property");
    }

    @Test
    void canCountBuildings(){
        assertThat(propertyCompany.countBuildings()).isEqualTo(0);
    }

    @Test
    void canAddBuildings(){
        Bungalow bungalow = new Bungalow("Brighton",3, true);
        propertyCompany.addBuildings(bungalow);
        assertThat(propertyCompany.countBuildings()).isEqualTo(1);
    }

    @Test
    void canRemoveBuildings(){
      Bungalow bungalow = new Bungalow("Brighton", 3, true);
      propertyCompany.removeBuildings(bungalow);
      assertThat(propertyCompany.countBuildings()).isEqualTo(0);
    }

}
