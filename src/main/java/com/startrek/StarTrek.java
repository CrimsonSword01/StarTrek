package com.startrek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StarTrek {

	public String beam() {
		return "Beam me up, Scotty!";
	}
	
	public List<String> getPeopleToBeam() {
		List<String> peeps = new ArrayList<String>();
		peeps.add("Kirk");
		peeps.add("Spock");
		peeps.add("Uhura");
		//return peeps;
		
		List<String> peeps2 = Arrays.asList("Kirk", "Spock", "Uhura");
		return peeps2;
	}
	
	public String[] redShirts() {
		return new String[]{"Todd", "Hunt"};
	}
	
	public Map<String, String> roles() {
		Map<String, String> roles = new HashMap<>();
		roles.put("captain", "Kirk");
		roles.put("communications", "Uhura");
		roles.put("doctor", "McCoy");
		return roles;
	}
}
