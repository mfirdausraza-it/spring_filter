package com.custom.servalet_filter.config;

import com.custom.servalet_filter.filter.HeaderLoggingFilter;
import com.custom.servalet_filter.filter.RequestResponseLoggingFilter;
import com.custom.servalet_filter.filter.TransactionFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterRegistrationBeanConfig {
    @Bean
    public FilterRegistrationBean<HeaderLoggingFilter> headerLoggingFilter(){
        FilterRegistrationBean<HeaderLoggingFilter> headerLogging = new FilterRegistrationBean<>();
        headerLogging.setFilter(new HeaderLoggingFilter());
        headerLogging.setOrder(0);
        headerLogging.setName("HeaderLogging");
        headerLogging.addUrlPatterns("/msg/*");
        return headerLogging;
    }

    @Bean
    public FilterRegistrationBean<TransactionFilter> transactionFilter(){
        FilterRegistrationBean<TransactionFilter> transactionFilter = new FilterRegistrationBean<>();
        transactionFilter.setFilter(new TransactionFilter());
        transactionFilter.setOrder(1);
        transactionFilter.setName("TransactionFilter");
        transactionFilter.addUrlPatterns("/users/*");
        return transactionFilter;
    }

    @Bean
    public FilterRegistrationBean<RequestResponseLoggingFilter> requestResponseLoggingFilter(){
        FilterRegistrationBean<RequestResponseLoggingFilter> RequestResponseLoggingFilter = new FilterRegistrationBean<>();
        RequestResponseLoggingFilter.setFilter(new RequestResponseLoggingFilter());
        RequestResponseLoggingFilter.setOrder(2);
        RequestResponseLoggingFilter.setName("RequestResponseLoggingFilter");
        RequestResponseLoggingFilter.addUrlPatterns("/login/*");
        return RequestResponseLoggingFilter;
    }
}
