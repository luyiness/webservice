package ws01.ws;

import javax.jws.WebService;

/**
 * @Date:2021/09_7:44 下午
 * @Description： SEI的实现
 */
@WebService
public class HelloWSImpl implements HelloWS {

    @Override
    public String sayHello(String name) {
        System.out.println("server sayHello()" + name);
        return name;
    }
}
