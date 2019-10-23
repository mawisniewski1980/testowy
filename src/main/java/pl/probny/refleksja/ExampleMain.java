package pl.probny.refleksja;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ExampleMain {



    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        ExampleObj exampleObj = new ExampleObj();
        ExampleObjTwo exampleObjTwo = new ExampleObjTwo();
        exampleObj.setSurrname("WISNIA !!!!");
        Method m1 = null;

        m1 = getMethod(checkIfMethodExists(exampleObj.getClass(), "surrname"));
        System.out.println((String) m1.invoke(exampleObj));
    }

    public static Optional<Method> checkIfMethodExists(Class cl, String field) {
        Method[] methods = cl.getMethods();

        Optional<Method> optionalMethod = Arrays.asList(methods)
                .stream()
                .filter(method1 -> method1.getName().startsWith("get"))
                .filter(method1 -> method1.getName().substring(3).equalsIgnoreCase(field))
                .findFirst();

    return optionalMethod;
    }

    public static Method getMethod(Optional<Method> m) {
        Method method = null;

        if(m.isPresent()) {
            method = m.get();
        }

        return method;
    }

}
