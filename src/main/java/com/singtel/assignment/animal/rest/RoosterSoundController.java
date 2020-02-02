package com.singtel.assignment.animal.rest;

import java.io.Serializable;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.singtel.assignment.animal.util.RoosterSoundHelper;

@RestController
@RequestMapping("/rooster")
public class RoosterSoundController {

	@Autowired
	private RoosterSoundHelper roosterSoundHelper;

	@GetMapping("/sound/{language}")
	public ResponseEntity<RoosterSound> getSoundsByLanguage(@PathVariable String language) {
		Map<String, String> map = roosterSoundHelper.getMap();
		if (!map.containsKey(language)) {
			return new ResponseEntity<RoosterSound>(HttpStatus.BAD_REQUEST);
		}
		String sound = map.get(language);
		RoosterSound roosterSound = new RoosterSound(language, sound);
		return new ResponseEntity<RoosterSound>(roosterSound, HttpStatus.OK);
	}
}

class RoosterSound implements Serializable {

	String language;
	String sound;

	public RoosterSound(String language, String sound) {
		super();
		this.language = language;
		this.sound = sound;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

}
