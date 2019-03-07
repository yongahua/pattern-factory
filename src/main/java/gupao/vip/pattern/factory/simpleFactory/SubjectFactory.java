package gupao.vip.pattern.factory.simpleFactory;

import gupao.vip.pattern.factory.JavaSubject;
import gupao.vip.pattern.factory.NatureSubject;
import gupao.vip.pattern.factory.PhysicsSubject;
import gupao.vip.pattern.factory.Subject;

public class SubjectFactory {

    //public Subject acquire(String name){
    //    if("java".equals(name)){
    //        return new JavaSubject();
    //    }else if("自然".equals(name)){
    //        return new NatureSubject();
    //    }else if("物理".equals(name)){
    //        return new PhysicsSubject();
    //    }else {
    //        return null;
    //    }
    //}

    //public Subject acquire(String className){
    //    try {
    //        if (!(null == className || "".equals(className))) {
    //            return (Subject) Class.forName(className).newInstance();
    //        }
    //
    //    }catch (Exception e){
    //        e.printStackTrace();
    //    }
    //    return null;
    //}

    public Subject acquire(Class<? extends Subject> clazz){
        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
