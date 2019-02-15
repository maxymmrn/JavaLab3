package ua.lviv.iot.hockeyGoods.models;

public class IceSkates extends HockeyGood {

	private int footSize;
	private String model;

	public IceSkates() {
		this(0, null, null, null, null, null, 0, null);
	}

	public IceSkates(double price, String producerName, Age userAge, ProfessionalLevel professionalLevel, PlayerType playerType,
			Rating rating, int footSize, String model) {
		super(price, producerName, userAge, professionalLevel, playerType, rating);
		this.footSize = footSize;
		this.model = model;
	}

	@Override
	public String toString() {
		return "\nIce skates\n" + super.toString() + "\nFoot Size: " + footSize + "\nModel: " + model + "\n";
	}

	public int getFootSize() {
		return footSize;
	}

	public void setFootSize(int footSize) {
		this.footSize = footSize;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
