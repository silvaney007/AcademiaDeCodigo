package org.academiadecodigo.felinux.diney;

public class Client {
    private String name;
    private int room;
    private HotelService hotelService;

    public Client(String name){
        this.name = name;
        room = -1;
        hotelService = new HotelService();
    }

    public void clientService(ServiceType service){
        switch (service){
            case CHECKIN:
                room = hotelService.checkin();
                break;
            case CHECKOUT:
                if(room != -1) {
                    hotelService.checkout(room);
                }
                break;
        }
        serviceMessage(service);
    }

    private void serviceMessage(ServiceType service){
        switch (service){
            case CHECKIN:
                if(room != -1){
                    System.out.println("Thanks for the preference, your room number is "
                            + room +", have a good stay");
                }else {
                    System.out.println("Sorry, we don't have rooms available at moment");
                }
                break;
            case CHECKOUT:
                if(room != -1){
                    System.out.println("We loved to have you with us during this stay, " +
                            "you will be always welcome");
                }else {
                    System.out.println("Sorry, check-out can only be done by our customers, " +
                            "if you prefer you can do a check-in");
                }
                break;
        }


    }

}
