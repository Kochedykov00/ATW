package login.registration;



import freemarker.template.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class Freemarker {

    private static Configuration cfg = null;

    public static Configuration getConfig(HttpServletRequest req) {
        if (cfg == null) {

            cfg = new Configuration(Configuration.VERSION_2_3_29);

            cfg.setServletContextForTemplateLoading(req.getServletContext(), "/WEB-INF/templates");
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.HTML_DEBUG_HANDLER);
        }
        return cfg;
    }

    public static void render(HttpServletRequest request,
                              HttpServletResponse response,
                              String path,
                              Map<String, Object> root) throws IOException {


        Configuration cfg = Freemarker.getConfig(request);
        try {
            Template tmpl = cfg.getTemplate(path);
            try {
                response.setContentType("text/html");
                tmpl.process(root, response.getWriter());
            } catch (TemplateException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
