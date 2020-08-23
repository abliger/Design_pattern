package design_pattern.poxry_model.dynamic_proxy;

import design_pattern.poxry_model.static_poxry.PhoneSeller;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PhoneSellerHandler implements InvocationHandler {
    private PhoneSeller phoneSeller;
    public PhoneSellerHandler(PhoneSeller phoneSeller) {
        this.phoneSeller = phoneSeller;
    }
 
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("尊敬的消费者，请边喝茶边看手机，不买也没关系。");
        if(!(Boolean) method.invoke(phoneSeller,args)){
            return false;
        }
        System.out.println("尊敬的消费者，手机已经帮您贴好膜了，再送您一个小米充电宝，欢迎下次再来光临！");
        return true;
    }
}