package materialdesign.com.androidretrofittutorial.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import materialdesign.com.androidretrofittutorial.R;
import materialdesign.com.androidretrofittutorial.adapter.RecyclerViewAdapter;
import materialdesign.com.androidretrofittutorial.model.User;
import materialdesign.com.androidretrofittutorial.network.ApiClient;
import materialdesign.com.androidretrofittutorial.service.APIService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getUserList();
    }

    private void getUserList() {
        try{
            APIService service = ApiClient.getClient().create(APIService.class);

            Call<List<User>> call = service.getData();

            call.enqueue(new Callback<List<User>>() {
                @Override
                public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                    List<User> rowListItem = response.body();
                    linearLayoutManager = new LinearLayoutManager(MainActivity.this);

                    RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

                    recyclerView.setLayoutManager(linearLayoutManager);

                    RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(rowListItem);

                    recyclerView.setAdapter(recyclerViewAdapter);
                }

                @Override
                public void onFailure(Call<List<User>> call, Throwable t) {
                    Log.d("onFailure", t.toString());
                }
            });

        }catch (Exception e) {}
    }
}
