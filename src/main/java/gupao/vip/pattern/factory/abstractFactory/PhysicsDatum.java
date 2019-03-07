package gupao.vip.pattern.factory.abstractFactory;

public class PhysicsDatum implements Datum{
    @Override
    public void buy() {
        System.out.println("购买物理资料");
    }
}
