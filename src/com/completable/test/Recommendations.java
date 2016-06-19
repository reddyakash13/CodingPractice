package com.completable.test;

import java.util.List;

import com.google.common.collect.Lists;

public class Recommendations {

	private List<String> options;
	
	private Recommendations() {
		
	}
	
	public static Recommendations getInstance() {
		return new Recommendations();
	}
	
	public Recommendations buildRecommdations(User user, GeoLocation geo) {
		Recommendations instance = getInstance();
		instance.addRecommdation("New Commendation");
		return instance;
	}

	public List<String> getOptions() {
		if(this.options == null) {
			this.options = Lists.newArrayList();
		}
		return this.options;
	}

	public void addRecommdation(String recomm) {
		getOptions().add(recomm);
	}
	
	
}
