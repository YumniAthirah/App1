package lesson10.copyWeatherApp;

import javax.swing.SwingUtilities;

public class MainWeather {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            WeatherAppGUI app = new WeatherAppGUI();
            app.setVisible(true);
        });
    }
}