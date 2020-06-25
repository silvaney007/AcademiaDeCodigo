package org.academiadecodigo.felinux.diney.hotel;

public class Hotel {
    private String name;
    private boolean[] rooms;


    public Hotel(String name, int numberRooms){
    this.name = name;
    rooms = new boolean[numberRooms];
    }

    public boolean[] getRooms() {
        return rooms;
    }
    public void updateRooms(int numberRoom, boolean update){
        rooms[numberRoom] = update;
    }
}
