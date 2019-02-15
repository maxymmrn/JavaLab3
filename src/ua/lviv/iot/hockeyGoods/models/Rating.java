package ua.lviv.iot.hockeyGoods.models;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Rating {

	public static final int MIN_MARK = 0;
	public static final int MAX_MARK = 5;

	private double averageMark;
	private List<Integer> listOfMarks = new ArrayList<Integer>();

	public Rating(List<Integer> marks) {
		this.listOfMarks = marks;
		this.averageMark = calculateAverageMark();
	}

	public Rating() {

	}

	public void addMark(Integer mark) {
		if (mark < MIN_MARK || mark > MAX_MARK) {
			return;
		} else {
			this.listOfMarks.add(mark);
			this.averageMark = calculateAverageMark();
		}
	}

	private double calculateAverageMark() {
		double buffer = 0.0;
		int length = this.listOfMarks.size();

		for (Integer mark : this.listOfMarks) {
			buffer += mark;
		}

		return (buffer / length);
	}

	@Override
	public String toString() {
		return "\nRating: " + averageMark;
	}

	public double getAverageMark() {
		return averageMark;
	}

}
