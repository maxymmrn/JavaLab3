package ua.lviv.iot.hockeyGoods.models;

public class IceSkates extends HockeyGood {

    private int footSize;
    private String model;

    public IceSkates() {

    }

    public IceSkates(final double price, final String producerName,
            final Age userAge, final ProfessionalLevel professionalLevel,
            final PlayerType playerType, final Rating rating, final int footSize) {

        super(price, producerName, userAge,
                professionalLevel, playerType, rating);
        this.footSize = footSize;
    }

    @Override
    public final String toString() {
        return "\nIce skates\n"
            + super.toString()
            + "\nFoot Size: " + footSize + "\n";
    }
    
    @Override
    public String getHeaders() {
		return super.getHeaders() + ",footSize";
	}

    public String toCSV() {
		return super.toCSV() + "," + this.getFootSize();
	}

    public final int getFootSize() {
        return footSize;
    }

    public final void setFootSize(final int footSize) {
        this.footSize = footSize;
    }

    public final String getModel() {
        return model;
    }

    public final void setModel(final String model) {
        this.model = model;
    }

}
