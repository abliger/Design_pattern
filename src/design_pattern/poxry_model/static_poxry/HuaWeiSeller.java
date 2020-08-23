package design_pattern.poxry_model.static_poxry;

public class HuaWeiSeller implements PhoneSeller{
    @Override
    public boolean sell(String phoneType, int price) {
        if(!phoneType.startsWith("HuaWei") && !phoneType.startsWith("Honor")){
            System.out.println("对不起，本店没有您想要买的手机型号，请去隔壁小米或者OV专卖店购买");
            return false;
        }
        if(price <= 1000){
            System.out.println("对不起，本店不卖廉价手机");
            return false;
        }
        System.out.println("感谢您购买" + phoneType + "型号手机，一共收您" + price + "元！");
        return true;
    }
}