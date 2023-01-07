package tests.day14_testNGFramework;

import org.testng.annotations.Test;

public class C01_TestNGIlkTest {

    /*
    TestNG test methodlarını isim sırasına gore çalistirir
    priority degeri verilen methodlar kucukten buyuge dogru calışır
    eşit olan priority degerlerinde harf sırasına bakar
    prio degeri verilmezse 0 kabul edilir
    */

    @Test (priority = 6)
    public void ilkTest(){
        System.out.println("ilk test çalisti");
    }

    @Test (priority = 9)
    public void ikinciTest(){
        System.out.println("ikinci test çalisti");
    }

    @Test (priority = 10)
    public void ucuncuTest(){
        System.out.println("ucuncu test çalisti");
    }


}
