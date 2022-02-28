package tutor10;

public class Person implements Comparable{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }
    
    


    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Person: " + name+"\n";
    }
    

        public int compareTo(Object a){
            return name.compareToIgnoreCase(((Person)a).getName());
        }


}
