package Trello;

import com.airslate.api.interceptors.HTTPLogInterceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

public class TrelloClient {
    private static final String BASE_URL = "https://api.trello.com/1/";

         OkHttpClient client = new OkHttpClient().newBuilder()
             .addInterceptor(new AuthInterceptor())
             .addInterceptor(new HTTPLogInterceptor())
             .connectTimeout(10, TimeUnit.SECONDS)
             .readTimeout(30, TimeUnit.SECONDS)
              .build();

        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();




       public BoardService boardService = retrofit.create(BoardService.class);
       public CardsService cardService = retrofit.create(CardsService.class);
       public ColumnService columnService = retrofit.create(ColumnService.class);

      //  return null;
    }

