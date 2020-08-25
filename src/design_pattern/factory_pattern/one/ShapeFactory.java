//package design_pattern.factory_pattern.one;
//
///**
// * @Description:
// * @Author abliger
// * @Date 2020/8/25 19:15
// */
//public enum ShapeFactory {
//    CRICLE(new design_pattern.factory_pattern.two.Cricle(),"CRICLE"),
//    triangle(new design_pattern.factory_pattern.two.Triangle(),"TRIANGLE"),
//    square(new design_pattern.factory_pattern.two.Square(),"SQUARE");
//
//    public static design_pattern.factory_pattern.two.Shape getShape(String name){
//        for (ShapeFactory value : ShapeFactory.values()) {
//            if(value.name.equals(name)){
//                return value.shape;
//            }
//        }
//        return null;
//    }
//    private design_pattern.factory_pattern.two.Shape shape;
//    private String name;
//
//    private ShapeFactory(design_pattern.factory_pattern.two.Shape shape, String name) {
//        this.shape = shape;
//        this.name = name;
//    }
//
//    public design_pattern.factory_pattern.two.Shape getShape() {
//        return shape;
//    }
//
//    public void setShape(design_pattern.factory_pattern.two.Shape shape) {
//        this.shape = shape;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
//class user{
//    public static void main(String[] args) {
//        design_pattern.factory_pattern.two.Shape cricle = ShapeFactory.getShape("CRICLE");
//        System.out.println(cricle);
//    }
//}
////我们有一个跟接口
//interface Shape{
//
//}
//class Cricle implements design_pattern.factory_pattern.two.Shape {
//
//}
//class Square implements design_pattern.factory_pattern.two.Shape {
//}
//class Triangle implements design_pattern.factory_pattern.two.Shape {
//}