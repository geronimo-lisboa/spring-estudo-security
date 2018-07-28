package don.geronimo.estudo.testeautenticacao2;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.*;
import java.io.*;
@Configuration
public class JWTAuthenticationFilter extends GenericFilterBean {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
            throws IOException, ServletException {
        System.out.println("JWTAuthenticationFilter.doFilter");
        filterChain.doFilter(request, response);
    }
}
