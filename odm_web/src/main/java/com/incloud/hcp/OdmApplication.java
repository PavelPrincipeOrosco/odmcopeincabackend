package com.incloud.hcp;

import com.incloud.hcp.utils.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PostConstruct;
import java.util.TimeZone;


@SpringBootApplication
@EnableScheduling
public class OdmApplication extends SpringBootServletInitializer {

	private static ConfigurableApplicationContext context;
	private static final Logger log = LoggerFactory.getLogger(OdmApplication.class);

	public static void main(String[] args) {
		//SpringApplication.run(OdmApplication.class, args);
		context = SpringApplication.run(OdmApplication.class, args);
	}

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(OdmApplication.class);
//	}

	@PostConstruct
	public void init(){
		// Setting Spring Boot Init
		TimeZone.setDefault(TimeZone.getTimeZone(DateUtils.DEFAULT_ZONE_ID));
	}

	public static void restart() {
		ApplicationArguments args = context.getBean(ApplicationArguments.class);
		Thread thread = new Thread(() -> {
			context.close();
			context = SpringApplication.run(OdmApplication.class, args.getSourceArgs());
		});
		thread.setDaemon(false);
		thread.start();
	}
	
	
}
