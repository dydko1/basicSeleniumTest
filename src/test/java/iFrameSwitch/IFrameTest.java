package iFrameSwitch;

import org.testng.annotations.Test;
import pl.sii.excersise.sorting.stu.SortByName;

import java.util.logging.Logger;

public class IFrameTest {
    static Logger logger = Logger.getLogger(IFrameTest.class.getName());

    @Test
    private void test1() {
        System.out.println("Test1");

        executeOnIFrame(()->{
            logger.info("Start method");

            logger.info("The end of method");
        });
    }

    private void executeOnIFrame(Runnable r) {
        logger.info(" ---- Inside iframe ----");
        r.run();
        logger.info(" ----Outside iframe ----");
    }
}
