package ua.lviv.iot.hockeyGoods.models;

import javax.persistence.Entity;

@Entity
public class Stick extends HockeyGood {
	
    private double weight;

    public Stick() {

    }

    public Stick(final double price, final String producerName,
            final Age userAge, final ProfessionalLevel professionalLevel,
            final PlayerType playerType, final Rating rating, final double weight) {

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
 
    @Override
    public String getHeaders() {
		return super.getHeaders() + ",weight";
	}

    public String toCSV() {
		return super.toCSV() + "," + this.getWeight();
	}

    public final double getWeight() {
        return weight;
    }

    public final void setWeight(final double weight) {
        this.weight = weight;
    }

}
