package parkingLot;

public class Slot {
    private int slotNumber;
    private boolean availability;

    public Slot(int slotNumber, boolean availability) {
        this.slotNumber = slotNumber;
        this.availability = availability;
    }

    public boolean isAvailability() {
        return availability;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Slot Allotted : " +
                "Slot Number = " + slotNumber;
    }
}
