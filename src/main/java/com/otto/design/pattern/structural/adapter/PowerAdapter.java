package com.otto.design.pattern.structural.adapter;

/**
 * program: design_pattern
 * description: PowerAdapter
 * *@author: gqchu
 * create: 2021-07-19 22:36
 **/
public class PowerAdapter implements DC5 {

    private AC220 ac220 = new AC220();

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();
        /** 变压器 */
        int adapterOutput = adapterInput / 44;
        System.out.println("通过PowerAdapter电源适配器输入AC"+adapterInput+"V"+"输出DC:"+adapterOutput+"V");
        return adapterOutput;
    }
}