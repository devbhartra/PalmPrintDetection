package handdetection.androidexample.com.handdetection;

import java.util.List;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface HelloApi {
    @GET("posts")
    Call<List<Post>> getPosts();

//    @FormUrlEncoded
//    @POST("/spi/Hello")
//    Call<UploadResponseModel> getScore(@Field("url") String url);
    @Headers({"Accept: application/json"})
    @POST("api/Similrty_score")
    Call<ResponseBody> getScore(@Body HelloRequest request);
}