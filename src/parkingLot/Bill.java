package parkingLot;

import vehicle.Car;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Bill {
    private Car car;
    private Ticket ticket;

    private LocalTime outTime;

    private List<Pricing> pricing;

    public Bill(Car car, Ticket ticket, LocalTime outTime) {
        this.car = car;
        this.ticket = ticket;
        this.outTime = outTime;
    }

    private Long calculateTime(Ticket ticket, LocalTime outTime){
        LocalTime inTime = ticket.getInTime();
        Long hours = inTime.until(outTime, ChronoUnit.HOURS);
        return hours;
    }

    private Long calculateCharge(){
        String vehicleType = car.getVehicleType();
        Long chargePerHour = 0L;
        for (Pricing p: pricing) {
            if(p.getVehicleType().equalsIgnoreCase(vehicleType)) {
                chargePerHour = p.getPricePerHour();
            }
        }
        long charge = chargePerHour * calculateTime(ticket, outTime);
        return charge;
    }

    @Override
    public String toString() {
        return "Bill:\n" +
                car.toString() +
                ticket.toString() +
                ", outTime = " + outTime +
                ", pricing = " + pricing;
    }
}
