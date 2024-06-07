package course.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("RESTful API with Java 17 and Spring Boot 3")
                .version("v1")
                .description("0 REST API course and deploy to AWS c. Spring Boot framework Swagger JWT JUnit 5 Mockito Docker React JS and")
                .termsOfService("https://pub.erudio.com.br/meus-cursos")
                .license(
                    new License()
                        .name("Apache 2.0")
                        .url("https://pub.erudio.com.br/meus-cursos")
                )
            );
    }

}
