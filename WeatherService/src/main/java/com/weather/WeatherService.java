package com.weather;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Value("${weatherbit.api.key}")
    private String apiKey;

    private final String apiUrl = "https://api.weatherbit.io/v2.0/current?city={city}&key={apiKey}";
    
    private final RestTemplate restTemplate;

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Weather getWeather(String city) {
    	String url = apiUrl.replace("{city}", city).replace("{apiKey}", apiKey);
        return restTemplate.getForObject(url, Weather.class);
    }
}

