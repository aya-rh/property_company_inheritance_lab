import Model.OnSale;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OnSaleTest {

    OnSale sale;

    @BeforeEach
    public void setUp(){
        sale = new OnSale("2 bedroom communal flat in Hastings");
    }

//    @Test
//    public void canAddListingsToSale(){
//        sale.add();
//        System.out.println();
//        assertThat();
//    }


}
