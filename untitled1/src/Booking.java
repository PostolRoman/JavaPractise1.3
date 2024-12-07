class Booking {
    private String guestName;
    private int roomNumber;
    private String checkInDate;
    private String checkOutDate;

    public Booking(String guestName, int roomNumber, String checkInDate, String checkOutDate) {
        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public String getGuestName() {
        return guestName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "guestName='" + guestName + '\'' +
                ", roomNumber=" + roomNumber +
                ", checkInDate='" + checkInDate + '\'' +
                ", checkOutDate='" + checkOutDate + '\'' +
                '}';
    }
}