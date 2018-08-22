package gob.mef.hcardenas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HcardenasServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HcardenasServerApplication.class, args);
	}
}
