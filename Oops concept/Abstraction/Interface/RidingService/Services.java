package Abstraction.Interface.RidingService;

class CarRide implements Ride {
    public void bookRide(String pickup, String drop) {
        System.out.println("Car booked from " + pickup + " to " + drop + ". Enjoy luxury travel!");
    }
}

class BikeRide implements Ride {
    public void bookRide(String pickup, String drop) {
        System.out.println("Bike booked from " + pickup + " to " + drop + ". Fast and economical!");
    }
}

class AutoRide implements Ride {
    public void bookRide(String pickup, String drop) {
        System.out.println("Auto booked from " + pickup + " to " + drop + ". Affordable city travel!");
    }
}