package edu.saintjoe.cs.ricardog.TestTwoRHG;

public class Human {
	
	//this will represent each other the humans names
	public String name;
	
	//stores each humans weight in pounds
	public int weight;
	
	//stores each humans height measured in feet
	public int height;
	

	public static void main(String[] args) {
		
		Human human1; 
		Human human2; 
		
		human1 = new Human();
		human2 = new Human();
		
		human1.setName("Ricardo");
		human2.setName("Frankie");
		
		human1.setWeight(200);
		human2.setWeight(170);
		
		human1.setHeight(6);
		human2.setHeight(6);
		
		System.out.println("human1 name = " + human1.getName() + " human1 weight = " + human1.getWeight() + " human1 height = " + human1.getHeight());
		System.out.println("human2 name = " + human2.getName() + " human2 weight = " + human2.getWeight() + " human2 height = " + human2.getHeight());
			
	}	
		
		
	public int getHeight () {
		return height;
	}
	
	public int getWeight () {
		return weight;
	}
	
	public String getName () {
		return name;
	}
	public void setName(String newName) {
    	name = newName;
	}
	public void setWeight(int newWeight) {
    	weight = newWeight;
    }
	public void setHeight(int newHeight) {
		height = newHeight;
	}
	
	
	

}
