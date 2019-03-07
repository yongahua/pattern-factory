package gupao.vip.pattern.factory.abstractFactory;

public class NatureDatum implements Datum{
    @Override
    public void buy() {
        System.out.println("购买自然资料");
    }
}
