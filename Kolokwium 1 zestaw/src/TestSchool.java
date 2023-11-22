import education.School;

public class TestSchool {
    public static void main(String[] args) {
        School s1= new School("SP","Bukowa 17dsadasdsadsadad",10);
        System.out.println(s1);
        School s2=new School("","",-1);
        System.out.println(s2);
        s1.recruitment(491);
        System.out.println(s1);

    }
}
