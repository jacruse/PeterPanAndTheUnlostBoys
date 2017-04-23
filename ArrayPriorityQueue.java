/*
JackDanielS - Jack Cruse, Daniel Ju, Sasha Fomina
APCS2 pd4
HW32 -- Getting Past the Velvet Rope
2017-4-20
*/


import java.util.ArrayList;

public class ArrayPriorityQueue<T extends Comparable<T>> implements PriorityQueue
{
    private int _size;
    private ArrayList<Object> _data;

    public ArrayPriorityQueue()
    {
	_size = 0;
	_data = new ArrayList<Object>();
    }

    public void add( Object x )
    {
	T val = ( T ) x;
	int lb = 0;
	int ub = _size;
	int mb = ( ub - lb ) / 2;
	
	while (!( lb >= ub) )
	    {
		if ( ( ( T ) _data.get( mb ) ).compareTo( val ) > 0 )
		    {	
			if (lb == mb){
			    _data.add(ub,x);
			    _size++;
			    return;
			}
			
			lb = mb;
		    }

		else if ( ( (T) _data.get( mb ) ).compareTo( val ) < 0 )
		    {
			
			if (ub == mb){
			    _data.add(lb, x);
			    _size ++;
			    return;
			}
			
			ub = mb;
			
		    }

		else
		    {
			_data.add( mb, x );
			_size ++;
			return;
		    }
		mb = lb + ( ub - lb ) / 2 ;
	    }
	_size++;
	_data.add( lb, x );
    }

    public boolean isEmpty()
    {
	return _size == 0;
    }

    public Object peekMin()
    {
	if ( _size == 0 )
	    {
		System.out.println( "Queue is empty");
		return null;
	    }
	return _data.get( _size - 1 );
    }

    public Object removeMin()
    {
	if ( _size == 0 )
	    {
		System.out.println( "Queue is empty");
		return null;
	    }
	_size--;
	return _data.remove( _size );
    }

    public String toString(){
	return _data.toString();
    }

    public static void main (String[] args){
	PriorityQueue bob = new ArrayPriorityQueue<Integer>();
	bob.add(1);
	bob.add(2);
	bob.add(3);
	bob.add(4);
	bob.add(5);
	bob.add(6);
	bob.add(7);
	bob.add(3);
	bob.add(12);
	bob.add(10);
	bob.removeMin();
	bob.add(1); //THIS DOESN'T WORK
	//Fixed, can't lean so far left on the ub
	System.out.println(bob);	
	System.out.println (bob.peekMin());
	System.out.println (bob.removeMin());
	bob.add(6);
	bob.add(2);
	bob.add(1);
	System.out.println(bob);
	System.out.println (bob.removeMin());
	System.out.println (bob.removeMin());
	System.out.println (bob.removeMin());
	System.out.println (bob.removeMin());
	System.out.println (bob.removeMin());
	System.out.println (bob.removeMin());
	System.out.println (bob.removeMin());
    }

}
