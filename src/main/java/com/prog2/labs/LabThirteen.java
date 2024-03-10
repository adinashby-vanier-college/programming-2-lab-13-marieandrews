package com.prog2.labs;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author adinashby
 *
 */

public class LabThirteen {

	/**
	 * Write your test code below in the main (optional).
	 *
	 */
    
    public class CountryDriver {
    
    Country country = new Country("Canada", 305, 39003482);
    Country countrySecond = new Country("Mars", 867, 3);
    Country countryThird = new Country("Texas", 452, 29183290);
    Country countryFourth = new Country("Finalnd", 444, 5548495);
    Country countryFifth = new Country("Malta", 626, 536740);

}
	public static void main(String[] args) {
            
            ArrayList<Country> countries = new ArrayList<>();
        
        countries.add(new Country("Canada", 305, 39003482));
        countries.add(new Country("Mars", 867, 3));
        countries.add(new Country("Texas", 452, 29183290));
        countries.add(new Country("Finland", 444, 5548495));
        countries.add(new Country("Malta", 626, 536740));
        
        Collections.sort(countries);
        
        System.out.println("Here is the list of countries, sorted by population:\n" + countries.toString());
        
        NameComparator nameComparator = new NameComparator();
        Collections.sort(countries, nameComparator);
        System.out.println("Here is the list of countries, sorted by name:\n" + countries.toString());
        
        CodeComparator codeComparator = new CodeComparator();
        Collections.sort(countries, codeComparator);
        System.out.println("Here is the list of countries, sorted by code:\n" + countries.toString());
        
        PopulationComparator populationComparator = new PopulationComparator();
        Collections.sort(countries, populationComparator);
        System.out.println("Here is the list of countries, sorted by population (using a comparator this time):\n" + countries.toString());
        
        System.out.println("Here are hashcodes for the countries:");
        for(Country country : countries)
            System.out.println(country.hashCode());
	}

	
}