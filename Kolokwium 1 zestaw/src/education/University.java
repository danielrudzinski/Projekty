package education;

import java.util.Objects;

public class University extends School{
    private String type;
    private int studies;

    public University(String name, String address, int students, String type, int studies) {

        super(name, address, students);
        if(this.type==null){
            this.type="university of technology";
        }
        else this.type=type;
        if(this.studies<0){
            this.studies=10;
        }
        else this.studies=studies;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
       if(this.type!=null){
           this.type = type;
       }
    }

    public int getStudies() {
        return studies;
    }

    public void setStudies(int studies) {
       if(this.studies<0){
           this.studies = studies;
       }
    }

    @Override
    public String toString() {
        return "University:" + "Name" + getName() + "Address:" + getAddress()+"Number of students:" + getAddress()
                + "Type:" + type + "Number of fields of study:" + studies;
    }
   public void recruitment(int x){
        if(getStudents() +x>500){
            setStudents(500);
        }
        else {
            setStudents(getStudents() + x);
        }
        this.studies=this.studies+(x/10);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        University that = (University) o;

        if (studies != that.studies) return false;
        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + studies;
        return result;
    }
}
