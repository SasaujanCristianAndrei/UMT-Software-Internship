import java.util.Objects;

public class Point {
    private int xAxis;
    private int yAxis;

    public Point(int xAxis, int yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public int getxAxis() {
        return xAxis;
    }

    public void setxAxis(int xAxis) {
        this.xAxis = xAxis;
    }

    public int getyAxis() {
        return yAxis;
    }

    public void setyAxis(int yAxis) {
        this.yAxis = yAxis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return xAxis == point.xAxis && yAxis == point.yAxis;
    }
    @Override
    public int hashCode() {
        return Objects.hash(xAxis, yAxis);
    }
}

