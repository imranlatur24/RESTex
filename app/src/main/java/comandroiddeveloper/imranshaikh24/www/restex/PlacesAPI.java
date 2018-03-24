package comandroiddeveloper.imranshaikh24.www.restex;

import comandroiddeveloper.imranshaikh24.www.restex.pojo.Places;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by root on 24/3/18.
 */

public interface PlacesAPI
{
    @GET("maps/api/place/nearbysearch/json?location=-33.8670,151.1957&radius=500&types=atm&key=AIzaSyBGiMPCZbiePPetkIk0itTf5T5EBQ4C5Dw")
   Call<Places> getPlaces();
}
