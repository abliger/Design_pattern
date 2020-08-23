package design_pattern.poxry_model.static_poxry_two;

/**
 * @Description:
 * @Author abliger
 * @Date 2020/8/22 8:38
 */
public class TeachDapImp implements TeachDao {
    @Override
    public void teach() {
        System.out.println("被代理的实例");
    }
}
