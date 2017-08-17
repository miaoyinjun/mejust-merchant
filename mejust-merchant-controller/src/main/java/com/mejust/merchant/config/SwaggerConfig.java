package com.mejust.merchant.config;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.ApiKeyVehicle;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * SwaggerConfig
 *
 * @author wangmingsen
 * @create 2017-07-5 2:10 PM
 **/
@EnableSwagger2
@Configuration
public class SwaggerConfig {


    private ApiInfo apiInfo() {
        Contact contact = new Contact("wangmingsen", "", "wangmingsen.sinoland666.com");
        VendorExtension vendor = new VendorExtension() {
            @Override
            public String getName() {
                return null;
            }

            @Override
            public Object getValue() {
                return null;
            }
        };
        return new ApiInfo(
                "商户 Service Rest API",
                "商户微服务",
                "1.0",
                "",
                contact,
                "商户微服务",
                "http://www.mejust.com//", Lists.newArrayList(vendor));
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.mejust.merchant"))
                .build()
                .directModelSubstitute(Date.class, Long.class)
                .securitySchemes(Collections.singletonList(apiKey()))
                .securityContexts(
                        Collections.singletonList(securityContext())
                )
                .useDefaultResponseMessages(false)
                .apiInfo(apiInfo());

    }

    private SecurityContext securityContext() {
        return SecurityContext.builder()
                .securityReferences(defaultAuth())
                .forPaths(
                        PathSelectors.any()
                )
                .build();
    }

    private List<SecurityReference> defaultAuth() {
        AuthorizationScope[] authorizationScopes = {new AuthorizationScope("global", "accessEverything")};
        return Lists.newArrayList(new SecurityReference("vehicleApiKey", authorizationScopes));
    }

    private ApiKey apiKey() {
        return new ApiKey("vehicleApiKey", "api_key", ApiKeyVehicle.HEADER.getValue());
    }

    @Bean
    SecurityConfiguration securityConfiguration() {
        return new SecurityConfiguration("vehicleMicro", "test-screte", "realm",
                "testApp", "apiKey", ApiKeyVehicle.HEADER, "api_key", ",");
    }

    @Bean
    UiConfiguration uiConfig() {
        return new UiConfiguration(
                "validatorUrl",// url
                "none",       // docExpansion          => none | list
                "alpha",      // apiSorter             => alpha
                "schema",     // defaultModelRendering => schema
                UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS,
                false,        // enableJsonEditor      => true | false
                true,         // showRequestHeaders    => true | false
                60000L);      // requestTimeout => in milliseconds, defaults to null (uses jquery xh timeout)
    }
}
