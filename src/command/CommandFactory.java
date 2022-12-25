package command;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
    Map<String, Command> commands = new HashMap<>();

    public void init() {
        commands.put("CREATE_PARKING_LOT", new CreateParkingLotCommand());
        commands.put("GET_PARKING_SPACE", new GetParkingSpaceCommand());
        commands.put("LEAVE_PARKING_SPACE", new LeaveParkingSpaceCommand());
    }

    public void handleInput(String choice) throws Exception {
        if (commands.containsKey(choice)) {
            ParkingLotFacade parkingLotFacade = new ParkingLotFacade();
            commands.get(choice).execute(parkingLotFacade);
        }
        else {
            System.out.println("Invalid Command");
        }
    }


}
