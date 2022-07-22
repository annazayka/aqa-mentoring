package Trello;

import retrofit2.Call;

import java.io.IOException;
import java.util.List;

public class TestApi {
    public static void main(String[] args) throws IOException {

         TrelloClient trelloRestClient = new TrelloClient();
         Card newcard= new Card("helloCard");
      // Board newboard= trelloRestClient.boardService.createBoard("mytest").execute().body();
        Board board =  trelloRestClient.boardService.getBoard("S6dDDBP0").execute().body();
        System.out.println(board.toString());
       // var ?? = trelloRestClient.columnService.getColumn("S6dDDBP0").execute().body()
       trelloRestClient.cardService.postCard("62d9b891adf1e14a699d6e28",newcard);
       List<Card> cards = trelloRestClient.cardService.getCard("S6dDDBP0").execute().body();
       System.out.println(cards);





    }
}
