package lesson10.copyWeatherApp;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class WeatherAppGUIACTION extends JFrame {
    private JLabel weatherTitle;
    private JLabel chooseLocation;
    private JComboBox<String> locationList;
    private JLabel weatherLocation;
    private JLabel temperatureLabel;
    private JLabel humidityLabel;
    private JLabel favLocation;
    public String[] favoritedLocation;
    public JLabel loadFavButton;


    public WeatherAppGUIACTION() {
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
        
        String[] favoritedLocation = { "No Favorited Location" };
        JButton loadFavButton = new JButton(favoritedLocation[0]);

        String[] locations = { "Kuala Terengganu", "Kuala Lumpur", "Kota Bharu" };
        locationList = new JComboBox<>(locations);
        locationList.addActionListener(new LoadButtonListener());
        locationList.setPreferredSize(new Dimension(150, locationList.getPreferredSize().height));

        JButton addFavButton = new JButton("Add Favorite");
        addFavButton.addActionListener(new AddFavButtonListener(favoritedLocation,loadFavButton));

        locationPanel.add(chooseLocation);
        locationPanel.add(locationList);
        locationPanel.add(addFavButton);

        // favorite panel
        JPanel favoritePanel = new JPanel();
        favLocation = new JLabel("Favorite:");
        loadFavButton.addActionListener(new LoadFavButtonListener(favoritedLocation));
        loadFavButton.setPreferredSize(new Dimension(320, locationList.getPreferredSize().height));

        favoritePanel.add(favLocation);
        favoritePanel.add(loadFavButton);

        // data panel
        JPanel dataPanel = new JPanel();
        // dataPanel.setLayout(new GridLayout(3, 1));

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

    @SuppressWarnings("unchecked")
    public class LoadButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            LoadWeatherData.fetchData((String) locationList.getSelectedItem(), weatherLocation, temperatureLabel,
                    humidityLabel);
        }

    }

    public class AddFavButtonListener implements ActionListener {
        private String[] favoritedLocation;
        private JButton loadFavButton;

        public AddFavButtonListener(String[] favoritedLocation, JButton loadFavButton) {
            this.favoritedLocation = favoritedLocation;
            this.loadFavButton = loadFavButton;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            favoritedLocation[0] = (String) locationList.getSelectedItem();
            loadFavButton.setText(favoritedLocation[0]); 

            /* String favlocName = favoritedLocation[0];
            String date = "2024-02-24";
            WeatherService weatherService = new WeatherService();
            Location location = new Location(0, favlocName, Date.valueOf(date));
            weatherService.insert(location); */
        }

    }

    public class LoadFavButtonListener implements ActionListener {
        private String[] favoritedLocation;

        public LoadFavButtonListener(String[] favoritedLocation) {
            this.favoritedLocation = favoritedLocation;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            LoadWeatherData.fetchData((String) favoritedLocation[0], weatherLocation, temperatureLabel,
                    humidityLabel);
        }

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            WeatherAppGUIACTION app = new WeatherAppGUIACTION();
            app.setVisible(true);
        });
    }
}
