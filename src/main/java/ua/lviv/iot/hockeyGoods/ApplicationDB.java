package ua.lviv.iot.hockeyGoods;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ua.lviv.iot.hockeyGoods.models.Age;
import ua.lviv.iot.hockeyGoods.models.PlayerType;
import ua.lviv.iot.hockeyGoods.models.ProfessionalLevel;
import ua.lviv.iot.hockeyGoods.models.Rating;
import ua.lviv.iot.hockeyGoods.models.Stick;

@SpringBootApplication
public class ApplicationDB {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationDB.class, args);
	}

	@Bean
	public CommandLineRunner demo(StickRepository repository) {
       Rating goodrate = new Rating();
       goodrate.addMark(4);
       goodrate.addMark(5);
       goodrate.addMark(4);
       
       Rating badrate = new Rating();
       badrate.addMark(4);
       badrate.addMark(2);
       badrate.addMark(3);
       
       Rating notbadrate = new Rating();
       notbadrate.addMark(5);
       notbadrate.addMark(2);
       notbadrate.addMark(3);

       return (args) -> {
           repository.save(new Stick(950, "Wood Legend", Age.SENIOR,
                   ProfessionalLevel.HALFPROFESSIONAL, PlayerType.FIELDPLAYER, goodrate, 1.7));
           repository.save(new Stick(650, "BOSS", Age.SENIOR,
                   ProfessionalLevel.AMATEUR, PlayerType.FIELDPLAYER, badrate, 1.5));
           repository.save(new Stick(4000, "Hockey Master", Age.JUNIOR,
                   ProfessionalLevel.PROFESSIONAL, PlayerType.GOALKEEPER, notbadrate, 1.3));
       };
    }
}
