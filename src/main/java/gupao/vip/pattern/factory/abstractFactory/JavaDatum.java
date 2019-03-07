package gupao.vip.pattern.factory.abstractFactory;

import javax.xml.transform.Source;

public class JavaDatum implements Datum {
    @Override
    public void buy() {
        System.out.println("购买Java资料");
    }
}
