package comandroiddeveloper.imranshaikh24.www.restex.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by root on 24/3/18.
 */

public class Location
{
    @SerializedName("lat")
    private double lat;
    @SerializedName("lng")
    private double longi;

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLongi() {
        return longi;
    }

    public void setLongi(double longi) {
        this.longi = longi;
    }
}
