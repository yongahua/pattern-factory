package gupao.vip.pattern.factory.abstractFactory;

public class JavaBook implements Book{
    @Override
    public void acquire() {
        System.out.println("获取Java书本");
    }
}
