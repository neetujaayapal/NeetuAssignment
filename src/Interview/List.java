package Interview;

import java.util.ArrayList;
import java.util.Arrays;

public class List {

	public static void main(String[] args) {
		// first way of initializing an array
		ArrayList<String> listOfCountries = new ArrayList<String>();

		listOfCountries.add("India");
		listOfCountries.add("Canada");
		listOfCountries.add("Dubai");
		listOfCountries.add("Italy");
		listOfCountries.add("UK");

		System.out.println(Arrays.asList(listOfCountries));

		boolean isCountryPresent = listOfCountries.contains("Dubai");

		System.out.println(isCountryPresent);

		System.out.println(listOfCountries.get(1));

		System.out.println(listOfCountries.indexOf("li"));

		System.out.println(listOfCountries.remove("Dubai"));

		System.out.println(listOfCountries.size());

		System.out.println(Arrays.asList(listOfCountries));

		// second way of initializing an array
		
		String[] s = {"Delhi", "Pune", "Kochi", "Mumbai", "Bangalore"};
		
		ArrayList<String> listOfCity = new ArrayList<String>(Arrays.asList(s));

		System.out.println(listOfCity);
		// converting arrays to list
		
		String[] city = { "D", "P", "K", "M", "B" };
		// printing array
		System.out.println(Arrays.toString(city));
		// converting arrays to list
		System.out.println(Arrays.asList(city));

		// adding arrays to array list

		System.out.println(listOfCity.addAll(Arrays.asList(city)));

		System.out.println(listOfCity);
		
		// declaring list
		
	

	}

}
