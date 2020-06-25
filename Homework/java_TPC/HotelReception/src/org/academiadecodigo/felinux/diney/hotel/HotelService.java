package org.academiadecodigo.felinux.diney.hotel;

public class HotelService {
    private static Hotel hotel;

    public HotelService(Hotel hotel){
        this.hotel = hotel;
    }

    public void checkout(int roomNumber) {
        hotel.updateRooms(roomNumber,false);
    }

    public int checkin() {
        int room = availableRoom();
        if (room != -1){
            hotel.updateRooms(room,true);
        }
        return room;
    }

    private int availableRoom() {
        boolean[] rooms = hotel.getRooms();
        for (int i = 0; i < rooms.length; i++) {
            if (rooms [i] == false){
                return i;
            }
        }
        return -1;
    }
}
