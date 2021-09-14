package test;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWebService;
import cn.com.webxml.WeatherWebServiceSoap;

/**
 * @Date:2021/09_9:46 下午
 * @Description：
 */
public class WeatherClientTest {

    public static void main(String[] args) {
        WeatherWebService factory = new WeatherWebService();
        WeatherWebServiceSoap weatherWebServiceSoap = factory.getWeatherWebServiceSoap();

        ArrayOfString weatherbyCityName = weatherWebServiceSoap.getWeatherbyCityName("哈尔滨");
        System.out.println(weatherbyCityName.getString());  //getString()是转为数组；最后输出
    }
}
