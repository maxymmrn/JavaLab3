package ua.lviv.iot.hockeyGoods.models;

import java.util.LinkedList;
import java.util.List;

public class Rating {

	private double averageMark;
	private List<Integer> listOfMarks;

	public Rating(List<Integer> marks) {
		this.listOfMarks = marks;
		this.averageMark = calculateAverageMark();
	}

	public Rating() {
		this.listOfMarks = new LinkedList<Integer>();
	}

	public void addMark(Integer mark) {
		if (mark > 5 || mark < 0) {
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
