package ua.lviv.iot.hockeyGoods.models;

public class Protection extends HockeyGood {

    private ProtectionType protectionType;
    private String material;

    public Protection() {

    }

    public Protection(final double price, final String producerName,
            final Age userAge, final ProfessionalLevel professionalLevel,
            final Rating rating, final ProtectionType protectionType,
            final PlayerType playerType) {

        super(price, producerName, userAge,
                professionalLevel, playerType, rating);
        this.protectionType = protectionType;
    }

    @Override
    public final String toString() {
        return "\nProtection\n"
            + super.toString()
            + "\nProtection type: " + protectionType + "\n";
    }

    public final ProtectionType getProtectionType() {
        return protectionType;
    }

    public final void setProtectionType(final ProtectionType protectionType) {
        this.protectionType = protectionType;
    }

    public final String getMaterial() {
        return material;
    }

    public final void setMaterial(final String material) {
        this.material = material;
    }

}
