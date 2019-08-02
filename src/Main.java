public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(2,3);
        System.out.println(point2D);

        System.out.println("---------------");

        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(3.2f,3.4f,4.5f);
        System.out.println(point3D);
    }
}
