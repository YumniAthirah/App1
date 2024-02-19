package lesson10.Q13WeatherApp.WeatherApp;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class WeatherAppGUI extends JFrame {
    private JLabel weatherTitle;
    private JLabel chooseLocation;
    private JComboBox<String> locationList;
    private JLabel weatherLocation;
    private JLabel temperatureLabel;
    private JLabel humidityLabel;
    private JLabel favLocation;

    public WeatherAppGUI() {
        setTitle("Weather");
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        // panel.setLayout(new GridLayout(4, 1));

        // title
        weatherTitle = new JLabel("Today's Weather");
        weatherTitle.setFont(new Font("Arial", Font.BOLD, 30));

        // location Panel
        JPanel locationPanel = new JPanel();
        chooseLocation = new JLabel("Choose Location : ");
        String[] favoritedLocation = { "No Favorited Location" };           //make favoritedLocation as String array
        JButton loadFavButton = new JButton(favoritedLocation[0]);          //loadFavButton

        String[] locations = { "Kuala Terengganu", "Kuala Lumpur", "Kota Bharu" }; // Combo box for locations
        locationList = new JComboBox<>(locations);
        locationList.addActionListener(e -> LoadWeatherData.fetchData((String) locationList.getSelectedItem(),
                weatherLocation, temperatureLabel, humidityLabel));
        locationList.setPreferredSize(new Dimension(150, locationList.getPreferredSize().height));

        JButton addFavButton = new JButton("Add Favorite");
        addFavButton.addActionListener(e -> {
            favoritedLocation[0] = (String) locationList.getSelectedItem();     // update favoritedLocation
            loadFavButton.setText(favoritedLocation[0]);                        // update loadFavButton text
            LoadWeatherData.fetchData((String) locationList.getSelectedItem(), weatherLocation, temperatureLabel,
                    humidityLabel);
        });

        locationPanel.add(chooseLocation);
        locationPanel.add(locationList);
        locationPanel.add(addFavButton);

        // favorite panel
        JPanel favoritePanel = new JPanel();
        favLocation = new JLabel("Favorite:");
        loadFavButton.setPreferredSize(new Dimension(320, locationList.getPreferredSize().height));
        loadFavButton.addActionListener(e -> {
            LoadWeatherData.fetchData((String) favoritedLocation[0], weatherLocation, temperatureLabel,
                    humidityLabel);
        });

        favoritePanel.add(favLocation);
        favoritePanel.add(loadFavButton);

        // data panel
        JPanel dataPanel = new JPanel();
        //dataPanel.setLayout(new GridLayout(3, 1));

        weatherLocation = new JLabel("[Location]");
        weatherLocation.setFont(new Font("Arial", Font.BOLD, 20));
        temperatureLabel = new JLabel("Temperature: N/A");
        humidityLabel = new JLabel("Humidity: N/A");

        dataPanel.add(weatherLocation);
        dataPanel.add(temperatureLabel);
        dataPanel.add(humidityLabel);

        // main panel
        panel.add(weatherTitle);
        panel.add(locationPanel);
        panel.add(favoritePanel);
        panel.add(dataPanel);

        add(panel);
    }
}