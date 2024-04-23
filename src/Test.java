public class Test {

    void addOne(int num){

        System.out.println("addOne"+num);
        num++;
        System.out.println("addOne"+num);
    }


    void addAge(Student student){
        System.out.println("addAge"+student.age);
        student.age ++;
        System.out.println("addAge"+student.age);
    }
}
