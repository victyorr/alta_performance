package pilhas;

public class PilhasInt {

	public final int N=6;
	int dados[] = new int[N];
	int topo;
	
	public void init() {
		topo = 0;
		
	}
	
	public void push(int elem) {
		dados[topo] = elem;
		topo++;
		
	}
	public int pop() {
		topo--;
		return (dados[topo]);
		
		
	}
	
	
}
