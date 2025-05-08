package lab15.sict.must.edu.mn;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Division {
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot get zero");
        }
        double result = a / b;
        return BigDecimal.valueOf(result)
                         .setScale(2, RoundingMode.HALF_UP)
                         .doubleValue();git tag v1.0.1
    }
}
