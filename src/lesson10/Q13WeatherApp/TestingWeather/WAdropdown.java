package lesson10.Q13WeatherApp.TestingWeather;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class WAdropdown extends JFrame {
    private JLabel weatherTitle;
    private JLabel weatherLocation;
    private JLabel temperatureLabel;
    private JLabel humidityLabel;

    private JComboBox<String> locationList;

    public WAdropdown() {
        setTitle("Weather");
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();

        // label
        weatherTitle = new JLabel("Today's Weather: ");
        weatherLocation = new JLabel("Choose Location:");
        temperatureLabel = new JLabel("Temperature: N/A");
        humidityLabel = new JLabel("Humidity: N/A");

        // Combo box for locations
        String[] locations = { "Kuala Terengganu", "Kuala Lumpur", "Kota Bharu" };
        locationList = new JComboBox<>(locations);
        locationList.addActionListener(e -> loadWeatherData((String) locationList.getSelectedItem()));

        // main panel
        panel.add(weatherTitle);
        panel.add(weatherLocation);
        panel.add(locationList);
        panel.add(temperatureLabel);
        panel.add(humidityLabel);

        add(panel);

    }

    // load data from Weather.txt
    private void loadWeatherData(String locationName) {

        String[] fileNames = { "C:/Users/Yumni Athirah Alias/JavaClassFeb24/App1/WeatherKT.txt",
                "C:/Users/Yumni Athirah Alias/JavaClassFeb24/App1/WeatherKL.txt",
                "C:/Users/Yumni Athirah Alias/JavaClassFeb24/App1/WeatherKB.txt" };

        String filePath = "";
        
        if (locationName.equals("Kuala Terengganu")) {
            filePath = fileNames[0];
        } else if (locationName.equals("Kuala Lumpur")) {
            filePath = fileNames[1];
        } else if (locationName.equals("Kota Bharu")) {
            filePath = fileNames[2];
        }

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
                    temperatureLabel.setText("Temperature: " + temperature + " °C");
                    humidityLabel.setText("Humidity in: " + humidity + "%");
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            WAdropdown app = new WAdropdown();
            app.setVisible(true);
        });
    }
}
