package com.completable.test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class CompletableTest {
	
	public void main(String[] args) {
		Executor executorService = Executors.newFixedThreadPool(10);
		User user = new User();
		CompletableFuture<User> userFuture = CompletableFuture.supplyAsync(() -> loadUser(""), executorService);
		
		CompletableFuture<GeoLocation> geoFuture = 
		        CompletableFuture.supplyAsync(this::trackDevice);
		
		BiFunction<User, GeoLocation, Recommendations> temp = (User user1, GeoLocation geo) -> buildRecommendations(user1, geo);
		
		CompletableFuture<Recommendations> recommendFuture = userFuture.thenCombine(geoFuture, temp);
		
	}

	public Recommendations buildRecommendations(User user, GeoLocation geo) {
		Recommendations instance = Recommendations.getInstance();
		instance.addRecommdation("New Commendation");
		return instance;
	}
	
	public User loadUser(String uuid) {
		return new User();
	}
	
	public GeoLocation trackDevice() {
		return new GeoLocation("EGIL");
	}
}
