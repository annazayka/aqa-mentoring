package Trello;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class AuthInterceptor implements Interceptor {
    private static final String DEFAULT_TRELLO_API_KEY = "655799b6c077a763cf4cc9f19bef7ee1";
    private static final String DEFAULT_TRELLO_TOKEN = "f93463da24c5150c21a65a89d5b86a22889ece6d18c4f28f9269cd29786003f0";

    @Override
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request original = chain.request();
        HttpUrl originalHttpUrl = original.url();

        HttpUrl url = originalHttpUrl.newBuilder()
                .addQueryParameter("key", DEFAULT_TRELLO_API_KEY)
                .addQueryParameter("token", DEFAULT_TRELLO_TOKEN)
                .build();

        // Request customization: add request headers
        Request.Builder requestBuilder = original.newBuilder()
                .url(url);

        Request request = requestBuilder.build();
        return chain.proceed(request);
    }
}
