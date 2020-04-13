package com.example.demo;

//import com.example.demo.filter.MyFilter;
//import com.example.demo.filter.SecondFilter;
import io.prometheus.client.spring.web.EnablePrometheusTiming;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnablePrometheusTiming
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Bean
//	public FilterRegistrationBean myFilter(){
//		FilterRegistrationBean registrationBean = new FilterRegistrationBean(new MyFilter());
//		registrationBean.addUrlPatterns("/hello/*");
//		registrationBean.addInitParameter("paramName","paramValue");
//		registrationBean.setName("myFilter");
//		registrationBean.setOrder(1);
//		return registrationBean;
//	}
//	@Bean
//	public FilterRegistrationBean secondFilter(){
//		FilterRegistrationBean registrationBean = new FilterRegistrationBean(new SecondFilter());
//		registrationBean.addUrlPatterns("/hello/*");
//		registrationBean.addInitParameter("paramName","paramValue");
//		registrationBean.setName("secondFilter");
//		registrationBean.setOrder(2);
//		return registrationBean;
//	}
}
