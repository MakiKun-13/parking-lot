package vehicle;

import parkingLot.Slot;

public abstract class Car {
    private int Id;
    private String registrationNo;
    private String vehicleType;

    public int getId() {
        return Id;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void park(Slot s) {
        s.setAvailability(false);
    }
    public void leave(Slot s) {
        s.setAvailability(true);
    }

    @Override
    public String toString() {
        return "Car Details :\n" +
                "Id = " + Id +
                ", RegistrationNo = '" + registrationNo + '\'' +
                ", Vehicle Type = '" + vehicleType;
    }
}
