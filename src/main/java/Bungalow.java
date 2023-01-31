public class Bungalow extends Building {

    private boolean hasCentralHeating;


    public Bungalow(String location, int numberOfRooms, boolean hasCentralHeating){
        super (location, numberOfRooms);
        this.hasCentralHeating = hasCentralHeating;
    }

    @Override
    public String getLocation(){
        return this.location;
    }
}
