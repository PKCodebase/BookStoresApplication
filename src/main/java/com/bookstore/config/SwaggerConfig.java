package com.bookstore.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openApi(){
        return new OpenAPI()
                .info(new Info()
                        .title("Bookstore API")
                        .description("API for managing a bookstore")
                        .version("1.0"));
////                        .contact(new Contact()
////                                .name("Your Name")
////                                .email("your.email@example.com")
////                                .url("https://example.com"))
////                        .license(new License()
////                                .name("MIT License")
////                                .url("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")));
////        }
//    }


//        @Bean
//        public OpenAPI openApi(){
//            return new OpenAPI()
//                    .info(new Info()
//                            .title("E-Commerce API")
//                            .description("API for E-Commerce Application")
//                            .version("1.0")
//                    );
//        }

    }
}
