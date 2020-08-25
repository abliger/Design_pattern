package design_pattern.factory_pattern.two;

import org.junit.Test;

/**
 * @Description:
 * @Author abliger
 * @Date 2020/8/25 19:38
 */
public class FactroyByReflect {
    Shape getInstance(Three shape){
        String bkg="design_pattern.factory_pattern.two.";
        String name = bkg+shape.name();
        Object o = null;
        try {
            o = Class.forName(name).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (Shape) o;
    }
    @Test
    public void a(){
        Shape instance = new FactroyByReflect().getInstance(Three.Cricle);
        System.out.println(instance);
    }
}

enum Three{
    Cricle,Square,Triangle
}
interface Shape{
}
class Cricle implements Shape{

}
class Square implements Shape{
}
class Triangle implements Shape{
}
