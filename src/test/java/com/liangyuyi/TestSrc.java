package com.liangyuyi;

import com.liangyuyi.junitTest.StringTest;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by liangyuyi on 2018/2/8
 */

public class TestSrc {

    StringTest stringTest = new StringTest();
    String[] bag1 = { "Books", "Notebooks", "Pens" };
    String[] bag2 = { "Books", "Notebooks", "Pens", "Pencils" };

    @Test
    public void test1(){
        System.out.println("test1");
        assertArrayEquals(bag1, stringTest.prepareMyBag());
    }

    @Ignore
    @Test
    public void test2(){
        System.out.println("test2");
        assertArrayEquals(bag2, stringTest.addPencils());
    }
}
