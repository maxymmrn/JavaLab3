package ua.lviv.iot.hockeyGoods.managers;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.hockeyGoods.models.HockeyGood;
import ua.lviv.iot.hockeyGoods.models.PlayerType;
import ua.lviv.iot.hockeyGoods.models.SortingWay;

public class Manager implements ManagerInterface {

	private List<HockeyGood> hockeyGoodsList;

	public Manager() {
		this(new LinkedList<HockeyGood>());
	}

	public Manager(List<HockeyGood> hockeyGoodsList) {
		this.hockeyGoodsList = hockeyGoodsList;
	}

	@Override
	public String toString() {
		String info = "";
		for (HockeyGood hockeyGood : hockeyGoodsList) {
			info += hockeyGood.toString();
		}
		return info + "\n";
	}

	@Override
	public List<HockeyGood> sortByPrice(List<HockeyGood> listToSort, SortingWay sortingWay) {
		Comparator<HockeyGood> priceComparator = (o1, o2) -> ((Double) o1.getPrice()).compareTo(o2.getPrice());
		if (sortingWay == SortingWay.ASCENDING) {
			listToSort.sort(priceComparator);
		} else {
			listToSort.sort(priceComparator.reversed());
		}
		return listToSort;
	}

	@Override
	public List<HockeyGood> sortByRating(List<HockeyGood> listToSort, SortingWay sortingWay) {
		Comparator<HockeyGood> ratingComparator = (o1, o2) -> ((Double) o1.getRating().getAverageMark())
				.compareTo(o2.getRating().getAverageMark());

		if (sortingWay == SortingWay.ASCENDING) {
			listToSort.sort(ratingComparator);
		} else {
			listToSort.sort(ratingComparator.reversed());
		}
		return listToSort;
	}

	@Override
	public List<HockeyGood> filterByPlayerType(List<HockeyGood> listToFilter, PlayerType playerType) {
		List<HockeyGood> filteredList = new LinkedList<HockeyGood>();
		listToFilter.forEach((hockeyGood) -> {
			if (hockeyGood.getPlayerType() == playerType) {
				filteredList.add(hockeyGood);
			}
		});
		return filteredList;
	}

	@Override
	public void addGood(HockeyGood good) {
		this.hockeyGoodsList.add(good);
	}
	
	@Override
	public void addListOfGoods(List<HockeyGood> listOfGoods) {
		listOfGoods.forEach((good)->this.addGood(good));
	}

	public List<HockeyGood> getHockeyGoodsList() {
		return hockeyGoodsList;
	}

	public void setHockeyGoodsList(List<HockeyGood> hockeyGoodsList) {
		this.hockeyGoodsList = hockeyGoodsList;
	}

	

}
