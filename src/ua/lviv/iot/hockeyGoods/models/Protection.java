package ua.lviv.iot.hockeyGoods.models;

public class Protection extends HockeyGood {

	private ProtectionType protectionType;
	private String material;

	public Protection() {

	}

	public Protection(double price, String producerName, Age userAge, ProfessionalLevel professionalLevel,
			Rating rating, ProtectionType protectionType, PlayerType playerType, String material) {
		super(price, producerName, userAge, professionalLevel, playerType, rating);
		this.protectionType = protectionType;
		this.material = material;
	}

	@Override
	public String toString() {
		return "\nProtection\n" + super.toString() + "\nProtection type: " + protectionType + "\nMaterial: " + material
				+ "\n";
	}

	public ProtectionType getProtectionType() {
		return protectionType;
	}

	public void setProtectionType(ProtectionType protectionType) {
		this.protectionType = protectionType;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
