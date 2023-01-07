package tests.day14_testNGFramework;

import org.testng.annotations.Test;

public class C02_DependsOnMethods {
    @Test()
    public void ilkTest(){
        System.out.println("ilk test çalisti");
    }

    @Test (dependsOnMethods = "ilkTest")
    public void ikinciTest(){
        System.out.println("ikinci test çalisti");
    }

    @Test (dependsOnMethods = "ikinciTest")
    public void ucuncuTest(){
        System.out.println("ucuncu test çalisti");
    }


}


