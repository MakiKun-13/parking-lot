package parkingLot;

import vehicle.Car;

import java.time.LocalTime;

public class Ticket {
    private Car car;
    private Slot slot;
    private LocalTime inTime;

    public Ticket(Car car, Slot slot) {
        this.car = car;
        this.slot = slot;
        this.inTime = LocalTime.now();
    }

    public Slot getSlot() {
        return slot;
    }

    public LocalTime getInTime() {
        return inTime;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Ticket :\n" +
                ", Slot = " + slot +
                ", In Time = " + inTime;
    }
}
