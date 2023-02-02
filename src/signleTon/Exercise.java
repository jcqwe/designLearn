package signleTon;

public class Exercise {
    public static void main(String[] args) {
        Ticket ticket = Ticket.getTicket();
        Ticket ticket2 = Ticket.getTicket();
        System.out.println(ticket == ticket2);
        System.out.println( ticket.getNextTicketNumber());
        System.out.println(ticket2.getNextTicketNumber());
    }
}
class Ticket{
    private static final  Ticket single = new Ticket();
    private int ticket = 1000;
    private Ticket(){}
    public int getNextTicketNumber(){
        return ticket++;
    }
    public static Ticket getTicket(){
        return single;
    }
}
