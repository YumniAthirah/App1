package lesson10.Q13WeatherApp.TestingWeather;

import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WeatherApp  extends JFrame {
    private JLabel weatherTitle;
    private JLabel weatherLocation;
    private JLabel temperatureLabel;
    private JLabel humidityLabel;

    public WeatherApp() {
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

        // buttons panel
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 3));
        buttonsPanel.add(createButton("Kuala Terengganu", "C:/Users/Yumni Athirah Alias/JavaClassFeb24/App1/WeatherKT.txt"));
        buttonsPanel.add(createButton("Kuala Lumpur", "C:/Users/Yumni Athirah Alias/JavaClassFeb24/App1/WeatherKL.txt"));
        buttonsPanel.add(createButton("Kota Bharu", "C:/Users/Yumni Athirah Alias/JavaClassFeb24/App1/WeatherKB.txt"));

        // main panel
        panel.add(weatherTitle);
        panel.add(weatherLocation);
        panel.add(buttonsPanel);
        panel.add(temperatureLabel);
        panel.add(humidityLabel);
        
        add(panel);

    }

    private JButton createButton(String buttonText, String filePath){
        JButton loadbutton = new JButton(buttonText);
        loadbutton.addActionListener(e -> loadWeatherData(filePath));
        return loadbutton;
    }

    // load data from Weather.txt
    private void loadWeatherData(String filePath) {
        File file = new File(filePath);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("[") && line.endsWith("]")) {
                    String city = line.substring(1, line.length() - 1);
                    String tempLine = reader.readLine().trim();
                    String humLine = reader.readLine().trim();
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
}
