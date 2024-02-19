package lesson10.Q13WeatherApp.TestingWeather;

import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;

public class WeatherAppOri extends JFrame {
    private JLabel weatherTitle;
    private JLabel weatherLocation;
    private JLabel temperatureLabel;
    private JLabel humidityLabel;

    public WeatherAppOri() {
        setTitle("Weather");
        setSize(500, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();

        // label
        weatherTitle = new JLabel("Today's Weather: ");
        weatherLocation = new JLabel("Choose Location:");
        temperatureLabel = new JLabel("Temperature: N/A");
        humidityLabel = new JLabel("Humidity: N/A");

        // buttons
        JButton loadKTButton = new JButton("Kuala Terengganu");
        loadKTButton.addActionListener(e -> loadWeatherData("C:/Users/Yumni Athirah Alias/JavaClassFeb24/App1/WeatherKT.txt"));

        JButton loadKLButton = new JButton("Kuala Lumpur");
        loadKLButton.addActionListener(e -> loadWeatherData("C:/Users/Yumni Athirah Alias/JavaClassFeb24/App1/WeatherKL.txt"));

        JButton loadKBButton = new JButton("Kota Bharu");
        loadKBButton.addActionListener(e -> loadWeatherData("C:/Users/Yumni Athirah Alias/JavaClassFeb24/App1/WeatherKB.txt"));

        // buttons panel
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 3));
        buttonsPanel.add(loadKTButton);
        buttonsPanel.add(loadKLButton);
        buttonsPanel.add(loadKBButton);

        // main panel
        panel.add(weatherTitle);
        panel.add(weatherLocation);
        panel.add(buttonsPanel);
        panel.add(temperatureLabel);
        panel.add(humidityLabel);
        
        add(panel);

    }

    // load data from Weather.txt
    private void loadWeatherData(String filePath) {
        File file = new File(filePath);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("[") && line.endsWith("]")) {

                    // these code assume that line 0, 1, 2 are... 
                    // ...city line, temperature line and humidity line respectively
                    String city = line.substring(1, line.length() - 1);
                    String tempLine = reader.readLine().trim();
                    String humLine = reader.readLine().trim();

                    // extract and convert the string to double data type 
                    // Line.substring = extracts a substring from line
                    // + 2: adds 2 to the index obtained from indexOf(":")
                    // to skip the colon and the space following it
                    double temperature = Double.parseDouble(tempLine.substring(tempLine.indexOf(":") + 2));
                    double humidity = Double.parseDouble(humLine.substring(humLine.indexOf(":") + 2));

                    weatherLocation.setText(city);
                    temperatureLabel.setText("Temperature in " + ": " + temperature + " °C");
                    humidityLabel.setText("Humidity in " + ": " + humidity + "%");
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

        public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            WeatherAppOri app = new WeatherAppOri();
            app.setVisible(true);
        });
    }

}