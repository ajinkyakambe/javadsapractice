public class CountDigits {

    // Given a number N, the task is to return the count of digits in this number.

    // Brute force approach

    public void count(String number){
        int count = 0;
        for (int i=0; i<number.length();i++){
            count++;
        }
        System.out.println(count);
    }

    public void countPureInt(long number){
        int count = 0;
        while(number !=0){
            count++;
            number = number/10;
        }

        System.out.println(count);

    }


    public static void main(String[] args) {

        CountDigits obj = new CountDigits();
//        obj.count("224");
//        obj.count("12345");
         obj.count("76542786");

        obj.countPureInt(12344);
        obj.countPureInt(34324234);

    }


}
