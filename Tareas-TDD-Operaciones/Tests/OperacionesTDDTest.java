import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class OperacionesTDDTest {

    @Test
    void TestSuma__Devuelve0(){
        //ARRANGE
        OperacionesTDD num = new OperacionesTDD();
        //ACT
        int calcular = num.suma("");
        //ASSERT
        assertEquals(0,calcular);
    }
    @Test
    void TestSuma_1_Devuelve1(){
        //ARRANGE
        OperacionesTDD num = new OperacionesTDD();
        //ACT
        int calcular = num.suma("1");
        //ASSERT
        assertEquals(1,calcular);
    }
    @Test
    void TestSuma_1_2_Devuelve3(){
        //ARRANGE
        OperacionesTDD num = new OperacionesTDD();
        //ACT
        int calcular = num.suma("1,2");
        //ASSERT
        assertEquals(3,calcular);
    }
    @Test
    void TestSuma_1_1_2_Devuelve4(){
        //ARRANGE
        OperacionesTDD num = new OperacionesTDD();
        //ACT
        int calcular = num.suma("1,1,2");
        //ASSERT
        assertEquals(4,calcular);
    }
    @Test
    void TestSuma_1_2__Devuelvemenos1(){
        //ARRANGE
        OperacionesTDD num = new OperacionesTDD();
        //ACT
        int calcular = num.suma("1,2,");
        //ASSERT
        assertEquals(-1,calcular);
    }
    @Test
    void TestSuma_1_2_Menos2_DevuelveMenos1(){
        //ARRANGE
        OperacionesTDD num = new OperacionesTDD();
        //ACT
        int calcular = num.suma("1,2,-2");
        //ASSERT
        assertEquals(-1,calcular);
    }
    @Test
    void TestSuma_5_1002_Devuelve5_NumeroIgnorado(){
        //ARRANGE
        OperacionesTDD num = new OperacionesTDD();
        //ACT
        int calcular = num.suma("5,1002");
        //ASSERT
        assertEquals(5,calcular);
    }

}