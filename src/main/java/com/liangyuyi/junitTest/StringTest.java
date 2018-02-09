package com.liangyuyi.junitTest;

import java.util.Arrays;

/**
 * Created by liangyuyi on 2018/2/8
 */
public class StringTest {
    public String[] prepareMyBag() {
        String[] schoolbag = { "Books", "Notebooks", "Pens" };
        System.out.println("My school bag contains: "
                + Arrays.toString(schoolbag));
        return schoolbag;
    }

    public String[] addPencils() {
        String[] schoolbag = { "Books", "Notebooks", "Pens", "Pencils" };
        System.out.println("Now my school bag contains: "
                + Arrays.toString(schoolbag));
        return schoolbag;
    }
}
