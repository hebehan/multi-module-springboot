package com.hebehan.config;

import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

/**
 * Created by Hebe Han
 * Date: 2019-01-17
 */
//@Configuration
public class ErrorPageConfig{

    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer() {
        return container -> {
            //ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED, "/401.html");
            ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/808.html");
            ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/Err500.html");
            container.addErrorPages(error404Page, error500Page);
        };
    }
}
