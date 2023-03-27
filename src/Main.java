public class Main {
    public static void main(String[] args) {
        IRectanglesService rectanglesService = new RectanglesService();
        System.out.println("Simple input: (1,1), (1,3), (2,1), (2,3), (3,1), (3,3)");
        Point[] points1 = {new Point(1,1),
                new Point(1,3),
                new Point(2,1),
                new Point(2,3),
                new Point(3,1),
                new Point(3,3)};
        int count1 = rectanglesService.countRectangles(points1);
        System.out.println("Sample output: " + count1);

        System.out.println("Simple input: (1,1), (1,3), (2,1), (3,1), (3,3)");
        Point[] points2 = {new Point(1,1),
                new Point(1,3),
                new Point(2,1),
                new Point(3,1),
                new Point(3,3)};
        int count2 = rectanglesService.countRectangles(points2);
        System.out.println("Sample output: " + count2);

        System.out.println("Simple input: (0,1), (0,2), (1,1), (1,2), (2,1), (2,3), (3,1), (3,3)");
        Point[] points3 = {new Point(0,1),
                new Point(0,2),
                new Point(1,1),
                new Point(1,2),
                new Point(2,1),
                new Point(2,3),
                new Point(3,1),
                new Point(3,3)};
        int count3 = rectanglesService.countRectangles(points3);
        System.out.println("Sample output: " + count3);
    }
}
