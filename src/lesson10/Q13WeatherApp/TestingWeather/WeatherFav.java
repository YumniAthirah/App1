package lesson10.Q13WeatherApp.TestingWeather;

import java.util.HashSet;
import java.util.Set;

public class WeatherFav {
    private Set<String> favorites;

    public WeatherFav(){
        favorites =  new HashSet<>();
    }

    public void addFav(String city){
        favorites.add(city);
    }

    public void removeFav(String city){
        favorites.remove(city);
    }

    public Set<String> getFav(){
        return favorites;
    }

}
