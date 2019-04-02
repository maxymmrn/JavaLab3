package ua.lviv.iot.hockeyGoods.managers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.hockeyGoods.models.Age;
import ua.lviv.iot.hockeyGoods.models.HockeyGood;
import ua.lviv.iot.hockeyGoods.models.IceSkates;
import ua.lviv.iot.hockeyGoods.models.PlayerType;
import ua.lviv.iot.hockeyGoods.models.ProfessionalLevel;
import ua.lviv.iot.hockeyGoods.models.Protection;
import ua.lviv.iot.hockeyGoods.models.ProtectionType;
import ua.lviv.iot.hockeyGoods.models.Rating;
import ua.lviv.iot.hockeyGoods.models.SortingWay;
import ua.lviv.iot.hockeyGoods.models.Stick;

public class ManagerTest {
	
	private Manager testManager = new Manager();
	
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
        
        protectionForLegs.setUserAge(Age.JUNIOR);
        woodStick.setPrice(990);
        helmet.setProducerName("Just Nice");
        helmet.setProfessionalLevel(ProfessionalLevel.AMATEUR);
        
        List<HockeyGood> smallList = new ArrayList<HockeyGood>();

        smallList.add(oldSkates);
        smallList.add(proSkates);
        smallList.add(oldGloves);

        this.testManager.addGood(retroSkates);
        this.testManager.addGood(shoulders);
        this.testManager.addGood(protectionForLegs);
        this.testManager.addGood(helmet);
        this.testManager.addGood(woodStick);
        this.testManager.addListOfGood(smallList);

        Manager test = new Manager(smallList);
        smallList.add(protectionForLegs);
        test.setHockeyGoodsList(smallList);
	}
	

	@Test 
	public void testSortByPrice() {
		List<HockeyGood> sortedList = new ArrayList<HockeyGood>();
		
		sortedList = testManager.sortByPrice(testManager.getHockeyGoodsList(), SortingWay.ASCENDING);
		assertEquals(250, sortedList.get(0).getPrice());
		assertEquals(990, sortedList.get(7).getPrice());
		
		sortedList = testManager.sortByPrice(testManager.getHockeyGoodsList(), SortingWay.DESCENDING);
		assertEquals(250, sortedList.get(7).getPrice());
		assertEquals(990, sortedList.get(0).getPrice());
	}
	
	@Test 
	public void testFindGoodsByPlayerType() {
		List<HockeyGood> sortedList = new ArrayList<HockeyGood>();
		
		sortedList = testManager.findGoodsByPlayerType(PlayerType.FIELDPLAYER);
		assertEquals(5, sortedList.size());
		
		sortedList = testManager.findGoodsByPlayerType(PlayerType.GOALKEEPER);
		assertEquals(3, sortedList.size());
	}
}
