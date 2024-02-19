package lesson10.Q13WeatherApp.WeatherApp;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class WeatherAppGUI extends JFrame {
    private JLabel weatherTitle;
    private JLabel chooseLocation;
    private JLabel weatherLocation;
    private JComboBox<String> locationList;
    private JLabel temperatureLabel;
    private JLabel humidityLabel;
    private JLabel favLocation;


    public WeatherAppGUI() {
        setTitle("Weather");
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        //panel.setLayout(new GridLayout(4, 1));

        // title
        weatherTitle = new JLabel("Today's Weather");
        weatherTitle.setFont(new Font("Arial", Font.BOLD, 20)); 

        // location Panel
        JPanel locationPanel = new JPanel();
        chooseLocation = new JLabel("Choose Location : ");
        String favoritedLocation = "No Favorited Location";

        String[] locations = { "Kuala Terengganu", "Kuala Lumpur", "Kota Bharu" };      // Combo box for locations
        locationList = new JComboBox<>(locations);
        locationList.addActionListener(e -> LoadWeatherData.fetchData((String) locationList.getSelectedItem(), weatherLocation, temperatureLabel, humidityLabel));
        locationList.setPreferredSize(new Dimension(150, locationList.getPreferredSize().height));
        
        JButton addFavButton = new JButton("Add Favorite");
        addFavButton.addActionListener(e -> { 
            favoritedLocation = "n/a";
            LoadWeatherData.fetchData((String) locationList.getSelectedItem(), weatherLocation, temperatureLabel, humidityLabel);
        });

        locationPanel.add(chooseLocation);
        locationPanel.add(locationList);
        locationPanel.add(addFavButton);

        // favorite panel
        JPanel favoritePanel = new JPanel();
        favLocation = new JLabel("Favorite:");
        JButton loadFavButton = new JButton(favoritedLocation);
        loadFavButton.setPreferredSize(new Dimension(320, locationList.getPreferredSize().height));


        favoritePanel.add(favLocation);
        favoritePanel.add(loadFavButton);

        // temp & humidity panel
        JPanel dataPanel = new JPanel();
        temperatureLabel = new JLabel("Temperature: N/A");
        humidityLabel = new JLabel("Humidity: N/A");

        dataPanel.add(temperatureLabel);
        dataPanel.add(humidityLabel);


        // main panel
        panel.add(weatherTitle);
        panel.add(locationPanel);
        panel.add(favoritePanel);
        panel.add(dataPanel);

        add(panel);
    }


    private Object addToFavorite() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addToFavorite'");
    }
}