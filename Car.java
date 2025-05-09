/**
 * Lab 10 Car class extension
 * @author Allen Russell
 *
 */
public class Car extends Vehicle {
    private int doors;
    private int passengers;

    public Car(String aMake, String aModel, String aPlate, int doors, int passengers) {
        super(aMake, aModel, aPlate);
        this.doors = doors;
        this.passengers = passengers;
    }

    public int getDoors() {
        return this.doors;
    }

    public int getPassengers() {
        return this.passengers;
    }

    public String toString() {
        return String.format("%d-Door %s %s with license %s.", this.doors, super.getMake(), super.getModel(), super.getPlate());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Car)) {
            return false;
        }

        Car other = (Car) obj;

        return super.equals(other) && this.doors == other.getDoors() && this.passengers == other.getPassengers();
    }

    public Car copy() {
        int tempDoors = this.getDoors();
        int tempPass = this.getPassengers();
        String tempMake = super.getMake();
        String tempModel = super.getModel();
        String tempPlate = super.getPlate();

        Car copy = new Car(tempMake, tempModel, tempPlate, tempDoors, tempPass);
        
        return copy;
    }
}
