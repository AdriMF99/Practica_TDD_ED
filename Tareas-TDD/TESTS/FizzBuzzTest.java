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

}