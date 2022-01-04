package org.opentutorials.javatutorials.method;

public class ReturnDemo2 {

    public static String num(int i) {

      if(i==0) {
          return "zero"; // i=1 이기 때문에 false 가 되면서 실행되지 않는다.
      } else if(i==1) {
            return "one"; // 아래서 num 이라는 메소드에 1이라는 값을 주었기 때문에, 여기서 일치하여 true 가 되기 때문에 return 이 실행되면서 메소드가 종료되어 "one" 이라는 값을 출력한다.
      } else if(i==2) {
          return "two";
      }
      return "none";

    }


    public static void main(String[] args) {
        System.out.println(num(1)); // 여기의 1은 위의 num 메소드에 들어가 num(int 1) 이 되어, 아래 if 문에 비교할때 사용되게 된다.
    }

}
