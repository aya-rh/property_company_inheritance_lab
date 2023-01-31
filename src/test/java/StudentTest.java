import Model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StudentTest {

    Student student;
    protected int location;


    @BeforeEach
    void setUp(){
        student = new Student("London", 2, true);
    }

    @Test
    void canGetLocation(){
        assertThat(student.getLocation()).isEqualTo("London");
    }

    @Test
    void bestFacility(){
        assertThat(student.bestFacility()).isEqualTo("Gym");
    }

    @Test
    void parkingSpaces(){
        assertThat(student.parkingSpaces()).isEqualTo(10);
    }

    @Test
    void calculateRent(){
        assertThat(student.calculateRent()).isEqualTo(1000);
    }

    @Test
    public String studentListing(int price) {
        return this.location + "Student Flat - Studio at " + price + ".";
    }
}
