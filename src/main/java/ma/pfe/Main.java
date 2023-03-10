package ma.pfe;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Main {
    private final static Logger LOGGER= LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        SpringApplication.run(Main.class);
        LOGGER.trace("start appli log 1");
        LOGGER.debug("start appli log 2");
        LOGGER.info("start appli log 3");
        LOGGER.warn("start appli log 4");
        LOGGER.error("start appli log 5");

    }
}