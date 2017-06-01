/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler48java;

import java.math.BigInteger;

/**
 *
 * @author gabriel
 */
public class SelfPowers {
    
    final int w = 1000;
    BigInteger alpha = new BigInteger(Integer.toString(w));
    BigInteger temp = new BigInteger(Integer.toString(w));
    BigInteger sum = new BigInteger("0");
    SelfPowers(){
        alphaAlpha();
        sum();
        System.out.println(sum.add(alpha));
    }
    
    public void alphaAlpha(){
        alpha = alpha.pow(w);
    }

    public void sum(){
        for(int i = 1; i < w; ++i){
            temp = new BigInteger(Integer.toString(i));
            temp = temp.pow(i);
            sum = sum.add(temp);
        }
    }
    
}
