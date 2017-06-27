package interview;
import java.util.*;
public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String randomString="aaabbcccdddeeefgahdgcbeabfghe";
HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

for(int i=0;i<=127;i++){
	map.put(i, 0);
}


for(int j=0;j<randomString.length();j++){
	Set s=map.entrySet();
	Iterator i=s.iterator();
	while(i.hasNext()){
		
		Map.Entry<Integer, Integer> e=(Map.Entry<Integer, Integer>)i.next();
		if((int)randomString.charAt(j)==(int)e.getKey()){
			e.setValue(e.getValue()+1);
			
	}
	}
	
}


System.out.println(map);

	}

}
