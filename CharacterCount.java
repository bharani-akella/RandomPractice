package interview;
import java.util.*;
public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String randomString="aaabbcccdddeeefgahdgcbeabfghe";
int countA=0;
int countB=0;
int countC=0;
int countD=0;
int countE=0;
int countF=0;
int countG=0;
int countH=0;

for(int j=0;j<randomString.length();j++){
	if(randomString.charAt(j)=='a'){
	    countA++;
	}
	
}

for(int j=0;j<randomString.length();j++){
	if(randomString.charAt(j)=='b'){
	   countB++;
	}
	
}

for(int j=0;j<randomString.length();j++){
	if(randomString.charAt(j)=='c'){
	 countC++;
	}
	
}

for(int j=0;j<randomString.length();j++){
	if(randomString.charAt(j)=='d'){
	 countD++;
	}
	
}

for(int j=0;j<randomString.length();j++){
	if(randomString.charAt(j)=='e'){
	 countE++;
	}
	
}

for(int j=0;j<randomString.length();j++){
	if(randomString.charAt(j)=='f'){
	   countF++;
	}
	
}

for(int j=0;j<randomString.length();j++){
	if(randomString.charAt(j)=='g'){
	    countG++;
	}
	
}

for(int j=0;j<randomString.length();j++){
	if(randomString.charAt(j)=='h'){
       countH++;
	}
	
}

System.out.println("A="+countA);
System.out.println("B="+countB);
System.out.println("C="+countC);
System.out.println("D="+countD);
System.out.println("E="+countE);
System.out.println("F="+countF);
System.out.println("G="+countG);
System.out.println("H="+countH);

	}

}
