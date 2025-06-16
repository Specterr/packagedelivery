public class Delivery {
    private final String trackId;
    private final String address;
    private final String cargo;
    private final double weight;

    public Delivery(String trackId, String address, String cargo, double weight) {
        this.trackId = trackId;
        this.address = address;
        this.cargo = cargo;
        this.weight = weight;
    }

    public String getTrackId() {
        return trackId;
    }

    public String getAddress() {
        return address;
    }

    public String getCargo() {
        return cargo;
    }

    public double getWeight() {
        return weight;
    }
}