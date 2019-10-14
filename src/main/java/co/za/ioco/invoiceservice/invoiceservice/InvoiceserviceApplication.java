package co.za.ioco.invoiceservice.invoiceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication 
@ComponentScan(basePackages = "co.za.ioco.invoiceservice.invoiceservice")
@EnableSwagger2
public class InvoiceserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvoiceserviceApplication.class, args);
	}

}
