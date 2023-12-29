package LA5Q;

public class Passenger {
    private String name;
    private int seatNum;
    private int age;
    public Passenger(){
        this.name = "Nathan Shang";
        this.seatNum = 001;
    }
    public Passenger(String name, int seatNum, int age){
        this.name = name;
        this.seatNum = seatNum;
        this.age = age;
    }

    public String toString() {
        return String.format("{Name: %s, Seat Number: %d, Age: %d} ", name, seatNum, age);
    }
}
