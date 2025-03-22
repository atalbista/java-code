//4.3(Geography: estimate areas) Find the GPS locations for Atlanta, Georgia;
//Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina from
//www.gps-data-team.com/map/ and compute the estimated area enclosed by these
//four cities. (Hint: Use the formula in Programming Exercise  4.2 to compute the
//distance between two cities. Divide the polygon into two triangles and use the
//formula in Programming Exercise  2.19 to compute the area of a triangle.)


import java.util.Scanner;

public class EstimateArea {

    public static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        final double RADIUS = 6371.01;
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);
        return RADIUS * Math.acos(Math.sin(lat1) * Math.sin(lat2)
                + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
    }

    public static double calculateTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {

        double[] atlanta = {33.7490, -84.3880};
        double[] orlando = {28.5383, -81.3792};
        double[] savannah = {32.0809, -81.0912};
        double[] charlotte = {35.2271, -80.8431};


        double atlantaOrlando = calculateDistance(atlanta[0], atlanta[1], orlando[0], orlando[1]);
        double orlandoSavannah = calculateDistance(orlando[0], orlando[1], savannah[0], savannah[1]);
        double savannahAtlanta = calculateDistance(savannah[0], savannah[1], atlanta[0], atlanta[1]);
        double savannahCharlotte = calculateDistance(savannah[0], savannah[1], charlotte[0], charlotte[1]);
        double charlotteAtlanta = calculateDistance(charlotte[0], charlotte[1], atlanta[0], atlanta[1]);


        double area1 = calculateTriangleArea(atlantaOrlando, orlandoSavannah, savannahAtlanta);
        double area2 = calculateTriangleArea(savannahAtlanta, savannahCharlotte, charlotteAtlanta);

        double totalArea = area1 + area2;

        System.out.printf("The estimated area enclosed by the four cities is %.2f square kilometers.%n", totalArea);




    }
}
