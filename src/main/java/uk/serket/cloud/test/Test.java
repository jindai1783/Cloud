package uk.serket.cloud.test;

import uk.serket.cloud.bean.User;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by daijin on 17/05/2015.
 */
public class Test {

    public static void main(String[] args) throws ClassNotFoundException, IntrospectionException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class pot = Class.forName("uk.serket.cloud.bean.User");
        PropertyDescriptor pd = new PropertyDescriptor("name", pot);
        Method method = pd.getWriteMethod();
        Object obj = pot.newInstance();
        method.invoke(obj, "hello");
        User user = (User) obj;
        System.out.println(user.getName());
    }

}
