package ua.lviv.iot.hockeyGoods.writers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.hockeyGood.writers.HockeyGoodWriter;
import ua.lviv.iot.hockeyGoods.models.Age;
import ua.lviv.iot.hockeyGoods.models.HockeyGood;
import ua.lviv.iot.hockeyGoods.models.IceSkates;
import ua.lviv.iot.hockeyGoods.models.PlayerType;
import ua.lviv.iot.hockeyGoods.models.ProfessionalLevel;
import ua.lviv.iot.hockeyGoods.models.Protection;
import ua.lviv.iot.hockeyGoods.models.ProtectionType;
import ua.lviv.iot.hockeyGoods.models.Rating;
import ua.lviv.iot.hockeyGoods.models.Stick;

public class HockeyGoodWriterTest {

	List<HockeyGood> list = new ArrayList<HockeyGood>();

	@BeforeEach
	public void setUp() {
		Rating badRate = new Rating();
        badRate.addMark(2);

        Rating niceRate = new Rating();
        niceRate.addMark(4);
        niceRate.addMark(3);
        niceRate.addMark(5);

        Rating goodRate = new Rating();
        goodRate.addMark(3);
        goodRate.addMark(5);

        Rating superRate = new Rating();
        superRate.addMark(4);
        superRate.addMark(5);
        superRate.addMark(5);
        superRate.addMark(5);


        IceSkates oldSkates = new IceSkates(250, "No Data",
                Age.KID, ProfessionalLevel.AMATEUR,
                PlayerType.FIELDPLAYER, 37);

        IceSkates retroSkates = new IceSkates(450, "Retro Hockey",
                Age.JUNIOR, ProfessionalLevel.HALFPROFESSIONAL,
                PlayerType.FIELDPLAYER, 40);

        IceSkates proSkates = new IceSkates(700, "Just Professional",
                Age.SENIOR, ProfessionalLevel.PROFESSIONAL,
                PlayerType.FIELDPLAYER, 39);


        Protection oldGloves = new Protection(400, "No Data",
                Age.JUNIOR, ProfessionalLevel.AMATEUR,
                ProtectionType.GLOVES, PlayerType.GOALKEEPER);

        Protection shoulders = new Protection(300, "No Data",
                Age.JUNIOR, ProfessionalLevel.HALFPROFESSIONAL,
                ProtectionType.SHOULDERS, PlayerType.GOALKEEPER);

        Protection protectionForLegs = new Protection(575, "Just Professional",
                Age.SENIOR, ProfessionalLevel.PROFESSIONAL,
                ProtectionType.GLOVES, PlayerType.GOALKEEPER);

        HockeyGood helmet = new Protection(850, "Strong For Strong",
                Age.JUNIOR, ProfessionalLevel.HALFPROFESSIONAL,
                ProtectionType.HELMET, PlayerType.FIELDPLAYER);


        Stick woodStick = new Stick(950, "Wood Legend", Age.SENIOR,
                ProfessionalLevel.HALFPROFESSIONAL,
                PlayerType.FIELDPLAYER, 1.3);

        this.list.add(oldSkates);
        this.list.add(proSkates);
        this.list.add(oldGloves);
        this.list.add(retroSkates);
        this.list.add(shoulders);
        this.list.add(protectionForLegs);
        this.list.add(helmet);
        this.list.add(woodStick);
	}

	@Test
	public void testWriteToFile() throws IOException {
		HockeyGoodWriter writer = new HockeyGoodWriter();
		writer.writeToFile(this.list);
	}
}
