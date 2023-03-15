package eliteHotelSource;

import java.util.Arrays;

public class Hotel {

    private String[] rooms;

    public Hotel(int roomLength) {
        this.rooms = new String[roomLength];

    }

    //    public  void bookRoom()
    public String bookRoom(String username) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {

                rooms[i] = username;
                break;
            }
        }
        return "Room successfully booked!!!";
    }

    public boolean hasCheckedOut(int roomNumber) {
        boolean hasCheckedOut = false;
        if (rooms[roomNumber - 1] != null) {
            rooms[roomNumber - 1] = null;
            hasCheckedOut = true;
        }

        return hasCheckedOut;

    }

    public int getRooms() {
        return rooms.length;
    }

    public int getAllAvailableRooms() {
        int availableRooms = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                availableRooms++;
            }
        }
        return availableRooms;
    }

    public int getBookedRoom() {
        int bookedRoom = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                bookedRoom++;
            }
        }
        return bookedRoom;
    }

    public int getRoomGuest() {
        int getRoomGuest = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                getRoomGuest++;
            }
        }
        return getRoomGuest;
    }

    public String getAllRoomGuest() {
        String[] names = new String[getBookedRoom()];
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                names[i] = rooms[i];
            }
        }
        return Arrays.toString(names);
    }

//    public String getAllAvailableRooms(user) {
//
//         user if (rooms[i]==toString()) rooms[+i] = user;
// getAllAvailableRooms =rooms.length-bookRoom()   }
//     }
//    return "All rooms are Available!!!";

}

