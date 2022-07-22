package Trello;

import java.io.IOException;

public class Board {

        public String id;
        public String name;
        public String desc;
        public String url;

        @Override
        public String toString() {
                return "name"+name+"id="+id;
        }
}
