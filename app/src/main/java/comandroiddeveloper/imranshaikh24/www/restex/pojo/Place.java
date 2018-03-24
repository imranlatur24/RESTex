package comandroiddeveloper.imranshaikh24.www.restex.pojo;

/**
 * Created by root on 24/3/18.
 */

public class Place
{
    private String name;
    private String vicity;
    private GeoMetry geometry;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVicity() {
        return vicity;
    }

    public void setVicity(String vicity) {
        this.vicity = vicity;
    }

    public GeoMetry getGeometry() {
        return geometry;
    }

    public void setGeometry(GeoMetry geometry) {
        this.geometry = geometry;
    }
}
