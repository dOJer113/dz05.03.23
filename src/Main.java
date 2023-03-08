import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());
        while (!queue.isEmpty()){
            System.out.println(queue.peek());
            if (queue.peek().ride()==true){
                queue.offer(queue.poll());
            }
            else {
                queue.poll();
            }
        }

    }
    public static List<Person> generateClients(){
        Person client = new Person("Лилия","Тышкевич",1);
        Person client1 = new Person("Александр","Попов",2);
        Person client2= new Person("Полина","Титова",3);
        Person client3 = new Person("Анастасия","Авдохина",4);
        Person client4 = new Person("Анастасия","Баландина",5);
        List<Person> clients = new ArrayList<>();
        clients.add(client);
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        clients.add(client4);
        return clients;
    }
}