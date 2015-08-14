import java.util.ArrayList;




public class Base {
protected Integer value=2;
	
	Base(int v)
	{
		value=v;
	}
	
	
	
public static void main(String[] args) {
	
	ArrayList<Object> list= new ArrayList<>();
	list.add(new OneClas());
	list.add(new TowClas());
	TowClas ktos = new TowClas();
	ktos.costam();
	OneClas nn = new OneClas();
	nn.run();
	Thread ss = new Thread(new OneClas());
	ss.start();
	
	System.out.println((OneClas)list.get(0));
}
}
