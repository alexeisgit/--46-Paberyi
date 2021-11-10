import org.junit.Test;

public class MainClass {

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
}
