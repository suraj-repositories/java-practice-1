package Bro_codes_java_reloaded;

import java.util.ArrayList;

public class Sh_07_2D_ArrayList {
	public static void main(String[] args) {
		
		
		ArrayList<String> bakeryList = new ArrayList<String>();		// seperate arraylist - 1
		bakeryList.add("pasta");
		bakeryList.add("garlic-bread");
		bakeryList.add("donuts");
		
		ArrayList<String> productList = new ArrayList<String>();	// seperate arraylist - 2
		productList.add("tomatoes");
		productList.add("zucchini");
		productList.add("peper");
		
		ArrayList<String> drinkList = new ArrayList<String>();		// seperate arraylist - 3
		drinkList.add("soda");
		drinkList.add("coffee");
		
		
		// ArrayList of ArrayLists
		ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
				
		groceryList.add(bakeryList);
		groceryList.add(productList);
		groceryList.add(drinkList);
		
		// access all list
		System.out.println(groceryList);
		// access specific element - it is first element
		System.out.println(groceryList.get(0).get(0));
		// it is last element 
		System.out.println(groceryList.get(2).get(1));
		
	}
}
