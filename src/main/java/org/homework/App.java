package org.homework;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    private static List<Person> personList;
    public static void main( String[] args )
    {
        Person josh = new Person("Josh","Anderson",44);
        Gson gson = new Gson();
        String json = gson.toJson(josh);
        System.out.println("Сериализованный объект: " + json);

        Person deserializedJosh = gson.fromJson(json,Person.class);
        System.out.println("Десериализованный объект:" + deserializedJosh);



    }
}
