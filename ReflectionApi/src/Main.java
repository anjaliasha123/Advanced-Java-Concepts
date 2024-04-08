import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Cat cat = new Cat("John");
        Class catClass = cat.getClass();
        //Reflection of class
        //Information about the class
        System.out.println("Name: "+catClass.getName());
        System.out.println("Modifier: "+catClass.getModifiers());
        System.out.println("Modifier: "+   Modifier.toString(catClass.getModifiers()));
        System.out.println("Superclass: "+ catClass.getSuperclass().getName());
        //Accessing member methods
        Method[] methods = catClass.getDeclaredMethods();
        for(Method method: methods){
            System.out.println("Method name: "+method.getName()+" Access Modifier: "+ Modifier.toString(method.getModifiers()));
        }
        for(Method method: methods){
            method.setAccessible(true);
            if(method.getName().equals("displayData")){
                method.invoke(cat, "hello");
            }
            if(method.getName().equals("displayStaticMethod")){
                method.invoke(cat, null);
            }
        }
        catClass.getDeclaredMethod("sayMeow").invoke(cat, null);
        //Accessing member fields
        Field[] fields = catClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field name: "+field.getName());
            field.setAccessible(true);
            System.out.println("Before value: "+field.get(cat));
            field.set(cat, "Jimmy");
            System.out.println("After value: "+field.get(cat));
        }
        //Accessing the constructors
        Constructor[] declaredConstructors = catClass.getDeclaredConstructors();
        for(Constructor constructor: declaredConstructors){
            System.out.println("Name: "+constructor.getName());
            System.out.println("Modifier: "+Modifier.toString(constructor.getModifiers()));
            System.out.println("Parameter count: "+constructor.getParameterCount());
        }
    }
}