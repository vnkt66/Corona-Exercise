package com.data.corona;

import java.util.*;


public class CalculateData {
	public int tnMaleCount;
	public int apMaleCount;
	public int kMaleCount;
	public int tnFemaleCount;
	public int apFemaleCount;
	public int kFemaleCount;
	private int totalCount;

	// In all the methods in the constructor of this class we are sending the list collection as a parameter of the methods
	public CalculateData(List<CoronaDataModel> l) {
		this.tnMaleCount = this.getTnStateMaleCount(l);
		this.apMaleCount = this.getApStateMaleCount(l);
		this.kMaleCount = this.getKeralaStateMaleCount(l);
		this.tnFemaleCount = this.getTnStateFemaleCount(l);
		this.apFemaleCount = this.getApStateFemaleCount(l);
		this.kFemaleCount = this.getKeralaStateFemaleCount(l);
		this.totalCount();
	}

	public static void main(String[] args) {
	}
	// returns TamilNadu State Male Count
	public int getTnStateMaleCount(List<CoronaDataModel> l) {
		int tnMale = 0;
		for (int i = 0; i < l.size(); i++) { 
	    // checking the state in the list is equals to TN if it is equal then adding all the instances with state TN property 
        	   if(l.get(i).getState().toLowerCase().equals("tamilnadu")) {
        		   tnMale += l.get(i).getMaleCount();  
        	   }
        	}
		return tnMale;

	}
	// returns AP State Male Count
	public int getApStateMaleCount(List<CoronaDataModel> l) {
		int apMale = 0;
		for (int i = 0; i < l.size(); i++) { 
		// checking the state in the list is equals to AP if it is equal then adding all the instances with state AP property
        	   if(l.get(i).getState().toLowerCase().equals("ap")) {
        		   apMale += l.get(i).getMaleCount();  
        	   }
        	}
		return apMale;

	}
	// returns Kerala State Male Count
	public int getKeralaStateMaleCount(List<CoronaDataModel> l) {
		int kMale = 0;
		for (int i = 0; i < l.size(); i++) { 
		// checking the state in the list is equals to Kerala if it is equal then adding all the instances with state Kerala property
        	   if(l.get(i).getState().toLowerCase().equals("kerala")) {
        		   kMale += l.get(i).getMaleCount();  
        	   }
        	}
		return kMale;

	}
	// returns TamilNadu State Female Count
	public int getTnStateFemaleCount(List<CoronaDataModel> l) {
		int tnFemale = 0;
		for (int i = 0; i < l.size(); i++) { 
		// checking the state in the list is equals to TN if it is equal then adding all the instances with state TN property
        	   if(l.get(i).getState().toLowerCase().equals("tamilnadu")) {
        		   tnFemale += l.get(i).getFemaleCount();  
        	   }
        	}
		return tnFemale;
	}
	// returns AP State Female Count
	public int getApStateFemaleCount(List<CoronaDataModel> l) {
		int apFemale = 0;
		for (int i = 0; i < l.size(); i++) { 
		// checking the state in the list is equals to AP if it is equal then adding all the instances with state AP property
        	   if(l.get(i).getState().toLowerCase().equals("ap")) {
        		   apFemale += l.get(i).getFemaleCount();  
        	   }
        	}
		return apFemale;
	}
	// returns Kerala State Female Count
	public int getKeralaStateFemaleCount(List<CoronaDataModel> l) {
		int kFemale = 0;
		for (int i = 0; i < l.size(); i++) { 
		// checking the state in the list is equals to Kerala if it is equal then adding all the instances with state Kerala property
        	   if(l.get(i).getState().toLowerCase().equals("kerala")) {
        		   kFemale += l.get(i).getFemaleCount();  
        	   }
        	}
		return kFemale;

	}
	
	// This method adds all the states male count and female count and adds to the totalCount property by calling setTotalCount Setter
	public void totalCount() {
		this.setTotalCount(this.tnMaleCount + this.apMaleCount + this.kMaleCount + this.tnFemaleCount + this.apFemaleCount + this.kFemaleCount);
	}
	// Getters and Setters for totalCount private property
	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
}
	