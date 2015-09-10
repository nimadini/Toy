import org.apache.commons.math3.complex.Complex;

/**
 * Created by stanley on 9/10/15.
 */
public class ComplexUtils {
    public double distance(Complex a, Complex b) {
        double rDist = a.getReal() - b.getReal();
        double iDist = a.getImaginary() - b.getImaginary();
        return Math.sqrt(Math.pow(rDist, 2) + Math.pow(iDist, 2));
    }
}
