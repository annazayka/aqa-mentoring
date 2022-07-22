package Trello;

public class Column {
   public String id;
   public String name;
   public Boolean closed;
   public String idBoard;

   @Override
   public String toString() {
      return "name"+name+"id="+id+"closed="+closed;
   }
}
