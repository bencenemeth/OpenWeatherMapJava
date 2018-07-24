import Model.WeatherData;
import Service.OpenWeatherMapService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Logger logger = LoggerFactory.getLogger(Main.class);
        //System.out.println("Welcome to the OpenWeatherMap Application!");
        //System.out.println("Please enter a city:");
        logger.info("Welcome to the OpenWeatherMap Application!");
        logger.info("Please enter a city:");
        Scanner in = new Scanner(System.in);
        String query = in.next();
        OpenWeatherMapService service = new OpenWeatherMapService();
        WeatherData weatherData = service.GetWeatherData(query);
        System.out.println("The current temperature in " + weatherData.getName() + ", "
                           + weatherData.getSys().getCountry() + " is "
                           + weatherData.getMain().getTemp() + "°C.");
    }
}
