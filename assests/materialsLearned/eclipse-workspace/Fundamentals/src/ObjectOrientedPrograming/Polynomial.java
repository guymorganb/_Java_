



package ObjectOrientedPrograming;

import java.util.*;

public class Polynomial {

    private Map<Integer, Integer> terms = new TreeMap<>();

    public void setCoefficient(int degree, int coeff) {
        terms.put(degree, coeff);
    }

    public Polynomial add(Polynomial p) {
        Polynomial result = new Polynomial();

        for (Integer degree : this.terms.keySet()) {
            result.setCoefficient(degree, this.terms.get(degree));
        }

        for (Integer degree : p.terms.keySet()) {
            result.setCoefficient(degree, result.terms.getOrDefault(degree, 0) + p.terms.get(degree));
        }

        return result;
    }

    public Polynomial subtract(Polynomial p) {
        Polynomial result = new Polynomial();

        for (Integer degree : this.terms.keySet()) {
            result.setCoefficient(degree, this.terms.get(degree));
        }

        for (Integer degree : p.terms.keySet()) {
            result.setCoefficient(degree, result.terms.getOrDefault(degree, 0) - p.terms.get(degree));
        }

        return result;
    }

    public Polynomial multiply(Polynomial p) {
        Polynomial result = new Polynomial();

        for (Integer degree1 : this.terms.keySet()) {
            for (Integer degree2 : p.terms.keySet()) {
                int newDegree = degree1 + degree2;
                int newCoeff = this.terms.get(degree1) * p.terms.get(degree2);

                result.setCoefficient(newDegree, result.terms.getOrDefault(newDegree, 0) + newCoeff);
            }
        }

        return result;
    }

    public void print() {
        StringBuilder sb = new StringBuilder();

        for (Integer degree : terms.keySet()) {
            int coeff = terms.get(degree);

            if (coeff != 0) {
                sb.append(coeff + "x" + degree + " ");
            }
        }

        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);  // remove the last space
        }

        System.out.println(sb.toString());
    }
}

