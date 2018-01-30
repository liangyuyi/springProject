package com.liangyuyi.dependenceIn;

/**
 * Created by liangyuyi on 2018/1/29
 */
public class OutputHelper {
    private IOutputGenerator outputGenerator;

    public void generatorOutput(){
        outputGenerator.generateOutput();
    }

    //依赖注入的setter方法
    public void setOutputGenerator(IOutputGenerator outputGenerator){
        this.outputGenerator = outputGenerator;
    }
}
