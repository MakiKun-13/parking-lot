package command;

public class LeaveParkingSpaceCommand implements Command{
    @Override
    public void execute(ParkingLotFacade parkingLotFacade) {
        parkingLotFacade.leave();
    }
}
