public class Person {
    private String name;
    private String surname;
    private int tickets;

    public Person(String name,String surname,int tickets){
        if(tickets>0) {
            this.name = name;
        }
        this.surname = surname;
        this.tickets = tickets;
    }
    public String toString(){
        return name + ' ' + surname + " прокатился на атракционе";
    }
    public boolean ride(){
        if (tickets-1>0){
            tickets-=1;
            return true;
        }
        else{
            return false;
        }

    }

}
