package Trello;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface BoardService {
        @GET("boards/{id}")
        Call<Board> getBoard(@Path("id") String id);

        @POST("boards")
        Call<Board> createBoard(@Query("name") String name);


}
