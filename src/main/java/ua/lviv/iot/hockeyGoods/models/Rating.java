package ua.lviv.iot.hockeyGoods.models;

import java.util.ArrayList;
import java.util.List;

public class Rating {

    public static final int MIN_MARK = 0;
    public static final int MAX_MARK = 5;

    private double averageMark;
    private List<Integer> listOfMarks = new ArrayList<Integer>();

    public Rating(final List<Integer> marks) {
        this.listOfMarks = marks;
        this.averageMark = calculateAverageMark();
    }

    public Rating() {

    }

    public final void addMark(final Integer mark) {
        if (mark < MIN_MARK || mark > MAX_MARK) {
            return;
        } else {
            this.listOfMarks.add(mark);
            this.averageMark = calculateAverageMark();
        }
    }

    public final void addListOfMarks(final List<Integer> marks) {
        marks.forEach(mark -> this.addMark(mark));
    }

    public final double calculateAverageMark() {
        double buffer = 0.0;
        int length = this.listOfMarks.size();

        for (Integer mark : this.listOfMarks) {
            buffer += mark;
        }

        return buffer / length;
    }

    @Override
    public final String toString() {
        return "\nRating: " + this.averageMark;
    }

    public final double getAverageMark() {
        return averageMark;
    }

}
