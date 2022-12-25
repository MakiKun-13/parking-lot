package command;

public interface Command {
    public void execute(ParkingLotFacade parkingLotFacade) throws Exception;
}
