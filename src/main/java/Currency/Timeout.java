package Currency;

public class Timeout {

        private static long SHORT_WAIT = 30;
        private static long DEFAULT_WAIT = 30;

        public Timeout() {
        }

        public static long getDefault() {
            return DEFAULT_WAIT;
        }

        public static long getDefaultElem() {
            return SHORT_WAIT;
        }


}
