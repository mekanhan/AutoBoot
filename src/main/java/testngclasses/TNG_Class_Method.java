package main.java.testngclasses;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TNG_Class_Method {   //TNG Executes Tests in alphabetical order

    @BeforeClass    // similar to @BeforeAll in junit
    public void setUP(){
        System.out.println("Class1 - @BeforeClass method");
    }

    @AfterClass// similar to @AfterAll in junit
    public void TearDown(){
        System.out.println("Class1 - @AfterClass method");
    }

    @BeforeClass // similar to @BeforeEach in junit
    public void init(){
        System.out.println("Class1 - @BeforeMethod method");
    }

    @AfterClass // similar to @AfterEach in junit
    public void quit(){
        System.out.println("Class1 - @AfterMethod method");
    }

    @Test
    public void test1(){
        System.out.println("Class1 - @Test1 method");

    }
    @Test
    public void test2() {
        System.out.println("Class1 - @Test2 method");
    }

    @Test
    public void test3() {
        System.out.println("Class1 - @Test3 method");
    }
}

