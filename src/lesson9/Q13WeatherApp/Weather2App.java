package lesson9.Q13WeatherApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;

public class Weather2App extends JFrame {
    private JLabel weatherTitle;
    private JLabel weatherLocation;
    private JLabel temperatureLabel;
    private JLabel humidityLabel;

    @SuppressWarnings("unchecked")
    public Weather2App() {
        setTitle("Weather");
        setSize(200, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();

        //Title
        weatherTitle = new JLabel("Today's Weather");
        //location
        weatherLocation = new JLabel("");
        // temperature
        temperatureLabel = new JLabel("Temperature: N/A");
        // humidity
        humidityLabel = new JLabel("Humidity: N/A");

        // buttons

        panel.add(weatherTitle);
        panel.add(weatherLocation);
        panel.add(temperatureLabel);
        panel.add(humidityLabel);
        add(panel);
        loadWeatherData();

    }

    private void loadWeatherData() {
        String filePath = "C:/Users/Yumni Athirah Alias/JavaClassFeb24/App1/WeatherKT.txt"; // Specify the file path
                                                                                            // here

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
        } catch (IOException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error reading file: " + ex.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Weather2App app = new Weather2App();
            app.setVisible(true);
        });
    }

}
