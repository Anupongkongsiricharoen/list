
public class Test {	
    public static void main (String[] argr) {
    	ArrayList<Character> al = new ArrayList<>();
    	al.add(0,'A');
    	al.add(0,'B');
    	System.out.println("Get: "+al.get(1));
    	System.out.println("Error");
    	/*al.set(2,'c');*/
    	al.add(2,'C');
    	System.out.println("Error");
    	/*al.add(4,'D');*/
    	System.out.println("Remove: "+al.remove(1));
    	al.add(1,'D');
    	al.add(1,'E');
    	/*al.get(4);*/
    	System.out.println("Error");
    	al.add(4,'F');
    	System.out.println("Set: "+al.set(2,'G'));
    	System.out.println("Set: "+al.get(2));
    }
}
