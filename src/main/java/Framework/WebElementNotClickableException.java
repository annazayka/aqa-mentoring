package Framework;

public class WebElementNotClickableException extends RuntimeException{


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

