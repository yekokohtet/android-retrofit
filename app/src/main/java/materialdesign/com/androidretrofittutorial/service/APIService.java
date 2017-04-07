package materialdesign.com.androidretrofittutorial.service;

import java.util.List;

import materialdesign.com.androidretrofittutorial.model.User;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by yekokohtet on 1/10/17.
 */

public interface APIService {
    @GET("json_bangla")
    Call<List<User>> getData();
}
