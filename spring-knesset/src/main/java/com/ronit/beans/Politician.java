package com.ronit.beans;

public abstract class Politician {
	protected String name;
	private String favoriteActivity;
	private Newspaper dailyNewspaper;

	
	public Politician(String name, String favoriteActivity, Newspaper dailyNewspaper) {
		this.name = name;
		this.favoriteActivity = favoriteActivity;
		this.dailyNewspaper = dailyNewspaper;
		
		
	}
	
	public void goStraight() {
		System.out.println(name + "Straight");

	}

	public void goCorrupt() {
		System.out.println(name + "Corrupt");

	}

	@Override
	public String toString() {
		return "Politician [name=" + name + ", favoriteActivity=" + favoriteActivity + ", dailyNewspaper="
				+ dailyNewspaper + "]";
	}

}
