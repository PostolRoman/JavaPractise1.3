import java.util.ArrayList;
import java.util.List;


class HotelSystem {
    private static HotelSystem instance; // Singleton instance
    private List<Room> rooms;
    private List<Booking> bookings;

    private HotelSystem() {
        rooms = new ArrayList<>();
        bookings = new ArrayList<>();
    }

    public static HotelSystem getInstance() {
        if (instance == null) {
            instance = new HotelSystem();
        }
        return instance;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
        // Позначити кімнату як зайняту
        for (Room room : rooms) {
            if (room.getRoomNumber() == booking.getRoomNumber()) {
                room.setOccupied(true);
            }
        }
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Booking> getBookings() {
        return bookings;
    }
}
