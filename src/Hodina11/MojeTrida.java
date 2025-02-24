package Hodina11;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@Autor(jmeno = "Pepa z Depa")
public class MojeTrida {

    @Zpracuj
    public void metoda1() {
        System.out.println("Zpracovávám metodu 1");
    }

    @Zpracuj()
    public void metoda2() {
        System.out.println("Zpracovávám metodu 2");
    }

    public void metoda3() {
        System.out.println("Metoda 3 není označena anotací");
    }

    public static void main(String[] args) {
        MojeTrida s = new MojeTrida();
        Class<?> c = s.getClass();

        System.out.println(c.getName());

        Method[] m = c.getMethods();

        var arr = c.getAnnotations();
        System.out.println(arr.length);

        for (Method method: m) {
            Annotation[] a = method.getAnnotations();
            if (a.length != 0 ) {
                System.out.println("Metoda: " + method.getName());
                for (Annotation annotation: a) {
                    System.out.println("Annotace: " + annotation);
                }
            }
        }
    }
}

