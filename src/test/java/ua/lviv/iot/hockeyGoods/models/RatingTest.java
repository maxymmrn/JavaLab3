package ua.lviv.iot.hockeyGoods.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RatingTest {

	private Rating badRate = new Rating();
	private Rating niceRate = new Rating();
	private Rating goodRate = new Rating();
	private Rating superRate = new Rating();
	
	@BeforeEach
	public void setUp() {
        this.badRate.addMark(2);

        this.niceRate.addMark(4);
        this.niceRate.addMark(3);
        this.niceRate.addMark(5);

        this.goodRate.addMark(3);
        this.goodRate.addMark(5);

        List<Integer> marks = new ArrayList<Integer>();
        marks.add(4);
        marks.add(5);
        marks.add(5);
        this.superRate.addListOfMarks(marks);
        this.superRate.addMark(5);
	}
	
	@Test
	public void testCalculateAverageMark() {
		assertEquals(2, this.badRate.calculateAverageMark());
		assertEquals(4, this.niceRate.calculateAverageMark());
		assertEquals(4, this.goodRate.calculateAverageMark());
		assertEquals(4.75, this.superRate.calculateAverageMark());
	}
}
