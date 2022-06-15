//package com.sapient.asde.service;
//
//import org.junit.jupiter.api.*;
//
//import static org.junit.jupiter.api.Assertions.*;
//
///**
// * The methods annotatated with @BeforeAll and @AfterAll have to be static methods
// */
//class HelloWorldTest {
//    private HelloWorld helloWorld;
//
//
//    @BeforeAll
//    static void beforeAll(){
//        System.out.println("Code in this method executes before all test methods");
//    }
//
//    @AfterAll
//    static void afterAll(){
//        System.out.println("Code in this method executes after all test methods");
//    }
//
//
//    //execute the code within this method before each test method
//    @BeforeEach
//    void setUp() {
//        helloWorld= new HelloWorld("Hello World");
//    }
//
//    //execute the code within this method after each test method
//    @AfterEach
//    void tearDown() {
//        helloWorld=null;
//    }
//
//    @DisplayName("Testing getGreeting() for valid data")
//    @Test
//    void getGreetingForValidData() {
//        assertEquals("Hello World",helloWorld.getGreeting());
//    }
//
//    @Test
//    void getGreetingForInvalidData() {
//        assertNotEquals("Hello World!",helloWorld.getGreeting());
//    }
//
//    @Test
//    void setGreetingForValidInput() {
//        helloWorld.setGreeting("How are you?");
//        assertEquals("How are you?",helloWorld.getGreeting());
//    }
//
//    @Test
//    void setGreetingForInvalidInput() {
//        helloWorld.setGreeting("How are you");
//        assertNotEquals("How are you?",helloWorld.getGreeting());
//    }
//
//    @Test
//    void getToStringForValidOutput(){
//        assertEquals("HelloWorld{greeting='Hello World'}", helloWorld.toString());
//    }
//
//    @Test
//    void  checkForValidDefaultConstructor(){
//        HelloWorld helloWorld1= new HelloWorld();
//        assertNull(helloWorld1.getGreeting());
//    }
//}













package com.sapient.asde.service;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The methods annotatated with @BeforeAll and @AfterAll have to be static methods
 */
public class HelloWorldTest {
    private HelloWorld helloWorld;


    @BeforeAll
    static void beforeAll(){
        System.out.println("Code in this method executes before all test methods");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Code in this method executes after all test methods");
    }


    //execute the code within this method before each test method
    @BeforeEach
    void setUp() {
        helloWorld= new HelloWorld("Hello World");
    }

    //execute the code within this method after each test method
    @AfterEach
    void tearDown() {
        helloWorld=null;
    }

    @DisplayName("Testing getGreeting() for valid data")
    @Test
    void getGreetingForValidData() {
        assertEquals("Hello World",helloWorld.getGreeting());
    }

    @Test
    void getGreetingForInvalidData() {
        assertNotEquals("Hello World!",helloWorld.getGreeting());
    }

    @Test
    void setGreetingForValidInput() {
        helloWorld.setGreeting("How are you?");
        assertEquals("How are you?",helloWorld.getGreeting());
    }

}
