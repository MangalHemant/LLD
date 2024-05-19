public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ShapeFactory shapefactory=new ShapeFactory();
        Shape shape=shapefactory.getShape("Rectangle");
        shape.draw();
    }
}
