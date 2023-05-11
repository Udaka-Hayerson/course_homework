package solid.ocp.shape_ocp_conformity;

import java.math.BigDecimal;

public class AreaCalculator {
    public static BigDecimal sumArea(Shape[] shapes){
        BigDecimal sum_area = new BigDecimal(0);
        for (Shape shape : shapes) {
            sum_area = sum_area.add(BigDecimal.valueOf(shape.area()));
        }
        return sum_area;
    }
}
