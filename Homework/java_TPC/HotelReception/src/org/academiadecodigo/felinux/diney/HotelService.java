package org.academiadecodigo.felinux.diney;

public class HotelService {
    private boolean[] rooms;

    public HotelService(){
        rooms = Hotel.getRooms();
    }

    public void checkout(int roomNumber) {
        rooms[roomNumber] = false;
    }

    public int checkin() {
        int room = availableRoom();
        if (room != -1){
            rooms[room] = true;
        }
        return room;
    }

    private int availableRoom() {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms [i] == false){
                return i;
            }
        }
        return -1;
    }
}
