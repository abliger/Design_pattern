package design_pattern.poxry_model.static_poxry_two;

/**
 * @Description:
 * @Author abliger
 * @Date 2020/8/22 8:39
 */
public abstract class PoxryTeach implements TeachDao {
    private TeachDao teachDao;

    public PoxryTeach(TeachDapImp teachDapImp) {
        teachDao=teachDapImp;
    }

    @Override
    public void teach() {
        teach(teachDao);
    }

    public abstract void teach(TeachDao teachDao); /*{
        System.out.println("开启代理");
        teachDao.teach();
        System.out.println("结束代理");
    }*/
}
