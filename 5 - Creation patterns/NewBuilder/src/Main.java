
class House{
    private int windows;
    private int doors;
    private int rooms;
    private boolean hasGarage;
    private boolean hasStatues;
    private boolean hasSwimPool;
    private boolean hasGarden;

    public House() {
    }

    public House(int windows, int doors, int rooms, boolean hasGarage, boolean hasStatues, boolean hasSwimPool, boolean hasGarden) {
        this.windows = windows;
        this.doors = doors;
        this.rooms = rooms;
        this.hasGarage = hasGarage;
        this.hasStatues = hasStatues;
        this.hasSwimPool = hasSwimPool;
        this.hasGarden = hasGarden;
    }

    public int getWindows() {
        return windows;
    }

    public House setWindows(int windows) {
        this.windows = windows;
        return this;
    }

    public int getDoors() {
        return doors;
    }

    public House setDoors(int doors) {
        this.doors = doors;
        return this;
    }

    public int getRooms() {
        return rooms;
    }

    public House setRooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public House setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }

    public boolean isHasStatues() {
        return hasStatues;
    }

    public House setHasStatues(boolean hasStatues) {
        this.hasStatues = hasStatues;
        return this;
    }

    public boolean isHasSwimPool() {
        return hasSwimPool;
    }

    public House setHasSwimPool(boolean hasSwimPool) {
        this.hasSwimPool = hasSwimPool;
        return this;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public House setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }

    @Override
    public String toString() {
        return "House =>" +
                ((windows!=0)? " windows = " + windows:" ") +
                ((doors!=0)? " doors = " + doors:" ") +
                ((rooms!=0)? " rooms = " + rooms:" ") +
                ((hasGarage)? " hasGarage = " + hasGarage:" ") +
                ((hasStatues)? " hasStatues = " + hasStatues:" ") +
                ((hasSwimPool)? " hasSwimPool = " + hasSwimPool:" ") +
                ((hasGarden)? " hasGarden = " + hasGarden:" ");
    }
}

public class Main {
    public static void main(String[] args) {

        House house = new House()
                .setDoors(4)
                .setRooms(2)
                .setHasGarage(true);

        house = new House()
                .setWindows(1)
                .setDoors(2)
                .setHasStatues(true);

        System.out.println(house);

    }
}