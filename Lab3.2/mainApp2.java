package mainapp;
import java.util.ArrayList;
import java.util.List;

import quadraticRoot.QuadraticSolver;
 class MainApp {
    public static void main(String[] args) {
         QuadraticSolver solver=new QuadraticSolver();
        List<Double> coefficients = List.of(1.0, -5.0, 6.0);

        List<Double> roots = solver.apply(coefficients);

        System.out.println("Roots: " + roots);
    }
}
