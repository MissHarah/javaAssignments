package eliteHotelSource;

public class mainHotel {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(10);


            hotel.bookRoom("");
            hotel.getRooms();
            hotel.getAllAvailableRooms();
            hotel.getBookedRoom();
            hotel.getRoomGuest();
            hotel.getAllRoomGuest();
        }
    }
