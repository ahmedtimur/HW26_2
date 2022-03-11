import classes.City;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<City> cityList = new ArrayList<>(List.of(
                new City(1,"New York" ),
                new City(2, "London"),
                new City(3, "Moscow"),
                new City(4, "Orlando"),
                new City(5, "Madrid"),
                new City(6, "Paris"),
                new City(7, "Bishkek"),
                new City(8, "Ulan Bator"),
                new City(9, "Tashkent"),
                new City(10, "Roma")
        ));

        TreeSet<City> cityTreeSet = new TreeSet<>();
        System.out.println(citiesWithOddCode(cityTreeSet, cityList));

    }
    public static Set<City> citiesWithOddCode(Set<City> cityTreeSet, List<City> cityList) {
        for(City i: cityList) {
            if(i.getCode() % 2 == 1) {
                cityTreeSet.add(i);
            }
        }
        return cityTreeSet;
    }
}
