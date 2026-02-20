//ship class
public class Ship {

    protected String shipId;
    protected String shipName;
    protected String country;
    protected int capacity;

    public Ship() {
    }

    public Ship(String shipId, String shipName, String country, int capacity) {
        this.shipId = shipId;
        this.shipName = shipName;
        this.country = country;
        this.capacity = capacity;
    }

    public String getShipId() {
        return shipId;
    }

    public void setShipId(String shipId) {
        this.shipId = shipId;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}