package cn.tonlyshy.app.fmweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liaowm5 on 17/3/21.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;

        public String code;
    }
}
