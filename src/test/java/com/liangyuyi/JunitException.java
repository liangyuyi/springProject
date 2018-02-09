package com.liangyuyi;

import org.junit.Test;

/**
 * Created by liangyuyi on 2018/2/9
 */
public class JunitException {
    @Test(expected = ArithmeticException.class)
    public void divisionWithException(){
        int i = 1/0;
        System.out.println("after exception");//不会输出
    }
}
