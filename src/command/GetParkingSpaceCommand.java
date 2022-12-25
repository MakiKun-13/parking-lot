package command;

public class GetParkingSpaceCommand implements Command{
    @Override
    public void execute(ParkingLotFacade parkingLotFacade) throws Exception {
        parkingLotFacade.getSlotForCar();
    }
}
