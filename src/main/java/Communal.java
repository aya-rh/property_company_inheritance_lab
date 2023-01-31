public class Communal extends Flat {

    public Communal(String location, int numberOfRooms, boolean hasRecyclingRoom){
        super (location, numberOfRooms, hasRecyclingRoom);
    }

//    @Override
//    public String getLocation(){
//        return this.location;
//    }

    public String printLocation(){
        return "This communal flat is located in " + getLocation() + ".";
    }
}
