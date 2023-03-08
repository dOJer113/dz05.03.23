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
    public void ride(){
        tickets-=1;

        System.out.println("Я покатался");
    }
    public boolean haveTickets(){
        if (tickets>0){
            return true;
        }
        else{
            return false;
        }
    }

}
