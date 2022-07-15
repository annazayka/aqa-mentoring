package Framework;

import java.util.concurrent.TimeoutException;

public class WebElementNotClickableException extends Exception {


        public WebElementNotClickableException(String message) {
            super(message);
        }

        @Override
        public String toString() {
            return "My WebElementNotClickableException is working{"
                    + ", message=" + getMessage()
                    + "} ";
        }
    }

