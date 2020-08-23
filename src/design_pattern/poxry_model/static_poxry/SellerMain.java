package design_pattern.poxry_model.static_poxry;

public class SellerMain {
    public static void main(String[] args){
        HZBJHuaWeiProxy hzbjHuaWeiProxy = new HZBJHuaWeiProxy(new HuaWeiSeller());
        hzbjHuaWeiProxy.sell("HuaWei Meta20 pro",5999);
    }
}