public class Main {
    public static void main(String[] args) {

      int num = 10;
      System.out.println("main"+num);
      Test test = new Test();
      test.addOne(num);
      System.out.println("main"+num);



      Student jo = new Student();
      jo.age=18;
      System.out.println("main"+jo.age);

      test.addAge(jo);
      System.out.println("main"+jo.age);
    }

}