import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void devuelve1enCadena(){
        FizzBuzz numCalcular = new FizzBuzz();
        String numACalcular = numCalcular.pedirNum(1);
        assertEquals("1",numACalcular);
    }
    @Test
    void devuelve2enCadena(){
        FizzBuzz numCalcular = new FizzBuzz();
        String numACalcular = numCalcular.pedirNum(2);
        assertEquals("2",numACalcular);
    }
    @Test
    void TesteoNum3(){
        FizzBuzz numCalular = new FizzBuzz();
        String numACalcular = numCalular.pedirNum(3);
        assertEquals("Fizz",numACalcular);
    }

    @Test
    void TesteoNum4_5(){
        FizzBuzz numCalular = new FizzBuzz();
        String numACalcular = numCalular.pedirNum(4);
        String numACalcularDos = numCalular.pedirNum(5);
        assertEquals("4",numACalcular);
        assertEquals("Buzz",numACalcularDos);
    }
    @Test
    void TesteoNum6(){
        FizzBuzz numCalular = new FizzBuzz();
        String numACalcular = numCalular.pedirNum(6);
        assertEquals("Fizz",numACalcular);
    }
    @Test
    void TesteoNum7_8y9(){
        FizzBuzz numCalular = new FizzBuzz();
        String numACalcular = numCalular.pedirNum(7);
        String numACalcularDos = numCalular.pedirNum(8);
        String numACalcularTres = numCalular.pedirNum(9);
        assertEquals("7",numACalcular);
        assertEquals("8",numACalcularDos);
        assertEquals("Fizz",numACalcularTres);
    }
    @Test
    void TesteoNum10(){
        FizzBuzz numCalular = new FizzBuzz();
        String numACalcular = numCalular.pedirNum(10);
        assertEquals("Buzz",numACalcular);
    }
    @Test
    void TesteoNum11_12_13y14(){
        //ARRANGE
        FizzBuzz numCalular = new FizzBuzz();
        //ACT
        String numACalcular = numCalular.pedirNum(11);
        String numACalcularDos = numCalular.pedirNum(12);
        String numACalcularTres = numCalular.pedirNum(13);
        String numACalcularCuatro = numCalular.pedirNum(14);
        //ASSERT
        assertEquals("11",numACalcular);
        assertEquals("Fizz",numACalcularDos);
        assertEquals("13",numACalcularTres);
        assertEquals("14",numACalcularCuatro);
    }
    @Test
    void TesteoNum15(){
        //ARRANGE
        FizzBuzz numCalcular = new FizzBuzz();
        //ACT
        String numACalcular = numCalcular.pedirNum(15);
        //ASSERT
        assertEquals("FizzBuzz",numACalcular);
    }

}