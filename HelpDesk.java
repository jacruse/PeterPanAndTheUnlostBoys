public class HelpDesk {
    private ArrayPriorityQueue<Ticket> work;

    public HelpDesk(){
	work = new ArrayPriorityQueue<Ticket>();
    }

    public String add(int vip, String name, String problem){
	work.add(new Ticket(vip, name, problem));
    }

    public Ticket peekMin(){
	return work.peekMin();
    }

    public boolean isEmpty(){
	return work.isEmpty();
    }
}
