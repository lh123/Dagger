package com.lh.dagger.bean;

/**
 * Created by liuhui on 2016/5/6.
 * 该类记录城市信息
 */
@SuppressWarnings("unused")
public class City
{
    /*errNum: 0,
    errMsg: "success",
    retData: {
    city: "北京", //城市
            pinyin: "beijing", //城市拼音
            citycode: "101010100",  //城市编码
            date: "15-02-11", //日期
            time: "11:00", //发布时间
            postCode: "100000", //邮编
            longitude: 116.391, //经度
            latitude: 39.904, //维度
            altitude: "33", //海拔
            weather: "晴",  //天气情况
            temp: "10", //气温
            l_tmp: "-4", //最低气温
            h_tmp: "10", //最高气温
            WD: "无持续风向",	 //风向
            WS: "微风(<10m/h)", //风力
            sunrise: "07:12", //日出时间
            sunset: "17:44" //日落时间*/

    private int errNum;
    private String errMsg;
    private RetData retData;

    public int getErrNum()
    {
        return errNum;
    }

    public void setErrNum(int errNum)
    {
        this.errNum = errNum;
    }

    public String getErrMsg()
    {
        return errMsg;
    }

    public void setErrMsg(String errMsg)
    {
        this.errMsg = errMsg;
    }

    public RetData getRetData()
    {
        return retData;
    }

    public void setRetData(RetData retData)
    {
        this.retData = retData;
    }

    public static class RetData
    {
        private String city;
        private String pinyin;
        private String citycode;
        private String date;
        private String time;
        private String postCode;
        private float longitude;

        public String getCity()
        {
            return city;
        }

        public void setCity(String city)
        {
            this.city = city;
        }

        public String getPinyin()
        {
            return pinyin;
        }

        public void setPinyin(String pinyin)
        {
            this.pinyin = pinyin;
        }

        public String getCitycode()
        {
            return citycode;
        }

        public void setCitycode(String citycode)
        {
            this.citycode = citycode;
        }

        public String getDate()
        {
            return date;
        }

        public void setDate(String date)
        {
            this.date = date;
        }

        public String getTime()
        {
            return time;
        }

        public void setTime(String time)
        {
            this.time = time;
        }

        public String getPostCode()
        {
            return postCode;
        }

        public void setPostCode(String postCode)
        {
            this.postCode = postCode;
        }

        public float getLongitude()
        {
            return longitude;
        }

        public void setLongitude(float longitude)
        {
            this.longitude = longitude;
        }

        public float getLatitude()
        {
            return latitude;
        }

        public void setLatitude(float latitude)
        {
            this.latitude = latitude;
        }

        public String getAltitude()
        {
            return altitude;
        }

        public void setAltitude(String altitude)
        {
            this.altitude = altitude;
        }

        public String getWeather()
        {
            return weather;
        }

        public void setWeather(String weather)
        {
            this.weather = weather;
        }

        public String getTemp()
        {
            return temp;
        }

        public void setTemp(String temp)
        {
            this.temp = temp;
        }

        public String getL_tmp()
        {
            return l_tmp;
        }

        public void setL_tmp(String l_tmp)
        {
            this.l_tmp = l_tmp;
        }

        public String getH_tmp()
        {
            return h_tmp;
        }

        public void setH_tmp(String h_tmp)
        {
            this.h_tmp = h_tmp;
        }

        public String getWD()
        {
            return WD;
        }

        public void setWD(String WD)
        {
            this.WD = WD;
        }

        public String getWS()
        {
            return WS;
        }

        public void setWS(String WS)
        {
            this.WS = WS;
        }

        public String getSunrise()
        {
            return sunrise;
        }

        public void setSunrise(String sunrise)
        {
            this.sunrise = sunrise;
        }

        public String getSunset()
        {
            return sunset;
        }

        public void setSunset(String sunset)
        {
            this.sunset = sunset;
        }

        private float latitude;
        private String altitude;
        private String weather;
        private String temp;
        private String l_tmp;
        private String h_tmp;
        private String WD;
        private String WS;
        private String sunrise;
        private String sunset;
    }
}
