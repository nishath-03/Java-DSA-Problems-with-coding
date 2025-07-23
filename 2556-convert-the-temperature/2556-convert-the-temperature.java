class Solution {
    public double[] convertTemperature(double celsius) {
        double [] degs = new double[2];
        degs[0] = celsius + 273.15;
        degs[1] = celsius * 1.80 + 32.00;
        return degs;
    }
}