package lesson10.Q13WeatherApp.WeatherApp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JLabel;

public class LoadWeatherData {
    public static void fetchData(String locationName, JLabel weatherLocation, JLabel temperatureLabel, JLabel humidityLabel) {
        String[] fileNames = { "WeatherKT.txt", "WeatherKL.txt", "WeatherKB.txt" };
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
                    weatherLocation.setText("[" + city + "]");
                    temperatureLabel.setText("Temperature: " + temperature + " °C");
                    humidityLabel.setText("Humidity: " + humidity + "%");
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}