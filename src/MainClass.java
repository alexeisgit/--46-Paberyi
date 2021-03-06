import org.junit.Assert;
import org.junit.Test;

public class MainClass {

    private String class_string = "Hello, world";
    public String getClassString()
    {
        return class_string;
    }

    private int class_number = 20;
    public int getClassNumber()
    {
        return class_number;
    }

    @Test
    public void testGetLocalNumber()
    {
        int a = getLocalNumber();
        if
            (a == 14){
            System.out.println("Test passed");
        } else {
            System.out.println("Test Failed");
        }
    }

    public int getLocalNumber() {
        return 14;
    }

    @Test
    public void testGetClassNumber()
    {
        int a = getClassNumber();
        if (a > 45) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed, number is less or equal 45 ");
            //Assert.fail("Test Failed, number is less or equal 45");
        }
    }

    @Test
    public void testGetClassString()
    {
        String a = getClassString();
        if (a.contains("Hello")) {
            System.out.println("Test passed");

        } else if (a.contains("hello")){
            System.out.println("Test passed");

        } else {
            System.out.println("Test Failed: string not found");

        }
    }
}


