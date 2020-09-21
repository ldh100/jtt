/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;
import java.util.Arrays;
/**
 *
 * @author Oleg.Spozito
 */
public class tools {
    public static double p90(double[] l){
        if (l.length < 2) {
            return Math.round(l[0]);
        }
        Arrays.sort(l); 
        double position = (double)(l.length + 1) * 90 / 100.0;
        double leftNumber, rightNumber;
        double n = 90 / 100.0d * (l.length - 1) + 1.0d;
        if (position >= 1) {
            leftNumber = l[(int)Math.floor(n) - 1]; rightNumber = l[(int)Math.floor(n)];
        } else {
            leftNumber = l[0]; rightNumber = l[1];
        }// first data
        if (leftNumber == rightNumber) {
            return Math.round(leftNumber);
        } else {
            double part = n - Math.floor(n); return Math.round(leftNumber + part * (rightNumber - leftNumber));
        }
    }
    public static double p50(double[] l){
        if (l.length < 2) {
            return Math.round(l[0]);
        }
        Arrays.sort(l); 
        double position = (double)(l.length + 1) * 50 / 100.0;
        double leftNumber, rightNumber;
        double n = 50 / 100.0d * (l.length - 1) + 1.0d;
        if (position >= 1) {
            leftNumber = l[(int)Math.floor(n) - 1]; rightNumber = l[(int)Math.floor(n)];
        } else {
            leftNumber = l[0]; rightNumber = l[1];
        }// first data
        if (leftNumber == rightNumber) {
            return Math.round(leftNumber);
        } else {
            double part = n - Math.floor(n); return Math.round(leftNumber + part * (rightNumber - leftNumber));
        }
    }
}
