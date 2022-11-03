package com.practice.uploaddownloadspringBootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
    FileStoragePojo.class
})
public class UploadDownloadSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(UploadDownloadSpringBootAppApplication.class, args);
	}

}
