package com.javaspring.customer_profile.config;

import javax.faces.webapp.FacesServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@Configuration
public class JsfConfig extends SpringBootServletInitializer {

    @Bean
    public ServletRegistrationBean<FacesServlet> facesServlet() {
        return new ServletRegistrationBean<>(new FacesServlet(), "*.xhtml");
    }
}
