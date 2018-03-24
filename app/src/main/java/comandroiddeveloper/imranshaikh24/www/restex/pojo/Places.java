package comandroiddeveloper.imranshaikh24.www.restex.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by root on 24/3/18.
 */

public class Places
{
    @SerializedName("results")
    private ArrayList<Place> list;

    public ArrayList<Place> getList() {
        return list;
    }

    public void setList(ArrayList<Place> list) {
        this.list = list;
    }
}
