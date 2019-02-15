package ua.lviv.iot.hockeyGoods.main;

import java.util.ArrayList;
import java.util.List;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import ua.lviv.iot.hockeyGoods.managers.Manager;
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

public class Main {

	public static void main(String[] args) {
		
		Manager manager = new Manager();
		List<HockeyGood> iceSkatesList = new ArrayList<HockeyGood>();
		List<HockeyGood> protectionsList = new ArrayList<HockeyGood>();
		
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
		
		IceSkates oldSkates = new IceSkates(250, "No Data", Age.KID, ProfessionalLevel.AMATEUR, 
				PlayerType.FIELDPLAYER, badRate, 37, "Vapor X300");
		iceSkatesList.add(oldSkates);
		
		IceSkates retroSkates = new IceSkates(450, "Retro Hockey", Age.JUNIOR, ProfessionalLevel.HALFPROFESSIONAL, 
				PlayerType.FIELDPLAYER, goodRate, 40, "Disco 90's");
		iceSkatesList.add(retroSkates);
		
		IceSkates proSkates = new IceSkates(700, "Just Professional", Age.SENIOR, ProfessionalLevel.PROFESSIONAL, 
				PlayerType.FIELDPLAYER, superRate, 39, "Shark");
		iceSkatesList.add(proSkates);
		
		
		Protection oldGloves = new Protection(400, "No Data", Age.JUNIOR, ProfessionalLevel.AMATEUR, niceRate, 
				ProtectionType.GLOVES, PlayerType.GOALKEEPER, "No Data");
		protectionsList.add(oldGloves);
		
		Protection shoulders = new Protection(300, "No Data", Age.JUNIOR, ProfessionalLevel.HALFPROFESSIONAL, goodRate, 
				ProtectionType.SHOULDERS, PlayerType.GOALKEEPER, "No Data");
		protectionsList.add(shoulders);
		
		Protection protectionForLegs = new Protection(575, "Just Professional", Age.SENIOR, ProfessionalLevel.PROFESSIONAL, superRate, 
				ProtectionType.GLOVES, PlayerType.GOALKEEPER, "Plastic");
		protectionsList.add(protectionForLegs);
		
		Protection helmet = new Protection(850, "Strong For Strong", Age.JUNIOR, ProfessionalLevel.HALFPROFESSIONAL, badRate, 
				ProtectionType.HELMET, PlayerType.FIELDPLAYER, "Plastic");
		protectionsList.add(helmet);

		Stick woodStick = new Stick(950, "Wood Legend", Age.SENIOR, ProfessionalLevel.HALFPROFESSIONAL, goodRate, "Wood", 
				PlayerType.GOALKEEPER, 1.3);
		
		manager.addListOfGoods(iceSkatesList);
		manager.addListOfGoods(protectionsList);
		manager.addGood(woodStick);
		
		System.out.println("Given List of Goods:\n");
		System.out.println(manager);

		List<HockeyGood> sortedByPriceList = manager.sortByPrice(manager.getHockeyGoodsList(), SortingWay.ASCENDING);
		System.out.println("Sorted by Price List of Goods:\n");
		sortedByPriceList.forEach((good)->System.out.println(good));
		
		System.out.println();
		
		List<HockeyGood> sortedByRatingList = manager.sortByRating(manager.getHockeyGoodsList(), SortingWay.ASCENDING);
		System.out.println("Sorted by Rating List of Goods:\n");
		sortedByRatingList.forEach((good)->System.out.println(good));
		
		System.out.println();
		
		List<HockeyGood> goalKeeperPlayerList = manager.filterByPlayerType(manager.getHockeyGoodsList(), PlayerType.GOALKEEPER);
		System.out.println("Filtered List of Goods:\n");
		goalKeeperPlayerList.forEach((good)->System.out.println(good));
	}

}
