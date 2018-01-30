package com.liangyuyi.dependenceIn.impl;

import com.liangyuyi.dependenceIn.IOutputGenerator;

/**
 * Created by liangyuyi on 2018/1/29
 */
public class CsvOutputGenerator implements IOutputGenerator {
    @Override
    public void generateOutput(){
        System.out.println("This is Csv output Generator");
    }
}
