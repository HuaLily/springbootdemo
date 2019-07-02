package com.example.demo.MyConfig;

import com.example.demo.Filter.MyFilter;
import com.example.demo.Servlet.MyServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class MyWebConfig extends WebMvcConfigurationSupport {

    @Autowired
    MyServlet myServlet;

    @Autowired
    MyFilter myFilter;

    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        return new ServletRegistrationBean(myServlet,"/myservlet");
    }

    @Bean
    public FilterRegistrationBean getFilterRegistrationBean(){
      FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
      filterRegistrationBean.setFilter(myFilter);
      return filterRegistrationBean;
    }


}
