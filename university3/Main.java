package university3;

import static university3.Faculty.faculty_exp;

public class Main {

    public static void main(String[] args){
        Profile profile=new Profile();
        profile.marks();
        profile.getPercentage();


        Faculty fac=new Faculty(25,5);
        Faculty fac2=new Faculty(24);
        Sports sport=new Sports();




       


        System.out.println(fac2.faculty_count);

        System.out.println(faculty_exp(12));

        System.out.println(sport.view_sport_id());




    }
}
