package ws01.test;

import ws01.ws.HelloWSImpl;
import ws01.ws.HelloWSImplService;

/**
 * @Date:2021/09_8:48 下午
 * @Description： 调用服务端（SEI）
 */
public class ClientTest {

    public static void main(String[] args) {
        HelloWSImplService factory = new HelloWSImplService();
        HelloWSImpl helloWS = factory.getHelloWSImplPort(); //获取代理对象
        //System.out.println(helloWS);

        String s = helloWS.sayHello("luwei");   //远程调用服务端
        System.out.println(s);
    }
}
