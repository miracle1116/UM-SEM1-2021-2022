package lab9;

public class PersonProfil {
    private String name;
    private char gender;
    private String DOB;

    public PersonProfil(String name, char gender, String DOB) {
        this.name = name;
        this.gender = gender;
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return "PersonProfil" + "name= " + name + "\n gender= " + gender + "\n DOB= " + DOB ;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getDOB() {
        return DOB;
    }
    
    
}
