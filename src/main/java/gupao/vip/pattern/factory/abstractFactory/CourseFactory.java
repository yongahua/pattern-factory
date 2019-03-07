package gupao.vip.pattern.factory.abstractFactory;

import gupao.vip.pattern.factory.JavaSubject;
import gupao.vip.pattern.factory.NatureSubject;
import gupao.vip.pattern.factory.PhysicsSubject;

public interface CourseFactory {

    Book acquireBook();

    Datum acquireDatum();
}
