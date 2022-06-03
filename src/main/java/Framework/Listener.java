package Framework;

import java.util.logging.Logger;

public class Listener {

    private static final Logger la = Logger.getLogger("test");
//    public static void main(String[] args) throws Exception {
//        LOGGER.info("Logger Name: "+LOGGER.getName());
//        LOGGER.warning("warning");
//    }
public void assertElementsPresent() {


        la.log(elem.isPresent(), "Element: '" + elems + "' NOT PRESENT!");
       // System.out.println("CHECK " + elems.getCssSelector());


}
}
