package eliteTest;

import eliteHotelSource.Hotel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HotelTest {
    Hotel hotel;
   @BeforeEach
   void startAllTestWith(){
     hotel = new Hotel(10);
   assertNotNull(hotel);
}

@Test
void testThatRoomCanBeBooked(){
        assertEquals("Room successfully booked!!!",hotel.bookRoom("kinzy"));
}
@Test
    void testUserCanCheckOut(){
        hotel.bookRoom("kinzy");
        assertTrue(hotel.hasCheckedOut(1));
}
//@Test
//    void getAllRoomsTest(){
//       hotel.bookRoom("kinzy");
//       assertTrue(hotel.hasCheckedOut(1));
//
//}
@Test
    void  getAllRoomsTest(){
       assertEquals(10,hotel.getRooms());
}
@Test
    void  getAllAvailableRooms(){
       hotel.bookRoom("taiye");
       hotel.bookRoom("kehinde");
       hotel.bookRoom("idowu");
       assertEquals(7,hotel.getAllAvailableRooms());
}
@Test
    void  getBookedRoom(){
       hotel.bookRoom("bolaji");
       hotel.bookRoom("Asiwaju");
       hotel.bookRoom("honourable");
       hotel.bookRoom("jagaban");
       assertEquals(6,hotel.getBookedRoom());
}
@Test
    void getRoomGuest(){
       hotel.bookRoom("haneefah");
       hotel.bookRoom("mariam");
       hotel.bookRoom("zainab");
       hotel.bookRoom("bola");
       hotel.bookRoom("nimah");
       hotel.bookRoom("Aisha");
       assertEquals(4,hotel.getRoomGuest());
}
@Test
    void getAllRoomGuest(){
    hotel.bookRoom("haneefah");
    hotel.bookRoom("mariam");
    hotel.bookRoom("zainab");
    hotel.bookRoom("bola");
    assertEquals("[haneefah, mariam, zainab, bola]",hotel.getAllRoomGuest());
}

    }


