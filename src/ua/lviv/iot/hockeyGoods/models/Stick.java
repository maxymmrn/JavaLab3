package ua.lviv.iot.hockeyGoods.models;

public class Stick extends HockeyGood {

	private String material;
	private double weight;

	public Stick() {

	}

	public Stick(double price, String producerName, Age userAge, ProfessionalLevel professionalLevel, Rating rating,
			String material, PlayerType playerType, double weight) {
		super(price, producerName, userAge, professionalLevel, playerType, rating);

		this.material = material;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "\nStick\n" + super.toString() + "\nMaterial: " + material + "\nWeight: " + weight + "kg\n";
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
