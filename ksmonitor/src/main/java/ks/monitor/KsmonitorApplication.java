package ks.monitor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("ks.monitor.dao")
public class KsmonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(KsmonitorApplication.class, args);
	}
}
