package Framework;

public class ElemException extends RuntimeException{


        public ElemException(String message) {
            super(message);
        }

        @Override
        public String toString() {
            return "My WebElementNotFoundException is working message=" + getMessage();
        }
    }

