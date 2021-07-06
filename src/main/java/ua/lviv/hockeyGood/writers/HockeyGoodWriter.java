package ua.lviv.hockeyGood.writers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import ua.lviv.iot.hockeyGoods.models.HockeyGood;

public class HockeyGoodWriter {
	
	public void writeToFile(List<HockeyGood> hockeyGoodsList) 
                throws IOException {

		File fileForHockeyGoods = new File("HockeyGoods.csv");
	    try(FileOutputStream fos = new FileOutputStream(fileForHockeyGoods);
	            OutputStreamWriter osw = new OutputStreamWriter(fos);
	            BufferedWriter writer = new BufferedWriter(osw)) {
	    	
	    	for (HockeyGood good : hockeyGoodsList)  {
	    			writer.write(good.getHeaders() + "\n");
	    			writer.write(good.toCSV() + "\n");
	    	};
		}
	}

}
