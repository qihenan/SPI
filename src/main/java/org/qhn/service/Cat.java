package
    org.qhn.service;

/**
 * @ClassName Cat
 * @Description TODO
 * @Author qihenan
 * @Date 2021/12/28 16:52
 **/
public class Cat implements Animal {
    @Override
    public void shout() {
        System.out.println("miaomiao");
    }
}