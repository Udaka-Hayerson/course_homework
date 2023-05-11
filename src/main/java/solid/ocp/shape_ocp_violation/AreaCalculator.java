package solid.ocp.shape_ocp_violation;

public class AreaCalculator {

    public double areaCalc(Object... shapes){
        double area = 0.0;
        for (var s : shapes) {
            if(s instanceof Rectangle){
                area += ((Rectangle) s).getWidth() * ((Rectangle) s).getHeight();
            } else {
                area += Math.pow(((Circle)s).getRadius(), 2) * Math.PI;
            }
        }
        return area;
    }

}
