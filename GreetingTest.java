package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.RepeatedTest;

public class GreetingTest {
    @RepeatedTest(5)
    public void testSayHello(){
        Greeting greeting = new Greeting();
        assertEquals("Hello",greeting.sayHello() );
    }
}
