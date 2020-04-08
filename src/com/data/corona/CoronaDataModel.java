// since we created the class under com.data.corona package
package com.data.corona;

// class to create instances of it using id, state, city, maleCount, femaleCount

public class CoronaDataModel {
	private int id; 
	private String State;
	private String City;
	private int MaleCount;
	private int FemaleCount;

	public CoronaDataModel(int id, String State, String City, int MaleCount, int FemaleCount) {
		this.id = id;
		this.State = State;
		this.City = City;
		this.MaleCount = MaleCount;
		this.FemaleCount = FemaleCount;
	}

	public static void main(String[] args) {

	}
	
	// overriding parent class which is Object class toString()

	@Override
	public String toString() {
		return "CoronaDataModel [id=" + getId() + ", State=" + getState() + ", City=" + getCity() + ", MaleCount=" + getMaleCount()
				+ ", FemaleCount=" + getFemaleCount() + "]";
	}
	
	// getters and setters for the properties which are declared as private

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public int getMaleCount() {
		return MaleCount;
	}

	public void setMaleCount(int maleCount) {
		MaleCount = maleCount;
	}

	public int getFemaleCount() {
		return FemaleCount;
	}

	public void setFemaleCount(int femaleCount) {
		FemaleCount = femaleCount;
	}

}
