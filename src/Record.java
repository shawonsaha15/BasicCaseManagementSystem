//ID: 2014305642
//Name: Sadia Akhter
//Course: CSE215
//Section: 10

import java.util.ArrayList;

public class Record {
	protected String brief;
	protected ArrayList<String> suspects;
	protected String date;
	protected String stats;
	
	// Getter method for brief
	public String getBrief() {
		return brief;
	}
	
	// Setter method for brief
	public void setBrief(String brief) {
		this.brief = brief;
	}
	
	// Getter method for suspects
	public ArrayList<String> getSuspects() {
		return suspects;
	}
	
	// Setter method for suspects
	public void setSuspects(ArrayList<String> suspects2) {
		this.suspects = suspects2;
	}
	
	// Getter method for date
	public String getDate() {
		return date;
	}
	
	// Setter method for date
	public void setDate(String date) {
		this.date = date;
	}
	
	// Getter method for stats
	public String getStats() {
		return stats;
	}
	
	// Setter method for stats
	public void setStats(String stats) {
		this.stats = stats;
	}
	
	@Override
	public String toString() {
		return "Brief description: " + brief + "\nSuspects: " + suspects + "\nDate: " + date + "\nStatus: " + stats; 
	}
}
