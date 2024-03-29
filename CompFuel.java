package compfuel;

class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;
    
    int range() {
        return mpg * fuelcap;
    }
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

public class CompFuel {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        double gallons;
        int dist = 252;
        
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 21;
        
        gallons = minivan.fuelneeded(dist);
        
        System.out.println("To go " + dist + " miles minivan needs " + 
                gallons + " gallons of fuel.");
        
        gallons = sportscar.fuelneeded(dist);
        
        System.out.println("To go " + dist + " miles sportscar needs " + 
                gallons + "gallons of fuel.");
    }
}
