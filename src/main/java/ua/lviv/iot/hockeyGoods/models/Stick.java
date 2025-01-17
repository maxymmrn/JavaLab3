package ua.lviv.iot.hockeyGoods.models;

public class Stick extends HockeyGood {

    private String material;
    private double weight;

    public Stick() {

    }

    public Stick(final double price, final String producerName,
            final Age userAge, final ProfessionalLevel professionalLevel,
            final Rating rating, final PlayerType playerType,
            final double weight) {

        super(price, producerName, userAge,
                professionalLevel, playerType, rating);
        this.weight = weight;
    }

    @Override
    public final String toString() {
        return "\nStick\n"
        + super.toString()
        + "\nWeight: " + weight + "kg\n";
    }

    public final String getMaterial() {
        return material;
    }

    public final void setMaterial(final String material) {
        this.material = material;
    }

    public final double getWeight() {
        return weight;
    }

    public final void setWeight(final double weight) {
        this.weight = weight;
    }

}
