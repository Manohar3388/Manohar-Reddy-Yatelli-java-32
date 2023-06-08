package university3;

abstract class Student  implements Inter_2, Inter_1{


    @Override

    public void marks() {
        System.out.println("My Marks");
    }

    public void getPercentage() {
        System.out.println("My Percentage");
    }}
    class Profile extends Student{
        public void display(){
        System.out.println("The Child class");

    }}

