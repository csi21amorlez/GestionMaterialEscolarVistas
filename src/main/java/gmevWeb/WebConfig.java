package gmevWeb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


// TODO: Auto-generated Javadoc
/**
 * Configuracion basica del contexto para la capa web.
 */
@Configuration
@ComponentScan
@EnableWebMvc
public class WebConfig {
	
    /**
     * Mapeo.
     *
     * @return the view resolver
     */
    @Bean
    public ViewResolver mapeo() {
        InternalResourceViewResolver irvr = new InternalResourceViewResolver();
        irvr.setPrefix("/views/");
        irvr.setSuffix(".jsp");
        return irvr;
    }

}