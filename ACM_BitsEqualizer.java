/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm_bitsequalizer;

import java.util.Scanner;

/**
 *
 * @author tongd
 */
public class ACM_BitsEqualizer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 1; i <= cases; i++) {
            String s = sc.next();
            String t = sc.next();
            int zeros = 0;
            int ones = 0;
            int qzeros = 0;
            int qones = 0;
            int steps = 0;
            for (int j = 0; j < s.length(); j++) {
                if(t.charAt(j) == '0') {
                    if(s.charAt(j) == '1') ones++;
                    else if(s.charAt(j) == '?')  qzeros++;
                }
                else {
                    if(s.charAt(j) == '0') zeros++;
                    else if(s.charAt(j) == '?') qones++;
                }
            }
            if(zeros > ones) {
                steps = zeros + qzeros + qones; 
            }
            else if ((ones > zeros && ones - zeros <= qones) || ones == zeros) {
                steps = ones + qzeros + qones;
            }
            else {
                steps = -1;
            }
            System.out.println("Case " + i + ": " + steps);
        }
    }   
}
