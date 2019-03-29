package ua.lviv.iot.hockeyGoods;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ua.lviv.iot.hockeyGoods.models.Age;
import ua.lviv.iot.hockeyGoods.models.PlayerType;
import ua.lviv.iot.hockeyGoods.models.ProfessionalLevel;
import ua.lviv.iot.hockeyGoods.models.Stick;

@SpringBootApplication
public class ApplicationDB {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationDB.class, args);
	}

	@Bean
	public CommandLineRunner demo(HockeyGoodRepository repository) {
        
       return (args) -> {
           repository.save(new Stick(950, "Wood Legend", Age.SENIOR,
                   ProfessionalLevel.HALFPROFESSIONAL, PlayerType.FIELDPLAYER, 1.3));
           repository.save(new Stick(650, "Wood Legend", Age.SENIOR,
                   ProfessionalLevel.AMATEUR, PlayerType.FIELDPLAYER, 1.5));
           
           repository.findAll().forEach(stick -> System.out.println(stick));
           
       };
    }
}
