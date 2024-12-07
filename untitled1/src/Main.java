public class Main {
    public static void main(String[] args) {

        HotelSystem hotelSystem = HotelSystem.getInstance();


        hotelSystem.addRoom(new Room(101, "Single"));
        hotelSystem.addRoom(new Room(102, "Double"));

        hotelSystem.addBooking(new Booking("Roman Postol", 101, "2024-12-01", "2024-12-05"));
        hotelSystem.addBooking(new Booking("Andrey Kostenko", 102, "2024-12-02", "2024-12-06"));

        System.out.println("Rooms:");
        for (Room room : hotelSystem.getRooms()) {
            System.out.println(room);
        }

        System.out.println("\nBookings:");
        for (Booking booking : hotelSystem.getBookings()) {
            System.out.println(booking);
        }
    }
}