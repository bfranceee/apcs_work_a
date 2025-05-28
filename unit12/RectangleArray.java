public class RectangleArray {
    public static double averagePerimeter(Rectangle[][] rectangles) {
        double totalPerimeter = 0;
        int count = 0;
        for (Rectangle[] row : rectangles) {
            for (Rectangle rectangle : row) {
                totalPerimeter += rectangle.calculatePerimeter();
                count++;
            }
        }
        if (count == 0) {
            return 0;
        } else {
            return totalPerimeter / count;
        }
    }

    public static Rectangle biggestArea(Rectangle[][] rectangles) {
        if (rectangles.length == 0 || rectangles[0].length == 0) {
            return null;
        }
        Rectangle biggestArea = rectangles[0][0];
        for (int i = 0; i < rectangles.length; i++) {
            for (int j = 0; j < rectangles[i].length; j++) {
                if (rectangles[i][j].calculateArea() > biggestArea.calculateArea()) {
                    biggestArea = rectangles[i][j];
                }
            }
        }
        return biggestArea;
    }
}