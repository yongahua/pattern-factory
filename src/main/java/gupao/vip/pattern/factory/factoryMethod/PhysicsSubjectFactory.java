package gupao.vip.pattern.factory.factoryMethod;

import gupao.vip.pattern.factory.PhysicsSubject;
import gupao.vip.pattern.factory.Subject;

public class PhysicsSubjectFactory implements SubjectMethodFactory{
    @Override
    public Subject acquire() {
        return new PhysicsSubject();
    }
}
