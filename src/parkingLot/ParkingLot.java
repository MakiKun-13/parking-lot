package parkingLot;

import vehicle.Car;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private int totalSlot;
    private List<Slot> slots = new ArrayList<>();
    Ticket ticket;

    public ParkingLot(int totalSlot) {
        this.totalSlot = totalSlot;
        createSlots();
    }

    public void createSlots() {
        for (int i=0;i<totalSlot;i++) {
            Slot s = new Slot(i,true);
            slots.add(s);
        }
    }

    protected boolean checkAvailability() {
        for (Slot s: slots) {
            if(s.isAvailability())
                return true;
        }
        return false;
    }
    public Slot getAvailableSlot() {
        for (Slot s: slots) {
            if(s.isAvailability())
                return s;
        }
        return null;
    }
    private Ticket generateTicket(Car c, Slot slot) {
        return new Ticket(c, slot);
    }
    private Bill generateBill(Ticket ticket) {
        Bill bill = new Bill(ticket.getCar(), ticket, LocalTime.now());
        System.out.println(bill.toString());
        return bill;
    }

    public void bookSlotForCar(Car car) throws Exception {
        if(checkAvailability()) {
            Slot slot = getAvailableSlot();
            ticket= generateTicket(car,slot);
            car.park(slot);
            System.out.println(slot.toString());
        }
        else
            throw new Exception("No slots Available");
    }

    public void handleExitForCar() {
        ticket.getCar().leave(ticket.getSlot());
        generateBill(ticket);
    }

    private void deleteSlot(Slot s){
        slots.remove(s);
    }
    private void addSlot(Slot s){
        slots.add(s);
    }

    @Override
    public String toString() {
        return "Parking Lot Created with " +
                "Total Slot = " + totalSlot;
    }
}
