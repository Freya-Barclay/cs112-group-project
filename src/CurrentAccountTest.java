import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
//Freya Barclay

class CurrentAccountTest {

    CurrentAccount currentAccount = new CurrentAccount("Freya Barclay", "17873397", 200);

    public void setBalance(){
        currentAccount.setBalance(200);
    }

    @Test
    void overdrawAmountLow() {
        //testing low boundaries are correct
        int result = currentAccount.setOverdrawAmount(0);
        assertEquals(0, result);
    }

    @Test
    void overdrawAmountHigh() {
        //testing high boundaries are correct
        int result = currentAccount.setOverdrawAmount(300);
        assertEquals(300, result);
    }

    @Test
    void overdrawAmountMid() {
        //testing mid boundaries are correct
        int result = currentAccount.setOverdrawAmount(200);
        assertEquals(200, result);
    }

    @Test
    void overdrawAmountLowOut() {
        //testing low boundaries are correct with out of bound values
        int result = currentAccount.setOverdrawAmount(-200);
        assertEquals(0, result);
    }

    @Test
    void overdrawAmountHighOut() {
        //testing high boundaries are correct with out of bound values
        int result = currentAccount.setOverdrawAmount(400);
        assertEquals(300, result);
    }

    @Test
    void withdrawLow() {
        //testing low boundaries are correct
        boolean result = currentAccount.withdraw(1);
        assertEquals(true, result);
    }

    @Test
    void withdrawHigh() {
        //testing high boundaries are correct
        boolean result = currentAccount.withdraw(400);
        assertEquals(true, result);
    }

    @Test
    void withdrawMid() {
        //testing mid boundaries are correct
        boolean result = currentAccount.withdraw(200);
        assertEquals(true, result);
    }

    @Test
    void withdrawLowOut() {
        //testing low boundaries are correct with out of bound values
        boolean result = currentAccount.withdraw(-200);
        assertEquals(false, result);
    }

    @Test
    void withdrawHighOut() {
        //testing high boundaries are correct with out of bound values
        boolean result = currentAccount.withdraw(500);
        assertEquals(false, result);
    }

    @Test
    void withdrawZero() {
        //testing boundaries are correct with zero values
        boolean result = currentAccount.withdraw(0);
        assertEquals(true, result);
    }
}