package io.github.coffee0127.service;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@ImportResource({ "classpath*:META-INF/spring/service-wss.xml" })
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean(ApplicationContext context) {
        return new ServletRegistrationBean(new CXFServlet(), "/wsdl/*");
    }

}
