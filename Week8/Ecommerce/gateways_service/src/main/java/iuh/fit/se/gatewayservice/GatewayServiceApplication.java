package iuh.fit.se.gatewayservice;

import iuh.fit.se.gatewayservice.utils.JwtTokenGenerator;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayServiceApplication {

    @Autowired
    private JwtTokenGenerator jwtTokenGenerator;

    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceApplication.class, args);
    }

    @PostConstruct
    public void printToken() {
        String token = jwtTokenGenerator.generateToken("user123");
        System.out.println("Generated Token for api : " + token);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}