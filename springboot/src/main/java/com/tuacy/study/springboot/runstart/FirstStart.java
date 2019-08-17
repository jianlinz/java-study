package com.tuacy.study.springboot.runstart;

import com.tuacy.study.springboot.scanrunstart.IRunStart;
import com.tuacy.study.springboot.scanrunstart.RunStart;

/**
 * @name: FirstStart
 * @author: tuacy.
 * @date: 2019/8/16.
 * @version: 1.0
 * @Description:
 */
@RunStart(des = "第一个启动")
public class FirstStart implements IRunStart {

    @Override
    public void start(String des) {
        System.out.println("我启动了哈 " + des);
    }
}