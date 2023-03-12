public class FizzBuzz {
    public String pedirNum(int num){
        String num2 = "";
        if (num%3 == 0){
            return "Fizz";
        } else if (num%5 == 0) {
            return "Buzz";
        } else{
            return num2 + num;
        }
    }
}
