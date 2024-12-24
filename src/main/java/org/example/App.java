package org.example;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        List<String> foo = List.of("foo", "bar", "text", "lorem", "ipsum");
        List<String> strList = foo;
        strList.stream()
                .filter(s -> s.length() ==3)
                .forEach(App::businessLogicHere);
    }

    public static void businessLogicHere(String str) {
        System.out.println(str.toUpperCase());
    }
}
