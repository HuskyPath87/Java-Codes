public class GreatCircle {
    public static void main(String[] args) {
        double X1 = Double.parseDouble(args[0]);
        double Y1 = Double.parseDouble(args[1]);
        double X2 = Double.parseDouble(args[2]);
        double Y2 = Double.parseDouble(args[3]);
        int r = 6371;
        double X1R = Math.toRadians(X1);
        double Y1R = Math.toRadians(Y1);
        double X2R = Math.toRadians(X2);
        double Y2R = Math.toRadians(Y2);
        double X2X1 = (X2R - X1R) / 2;
        double Y2Y1 = (Y2R - Y1R) / 2;
        double sin1 = Math.sin(X2X1);
        double sin2 = Math.sin(Y2Y1);
        double distance = r * 2 * Math.asin(Math.sqrt(Math.pow(sin1, 2.0) + (Math.cos(X1R) * Math.cos(X2R) * Math.pow(sin2, 2.0))));
        System.out.println(distance + " kilometers");
    }
}
