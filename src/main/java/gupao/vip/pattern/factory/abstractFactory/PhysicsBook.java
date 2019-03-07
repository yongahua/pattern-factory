package gupao.vip.pattern.factory.abstractFactory;

public class PhysicsBook implements Book{
    @Override
    public void acquire() {
        System.out.println("获取物理书籍");
    }
}
