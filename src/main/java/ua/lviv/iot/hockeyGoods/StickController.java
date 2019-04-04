package ua.lviv.iot.hockeyGoods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.hockeyGoods.models.Stick;

@RestController
public class StickController {
	
	@Autowired
	private StickRepository stickRepository;

	@RequestMapping(value = "/stick", method = RequestMethod.GET)
	public List<Stick> getSticks() {
		return (List<Stick>) stickRepository.findAll();
	}
	
	@RequestMapping(value = "/stick/{id}", method = RequestMethod.GET)
	public Stick getStick(@PathVariable Integer id) {
		return stickRepository.findById(id).get();
	}

	@RequestMapping(value = "/stick", method = RequestMethod.POST)
	public void postStick(@RequestBody Stick stick) {
		stickRepository.save(stick);
	}
	
	@RequestMapping(value = "/stick/{id}", method = RequestMethod.PUT)
	public void updateStick(@RequestBody Stick stick, @PathVariable Integer id) {
		stickRepository.deleteById(id);
		stickRepository.save(stick);
	}
	
	@RequestMapping(value = "/stick/{id}", method = RequestMethod.DELETE)
	public void deleteStick(@PathVariable Integer id) {
		stickRepository.deleteById(id);;
	}
}
