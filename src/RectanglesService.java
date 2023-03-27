import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RectanglesService implements IRectanglesService {
    @Override
    public int countRectangles(Point[] points) {
        int count = 0;
        Set<Point> pointSet = new HashSet<>(Arrays.asList(points));
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                Point p1 = points[i];
                Point p2 = points[j];
                if (p1.getxAxis() != p2.getxAxis() && p1.getyAxis() != p2.getyAxis()) {
                    Point p3 = new Point(p1.getxAxis(), p2.getyAxis());
                    Point p4 = new Point(p2.getxAxis(), p1.getyAxis());
                    if (pointSet.contains(p3) && pointSet.contains(p4)) {
                        count++;
                    }
                }
            }
        }
        return count / 2; // each rectangle is counted twice
    }
}
