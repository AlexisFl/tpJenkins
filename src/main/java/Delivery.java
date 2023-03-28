public class Delivery {

    private double distance;
    private double weight;

    public Delivery(double distance, double weight) {
        this.distance = distance;
        this.weight = weight;
    }

    public double getDistance() {
        return distance;
    }

    public double getWeight() {
        return weight;
    }

    public double getCost() {
        double cost = 10;
        if (distance > 50) {
            cost += (distance - 50) * 0.5;
        }
        if (weight > 25) {
            cost += 5;
        } else if (weight > 10) {
            cost += 2;
        }
        return cost;
    }


}
