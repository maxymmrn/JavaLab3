package ua.lviv.iot.hockeyGoods.managers;

import java.util.List;
import ua.lviv.iot.hockeyGoods.models.HockeyGood;
import ua.lviv.iot.hockeyGoods.models.PlayerType;
import ua.lviv.iot.hockeyGoods.models.SortingWay;

public interface ManagerInterface {

	public abstract List<HockeyGood> sortByPrice(List<HockeyGood> listToSort, SortingWay sortingWay);

	public abstract List<HockeyGood> sortByRating(List<HockeyGood> listToSort, SortingWay sortingWay);

	public abstract List<HockeyGood> filterByPlayerType(List<HockeyGood> listToFilter, PlayerType playerType);
}
