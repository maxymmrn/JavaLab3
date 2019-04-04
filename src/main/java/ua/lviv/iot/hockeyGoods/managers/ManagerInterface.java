package ua.lviv.iot.hockeyGoods.managers;

import java.util.List;

import ua.lviv.iot.hockeyGoods.models.HockeyGood;
import ua.lviv.iot.hockeyGoods.models.PlayerType;
import ua.lviv.iot.hockeyGoods.models.SortingWay;

public interface ManagerInterface {

    List<HockeyGood> sortByPrice(List<HockeyGood> listToSort,
            SortingWay sortingWay);

    List<HockeyGood> findGoodsByPlayerType(PlayerType playerType);
}
