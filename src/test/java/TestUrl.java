import org.apache.http.client.fluent.Request;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class TestUrl {
    static Logger logger = LoggerFactory.getLogger(TestUrl.class);

    @Test
    public void testUrlGithub() {

        String projecUrl = "http://api.github.com/repos/steeve/france.code-civil";
        String title = null;
        logger.debug("Tentative de connexion à l'url : "+projecUrl);

        try {
            String json = Request.Get(projecUrl).execute().returnContent().asString();
            logger.info(json);
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
    }
}