/*package login.registration;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthFilter implements Filter {

    public  void destroy(){

    }

    public void  init (FiterConfig config){

    }

    public void doFilter (ServletRequest req, ServletResponse resp , FilterChain chain) throws ServletException {
        Customer c = (Customer) ((HttpServletRequest) req).getSession().getAttribute("current_user");
        if (c != null) {
            chain.doFilter(req, resp);
        }
        else ((HttpServletResponse) resp).sendRedirect("/login");
    }
}
*/
