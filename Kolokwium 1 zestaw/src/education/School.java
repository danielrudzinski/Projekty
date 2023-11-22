package education;

import java.util.Objects;

public class School {
    private String name;
    private String address;

    private int students;

    public School(String name, String address, int students) {

        if(this.name!=null){
            this.name=name;
            this.name="Wydział Matematyki i Informatyki UWM";
        }
        else this.name="Wydział Matematyki i Informatyki UWM";

        if(this.address==null){
            this.address="ul. Słoneczna 54, 10-710 Olsztyn";
        }
        else this.address = address;
        this.students = students;
        if(this.students<0){
            this.students=100;
        }
        else this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(this.name!=null){
            this.name = name;
        }

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(this.address!=null){
        this.address = address;
        }
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        if(this.students>=0) {
            this.students=students;
        }
    }

    @Override
    public String toString() {
        return "School" + "Name." + name +  " Address:" + address +   " Number of students:" + students + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        School school = (School) o;

        if (students != school.students) return false;
        if (!Objects.equals(name, school.name)) return false;
        return Objects.equals(address, school.address);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + students;
        return result;
    }
    public void recruitment(int x){
        if(this.students+x>500){
            this.students=500;
        }
        else {
            this.students=this.students+x;
        }
    }
    private static void checkLimit(School school){
        System.out.println("Liczba obecnych uczniów: " + school.students);

    }
}
