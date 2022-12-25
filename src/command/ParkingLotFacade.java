package command;

import parkingLot.ParkingLot;
import parkingLot.Slot;
import parkingLot.Ticket;
import vehicle.Car;
import vehicle.TwoWheeler;

public class ParkingLotFacade {
    static ParkingLot parkingLot;
    Car car = null;

    protected void createParkingLot() {
        parkingLot = new ParkingLot(2); //This can also be taken as an input to enhance
        System.out.println(parkingLot.toString());
    }

    protected void getSlotForCar() throws Exception {
        car = new TwoWheeler();
        parkingLot.bookSlotForCar(car);
    }

    protected void leave() {
        parkingLot.handleExitForCar();
    }
}
