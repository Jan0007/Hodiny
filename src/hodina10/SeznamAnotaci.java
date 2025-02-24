package hodina10;

import Hodina7.MainVlakno;
import Hodina8.MyMin;
import Hodina8.MyMinTest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class SeznamAnotaci {
    public static void main(String[] args) {
        MyMinTest s = new MyMinTest();
        Class<?> c = s.getClass();

        System.out.println(c.getName());

        Method[] m = c.getMethods();

        var arr = c.getAnnotations();
        System.out.println(arr.length);

        for (Method method: m) {
            Annotation[] a = method.getAnnotations();
            System.out.println("Metoda: " + method.getName());
            for (Annotation annotation: a) {
                System.out.println("Annotace: " + annotation);
            }
        }
    }
}
