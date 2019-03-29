package ua.lviv.iot.hockeyGoods.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HockeyGood {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
    private double price;
    private String producerName;

    private Age userAge;
    private ProfessionalLevel professionalLevel;
    private PlayerType playerType;


    public HockeyGood() {

    }

    public HockeyGood(final double price, final String producerName,
            final Age userAge, final ProfessionalLevel professionalLevel,
            final PlayerType playerType) {

        this.price = price;
        this.producerName = producerName;
        this.userAge = userAge;
        this.professionalLevel = professionalLevel;
        this.playerType = playerType;
    }

    @Override
    public String toString() {
        return "Price: " + price
            + "\nProducer name: " + producerName
            + "\nPlayer type: " + playerType
            + "\nUser age: " + userAge
            + "\nProfessional level: " + professionalLevel;
    }
    
    public String getHeaders() {
		return "price,producerName,playerType,userAge,professionalLevel,rating";
	}
    
    public String toCSV() {
		return this.getPrice() + "," +
            this.getProducerName() + "," +
            this.getPlayerType() + "," +
            this.getUserAge() + "," +
            this.getProfessionalLevel();
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

}
