package gupao.vip.pattern.factory.abstractFactory;

public class NatureBook implements Book{
    @Override
    public void acquire() {
        System.out.println("获取自然书本");
    }
}
