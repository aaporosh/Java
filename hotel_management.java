import java.util.ArrayList;
import java.util.List;

class Room {
    private int roomNo;
    private String roomType;
    private double rate;
    private boolean isAvailable;

    public Room(int roomNo, String roomType, double rate) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.rate = rate;
        this.isAvailable = true; // Room is initially available
    }

    public int getRoomNo() {
        return roomNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getRate() {
        return rate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

class Guest {
    private String guestName;

    public Guest(String guestName) {
        this.guestName = guestName;
    }

    public String getGuestName() {
        return guestName;
    }
}

class Reservation {
    private Guest guest;
    private Room room;

    public Reservation(Guest guest, Room room) {
        this.guest = guest;
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public Room getRoom() {
        return room;
    }
}

public class hotel_management{
    private List<Room> rooms;
    private List<Reservation> reservations;

    public hotel_management() {
        rooms = new ArrayList<>();
        reservations = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void displayAvailableRooms() {
        System.out.println("Available Rooms:");
        for (Room room : rooms) {
            if (room.isAvailable()) {
                System.out.println("Room No: " + room.getRoomNo() +
                        ", Type: " + room.getRoomType() +
                        ", Rate: $" + room.getRate());
            }
        }
    }

    public void makeReservation(Guest guest, Room room) {
        if (room.isAvailable()) {
            room.setAvailable(false);
            Reservation reservation = new Reservation(guest, room);
            reservations.add(reservation);
            System.out.println("Reservation made for " + guest.getGuestName() +
                    " in Room No " + room.getRoomNo());
        } else {
            System.out.println("Room is not available for reservation.");
        }
    }

    public static void main(String[] args) {
       hotel_management hotelSystem = new hotel_management();

        // Adding rooms to the system
        hotelSystem.addRoom(new Room(101, "Single", 100.0));
        hotelSystem.addRoom(new Room(102, "Double", 150.0));
        hotelSystem.addRoom(new Room(103, "Suite", 200.0));

        // Display available rooms
        hotelSystem.displayAvailableRooms();

        // Making a reservation
        Guest guest1 = new Guest("John Doe");
        hotelSystem.makeReservation(guest1, hotelSystem.rooms.get(0));

        // Display available rooms after reservation
        hotelSystem.displayAvailableRooms();
    }
}

