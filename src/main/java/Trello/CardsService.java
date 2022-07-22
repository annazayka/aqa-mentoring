package Trello;

import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface CardsService {
    @GET("boards/{idBoard}/cards")
    Call <List<Card>> getCard(@Path("idBoard") String idBoard);

    @POST("cards")
    Call<Card> postCard(@Query("idList") String idList, @Body Card card);
}
