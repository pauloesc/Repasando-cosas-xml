package filtros;

import java.io.IOException;
import java.util.logging.Logger;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Segundo implements Filter {

    private FilterConfig filterConfig;
    private static final Logger log = Logger.getLogger(Segundo.class.getName());

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
        throws IOException, ServletException {
        log.warning("Log filter processed a " + getFilterConfig().getInitParameter("logType")
            + " request");

        System.out.println("222");
        System.out.println("Log filter processed a " + getFilterConfig().getInitParameter("logType")
                + " request");
        System.out.println("222");
        
        filterChain.doFilter(request, response);
        
        System.out.println("222-luego de doFilter");
    }

    public FilterConfig getFilterConfig() {
        return filterConfig;
    }

    public void init(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
    }

    public void destroy() {}

}

