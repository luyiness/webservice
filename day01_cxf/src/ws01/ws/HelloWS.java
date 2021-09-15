package ws01.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @Date:2021/09_8:12 上午
 * @Description： SEI
 */
@WebService
public interface HelloWS {

    @WebMethod
    public String sayHello(String name);
}
