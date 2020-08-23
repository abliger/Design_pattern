package design_pattern.poxry_model.static_poxry;

public class HZBJHuaWeiProxy implements PhoneSeller{
    private HuaWeiSeller huaWeiSeller;
    public HZBJHuaWeiProxy(HuaWeiSeller huaWeiSeller) {
        this.huaWeiSeller = huaWeiSeller;
    }
 
    @Override
    public boolean sell(String phoneType, int price) {
        System.out.println("尊敬的消费者，请边喝茶边看手机，不买也没关系。");
        if(!huaWeiSeller.sell(phoneType,price)){
            return false;
        }
        System.out.println("尊敬的消费者，手机已经帮您贴好膜了，再送您一个小米充电宝，欢迎下次再来光临！");
        return true;
    }
}