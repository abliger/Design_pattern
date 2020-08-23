package design_pattern.poxry_model.dynamic_proxy;

import design_pattern.poxry_model.static_poxry.HuaWeiSeller;
import design_pattern.poxry_model.static_poxry.PhoneSeller;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SellerMain {
 
    public static void main(String[] args){

        /*
        //创建invacationhandler接口的实现类完成方法回调
        PhoneSeller huaweiProxy = (PhoneSeller) Proxy.newProxyInstance(PhoneSeller.class.getClassLoader(),new Class[]{PhoneSeller.class},
                new PhoneSellerHandler(new HuaWeiSeller()));
        huaweiProxy.sell("HuaWei P30",3999);*/

        //使用匿名内部类实现代理
        PhoneSeller huaWeiSeller = new HuaWeiSeller();
        PhoneSeller phoneSeller=(PhoneSeller)Proxy.newProxyInstance(PhoneSeller.class.getClassLoader(), huaWeiSeller.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("尊敬的消费者，请边喝茶边看手机，不买也没关系。");
                        Object invoke = method.invoke(huaWeiSeller,args);
                        System.out.println("尊敬的消费者，手机已经帮您贴好膜了，再送您一个小米充电宝，欢迎下次再来光临！");
                        return invoke;
                    }
                });
        phoneSeller.sell("HuaWei P30",3999);
    }
}