package command;

import parkingLot.ParkingLot;

public class CreateParkingLotCommand implements Command{
    @Override
    public void execute(ParkingLotFacade parkingLotFacade) {
        parkingLotFacade.createParkingLot();
        //System.out.println("Parking Lot Created");
    }
}
