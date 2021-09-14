package ws01.server;

import ws01.ws.HelloWSImpl;

import javax.xml.ws.Endpoint;

/**
 * @Date:2021/09_7:47 下午
 * @Description：
 */
public class serverTest {
    public static void main(String[] args) {
        String address = "http://localhost:8989/day01/hellows";
        Endpoint.publish(address, new HelloWSImpl());   //发布服务端（SEI）
    }
}
