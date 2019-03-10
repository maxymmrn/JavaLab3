package ua.lviv.iot.hockeyGoods.managers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.hockeyGoods.models.HockeyGood;
import ua.lviv.iot.hockeyGoods.models.PlayerType;
import ua.lviv.iot.hockeyGoods.models.SortingWay;

public class Manager implements ManagerInterface {

    private List<HockeyGood> hockeyGoodsList =  new ArrayList<HockeyGood>();

    public Manager() {
		
	}

    public Manager(final List<HockeyGood> hockeyGoodsList) {
        this.hockeyGoodsList = hockeyGoodsList;
    }

    @Override
    public final String toString() {
        StringBuffer info = new StringBuffer("");
        for (HockeyGood hockeyGood : hockeyGoodsList) {
            info.append(hockeyGood.toString());
        }
        return info + "\n";
    }

    public final void addGood(final HockeyGood good) {
        this.hockeyGoodsList.add(good);
    }

    public final void addListOfGood(final List<HockeyGood> lst) {
        lst.forEach(good -> this.addGood(good));
    }


    @Override
    public final List<HockeyGood> sortByPrice(final List<HockeyGood> listToSort,
            final SortingWay sortingWay) {
        Comparator<HockeyGood> priceComparator = (o1, o2) ->
            ((Double) o1.getPrice()).compareTo(o2.getPrice());

        if (sortingWay == SortingWay.ASCENDING) {
            listToSort.sort(priceComparator);
        } else {
            listToSort.sort(priceComparator.reversed());
        }

        return listToSort;
    }


    @Override
    public final List<HockeyGood> sortByRating(
            final List<HockeyGood> listToSort, final SortingWay sortingWay) {

        Comparator<HockeyGood> ratingComparator = (o1, o2) ->
            ((Double) o1.getRating().getAverageMark())
                .compareTo(o2.getRating().getAverageMark());

        if (sortingWay == SortingWay.ASCENDING) {
            listToSort.sort(ratingComparator);
        } else {
            listToSort.sort(ratingComparator.reversed());
        }

        return listToSort;
    }


    @Override
    public final List<HockeyGood> findGoodsByPlayerType(
                final PlayerType playerType) {
        List<HockeyGood> filteredList = new LinkedList<HockeyGood>();
        this.hockeyGoodsList.forEach((hockeyGood) -> {
            if (hockeyGood.getPlayerType() == playerType) {
                filteredList.add(hockeyGood);
            }
        });
        return filteredList;
    }

    public final List<HockeyGood> getHockeyGoodsList() {
        return hockeyGoodsList;
    }

    public final void setHockeyGoodsList(
                final List<HockeyGood> hockeyGoodsList) {
        this.hockeyGoodsList = hockeyGoodsList;
    }

}
