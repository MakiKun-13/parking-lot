import command.CommandFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ParkingLotApplication {

    public static void main(String[] args) throws Exception {
        System.out.println("Enter Command:");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        CommandFactory commandFactory = new CommandFactory();
        commandFactory.init();
        String input = bufferedReader.readLine();
        do {
            commandFactory.handleInput(input);
            input = bufferedReader.readLine();
        } while (input.length() != 0);
    }

}
