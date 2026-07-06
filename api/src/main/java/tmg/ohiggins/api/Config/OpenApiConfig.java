package tmg.ohiggins.api.Config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI()
                .info(new Info()
                        .title("API TMG O'Higgins")
                        .description("Documentacion de endpoints para notas, cursos y anotaciones.")
                        .version("1.0.0"));
    }
}
