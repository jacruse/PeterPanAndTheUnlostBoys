public class Ticket implements Comparable{

    private int _id;
    private int _vip;
    private String _name;
    private String problem;
    private String solution;
    private boolean solved;
    private static int idTracker = 0;
    
    public Ticket(){
	_id = idTracker;
	idTracker +=1;
	_vip = 0;
	problem = "N/A";
	_name = "<YOURNAMEHERE>";
	solution = "N/A";
	solved = false;
    }
    
    public Ticket(int vip, String name, String prob){
	_id = idTracker;
	idTracker +=1;
	_vip = vip;
	_name = name;
	problem = prob;
	solution = "N/A";
	solved = false;	
    }

    public boolean success(){
        solved = true;
	return solved;
    }

    //If of greater priority: 1
    //If of equal priority: 0
    //If of less priority: -1
    public int compareTo(Object o){
	if(this.getVip() < ((Ticket)o).getVip()){
	    return 1;
	}
	else if(this.getVip() == ((Ticket)o).getVip()){
	    return 0;
	}
	else{
	    return -1;
	}
    }
    //ACCESSORS
    public int getVip(){
	return _vip;
    }

    public int getId(){
	return _id;
    }

    public String getName(){
	return _name;
    }
    
    public String getProblem(){
	return problem;
    }
    
    public String getSolution(){
	return solution;
    }
    
    public boolean isSolved(){
	return solved;
    }

    public void findSolution(){
	if(this.getProblem().substring(0,3).equals("can")){
	    solution = "yes";
	    solved = true;
	}
	else{
	    solution = "no";
	    solved = true;
	}
    }

    public String toString(){
	String s = "";
	s+= "\nID Num: " + _id;
	s+= "\nVIP Level: " + _vip;
 	s+= "\nName: " + _name;
	s+= "\nProblem: " + problem;
	s+= "\nSolved?: " + solved;
	s+= "\nSolution: " + solution;
	return s;
    }

    public static void main(String[] args){
	Ticket gab = new Ticket();
	System.out.println(gab);
	Ticket raphi = new Ticket(2, "sana", "can to eat?");
	System.out.println(raphi);
        raphi.findSolution();
	System.out.println(raphi);
	    
    }
}
