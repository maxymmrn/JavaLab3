package ua.lviv.iot.hockeyGoods.models;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class HockeyGood {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
    private double price;
    private String producerName;
    
    @Enumerated(EnumType.STRING)
    private Age userAge;
    @Enumerated(EnumType.STRING)
    private ProfessionalLevel professionalLevel;
    @Enumerated(EnumType.STRING)
    private PlayerType playerType;
    
    @Embedded
    private Rating rating;


    public HockeyGood() {

    }

    public HockeyGood(final double price, final String producerName,
            final Age userAge, final ProfessionalLevel professionalLevel,
            final PlayerType playerType, final Rating rating) {

        this.price = price;
        this.producerName = producerName;
        this.userAge = userAge;
        this.professionalLevel = professionalLevel;
        this.playerType = playerType;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Price: " + price
            + "\nProducer name: " + producerName
            + "\nPlayer type: " + playerType
            + "\nUser age: " + userAge
            + "\nProfessional level: " + professionalLevel
            + "\nRating: " + rating.toString();
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(final double price) {
        this.price = price;
    }

    public final String getProducerName() {
        return producerName;
    }

    public final void setProducerName(final String producerName) {
        this.producerName = producerName;
    }

    public final Age getUserAge() {
        return userAge;
    }

    public final void setUserAge(final Age userAge) {
        this.userAge = userAge;
    }

    public final ProfessionalLevel getProfessionalLevel() {
        return professionalLevel;
    }

    public final void setProfessionalLevel(
            final ProfessionalLevel professionalLevel) {
        this.professionalLevel = professionalLevel;
    }


    public final PlayerType getPlayerType() {
        return playerType;
    }

    public final void setPlayerType(final PlayerType playerType) {
        this.playerType = playerType;
    }

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}
    
}
