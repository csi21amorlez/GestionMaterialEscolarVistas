
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import gmevWeb.WebConfig;
import gmewApp.AppConfig;

// TODO: Auto-generated Javadoc
/**
 * The Class RoutingConfig.
 */
public class RoutingConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	/**
	 * Gets the root config classes.
	 *
	 * @return the root config classes
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{AppConfig.class};
	}

	/**
	 * Gets the servlet config classes.
	 *
	 * @return the servlet config classes
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {WebConfig.class};
	}

	/**
	 * Gets the servlet mappings.
	 *
	 * @return the servlet mappings
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	
}