package Trello;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ColumnService {
    @GET("boards/{idBoard}/lists")
    Call<Column> getColumn(@Path("idBoard") String idBoard);
}
