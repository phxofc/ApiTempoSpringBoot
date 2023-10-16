package br.com.pedro_api_tempo.apitempo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;



@Configuration
public class ConfigurationRestTemplate {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    
}

}
