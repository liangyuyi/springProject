package com.liangyuyi;

import org.junit.Test;

/**
 * Created by liangyuyi on 2018/2/9
 */
public class JunitTimeout {
    @Test (timeout = 1000)
    public void infinity(){
        while (true);
    }
}
