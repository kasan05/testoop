package com.singtel.assignment.animal.util;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class RoosterSoundHelper {

	private static Map<String, String> rooseterSoundMap;

	@PostConstruct
	public static void init() {
		rooseterSoundMap = new HashMap<String, String>();
		rooseterSoundMap.put("Danish", "kykyliky");
		rooseterSoundMap.put("Dutch", "kukeleku");
		rooseterSoundMap.put("Finnish", "kukko kiekuu");
		rooseterSoundMap.put("French", "cocorico");
		rooseterSoundMap.put("German", "kikeriki");
		rooseterSoundMap.put("Greek", "kikiriki");
		rooseterSoundMap.put("Hebrew", "coo-koo-ri-koo");
		rooseterSoundMap.put("Hungarian", "kukuriku");
		rooseterSoundMap.put("Italian", "chicchirichi");
		rooseterSoundMap.put("Japanese", "ko-ke-kok-ko-o");
		rooseterSoundMap.put("Portuguese", "cucurucu");
		rooseterSoundMap.put("Russian", "kukareku");
		rooseterSoundMap.put("Swedish", "kuckeliku");
		rooseterSoundMap.put("Turkish", "kuk-kurri-kuuu");
		rooseterSoundMap.put("Urdu", "kuklooku");
	}

	public static Map<String, String> getMap() {
		return rooseterSoundMap;
	}
}
