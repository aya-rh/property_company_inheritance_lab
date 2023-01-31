package Model;

public abstract class Building {

    protected String location;
    private int numberOfRooms;


    public Building(String location, int numberOfRooms){
        this.location = location;
        this.numberOfRooms = numberOfRooms;
    }

    public String getLocation(){
        return this.location;
    }

    public double calculateRent(){
      if (getLocation().equals("London")){
          return 1000;
      } else if (getLocation().equals("Manchester")){
          return 400;
      } else {
          return 500;
      }
    }


}
