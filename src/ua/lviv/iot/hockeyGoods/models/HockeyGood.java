package ua.lviv.iot.hockeyGoods.models;

public abstract class HockeyGood {

	private double price;
	private String producerName;

	private Age userAge;
	private ProfessionalLevel professionalLevel;
	private PlayerType playerType;

	private Rating rating;

	public HockeyGood() {

	}

	public HockeyGood(double price, String producerName, Age userAge, ProfessionalLevel professionalLevel,
			PlayerType playerType, Rating rating) {
		this.price = price;
		this.producerName = producerName;
		this.userAge = userAge;
		this.professionalLevel = professionalLevel;
		this.playerType = playerType;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Price: " + price + "\nProducer name: " + producerName + "\nPlayer type: " + playerType +
				"\nUser age: " + userAge + "\nProfessional level: " +  professionalLevel + rating.toString();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProducerName() {
		return producerName;
	}

	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}

	public Age getUserAge() {
		return userAge;
	}

	public void setUserAge(Age userAge) {
		this.userAge = userAge;
	}

	public ProfessionalLevel getProfessionalLevel() {
		return professionalLevel;
	}

	public void setProfessionalLevel(ProfessionalLevel professionalLevel) {
		this.professionalLevel = professionalLevel;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}
	
	public PlayerType getPlayerType() {
		return playerType;
	}

	public void setPlayerType(PlayerType playerType) {
		this.playerType = playerType;
	}

}
