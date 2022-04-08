/*




 */

package Phone;

public class Phone {
    //成员变量：默认权限，在同一个包当中可以访问
    String brand;
    int price;


    //成员方法：
    public void Call(){
        System.out.println("Call");
    }

    public void sendMessage(){
        System.out.println("Send a message");
    }

}
