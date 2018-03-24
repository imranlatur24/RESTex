package comandroiddeveloper.imranshaikh24.www.restex.pojo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import comandroiddeveloper.imranshaikh24.www.restex.MainActivity;
import comandroiddeveloper.imranshaikh24.www.restex.R;

/**
 * Created by root on 24/3/18.
 */

public class MyAdapter extends BaseAdapter
{
    MainActivity mainActivity;
    Places places_;
    public MyAdapter(MainActivity mainActivity, Places places_) {
        this.mainActivity=mainActivity;
        this.places_=places_;
    }

    @Override
    public int getCount() {
        return places_.getList().size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater= LayoutInflater.from(mainActivity);
        View v = inflater.inflate(R.layout.individual,null);
        TextView textView1 = v.findViewById(R.id.tv1);
        TextView textView2 = v.findViewById(R.id.tv2);

        textView1.setText(places_.getList().get(i).getName());
        textView2.setText(places_.getList().get(i).getVicity());
        return v;
    }
}
