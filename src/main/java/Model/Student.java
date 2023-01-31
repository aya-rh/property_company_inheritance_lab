package Model;

import Interface.IStudent;
import Model.Flat;

public class Student extends Flat implements IStudent {


    public Student(String location, int numberOfRooms, boolean hasRecyclingRoom){
        super (location, numberOfRooms, hasRecyclingRoom);
    }

    public String getLocation(){
        return this.location;
    }

    @Override
    public String studentListing(int price) {
        return this.location + "Student Flat - Studio at " + price + ".";
    }
}
