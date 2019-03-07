package gupao.vip.pattern.factory.factoryMethod;

import gupao.vip.pattern.factory.NatureSubject;
import gupao.vip.pattern.factory.Subject;

public class NatureSubjectFactory implements SubjectMethodFactory{
    @Override
    public Subject acquire() {
        return new NatureSubject();
    }
}
