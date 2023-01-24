package balan.artem;

public class TriangleLargestArea {
    public static double findLargestTriangleArea(int[][] points)
    {
        int n = points.length;
        double max = 0;
        for(int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                for(int k = j + 1; k < n; k++){
                    double area = getArea(points[i], points[j], points[k]);
                    if(area > max)
                        max = area;
                }

        return max;
    }

    private static double getArea(int[] p0, int[] p1, int[] p2) {
        int v1x = p1[0] - p0[0];
        int v1y = p1[1] - p0[1];
        int v2x = p2[0] - p0[0];
        int v2y = p2[1] - p0[1];
        return Math.abs(v1x * v2y - v1y * v2x) / 2.0;
    }

    public static void main(String[] args) {
        int [][] points = { {0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0} };
        System.out.println(findLargestTriangleArea(points));
    }
}
