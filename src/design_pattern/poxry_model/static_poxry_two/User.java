package design_pattern.poxry_model.static_poxry_two;

/**
 * @Description:
 * @Author abliger
 * @Date 2020/8/23 11:59
 */
public class User {
    public static void main(String[] args) {
        TeachDapImp teachDapImp = new TeachDapImp();
        new PoxryTeach(teachDapImp){
            @Override
            public void teach(TeachDao teachDao) {
                System.out.println("开启代理");
                teachDao.teach();
                System.out.println("结束代理");
            }
        }.teach();
    }
}
