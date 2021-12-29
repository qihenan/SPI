package org.qhn.service;

/**
 * @ClassName Dog
 * @Description TODO
 * @Author qihenan
 * @Date 2021/12/28 16:52
 **/
public class Dog implements Animal {
    @Override
    public void shout() {
        System.out.println("wangwang");
    }
}