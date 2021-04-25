package net.kuleasycode.tkcloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TkCloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TkCloudServerApplication.class, args);
	}

}
