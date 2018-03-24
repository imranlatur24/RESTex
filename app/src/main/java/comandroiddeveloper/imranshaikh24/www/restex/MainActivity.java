package comandroiddeveloper.imranshaikh24.www.restex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Spinner;

import comandroiddeveloper.imranshaikh24.www.restex.pojo.MyAdapter;
import comandroiddeveloper.imranshaikh24.www.restex.pojo.Place;
import comandroiddeveloper.imranshaikh24.www.restex.pojo.Places;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    Spinner sp;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = (Spinner)findViewById(R.id.spinner);
        listView = (ListView)findViewById(R.id.list);
    }
    public void parseAPI(View view)
    {
        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("https://maps.googleapis.com/")
                .addConverterFactory(GsonConverterFactory.create()).build();
        PlacesAPI placesAPI = retrofit.create(PlacesAPI.class);

        Call<Places> placesCall = placesAPI.getPlaces();
        placesCall.enqueue(new Callback<Places>() {
            @Override
            public void onResponse(Call<Places> call, Response<Places> response) {
                Places places_ = response.body();
                listView.setAdapter(new MyAdapter(MainActivity.this,places_));
            }
            @Override
            public void onFailure(Call<Places> call, Throwable t) {
            }
        });

    }
}
