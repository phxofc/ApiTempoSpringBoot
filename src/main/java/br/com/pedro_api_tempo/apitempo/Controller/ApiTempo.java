package br.com.pedro_api_tempo.apitempo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import br.com.pedro_api_tempo.apitempo.model.WeatherResponse;

@RestController
@RequestMapping("/weather")
public class ApiTempo {

   

    @Value("${openweathermap.api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;


      @GetMapping("/{city}")
    public WeatherResponse getWeather(@PathVariable String city) {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey;

        WeatherResponse response = restTemplate.getForObject(url, WeatherResponse.class);
    
          
        

        return response;
    }

   
    
}
