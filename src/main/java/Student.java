public class Student extends Flat {


    public Student(String location, int numberOfRooms, boolean hasRecyclingRoom){
        super (location, numberOfRooms, hasRecyclingRoom);
    }

    public String getLocation(){
        return this.location;
    }
}
