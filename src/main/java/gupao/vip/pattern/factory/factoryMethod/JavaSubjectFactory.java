package gupao.vip.pattern.factory.factoryMethod;

import gupao.vip.pattern.factory.JavaSubject;
import gupao.vip.pattern.factory.Subject;

public class JavaSubjectFactory implements SubjectMethodFactory{

    @Override
    public Subject acquire() {
        return new JavaSubject();
    }
}
