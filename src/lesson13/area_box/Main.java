package lesson13.area_box;

public class Main {
    public static void main(String[] args) {
        Box3D box3d = new Box3D(5, 3, 2);

        System.out.println(box3d.get3DInfo());
        System.out.println(box3d.get3DArea());

    }
}
