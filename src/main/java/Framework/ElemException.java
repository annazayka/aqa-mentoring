package Framework;

public class ElemException extends Exception{


        public ElemException(String message) {
            super(message);
        }

        @Override
        public String toString() {
            return "My WebElementNotFoundException is working message=" + getMessage();
        }
    }

