package com.ipageon.nmsif;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.kt.bcn.adaptor.equip.server.service.as", "com.ipageon.nmsif", "com.samsung.nms.agent.dataType"})
@ConfigurationPropertiesScan
public class NesNmsifApplication {

	public static void main(String[] args) {
		SpringApplication.run(NesNmsifApplication.class, args);
	}

}
