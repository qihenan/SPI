package org.qhn.demo;

import java.util.Iterator;
import java.util.ServiceLoader;

import org.qhn.service.Animal;

/**
 * @ClassName TestService
 * @Description
 * @Author qihenan
 * @Date 2021/12/28 16:54
 **/
public class TestService {

    public static void main(String[] args) {
        ServiceLoader<Animal> loader = ServiceLoader.load(Animal.class);
        Iterator<Animal> iterator = loader.iterator();
        while (iterator.hasNext()){
            iterator.next().shout();
        }
    }
}