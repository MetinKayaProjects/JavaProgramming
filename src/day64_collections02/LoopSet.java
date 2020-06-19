package day64_collections02;
import java.util.*;

import javax.naming.ldap.SortResponseControl;
public class LoopSet {
	public static void main(String[] args) {
		
		Set<Integer> numsSet = new HashSet<Integer>();
		numsSet.add(10);numsSet.add(10);numsSet.add(10);numsSet.add(10);
		numsSet.add(10);numsSet.add(10);numsSet.add(10);numsSet.add(10);
		
		System.out.println(numsSet.size());  //1  since set is unique, it doen't allow for dublication
		System.out.println(numsSet);
		
		Set<Integer> numsSet2 = new HashSet<Integer>();
		numsSet2.add(10);numsSet2.add(10);numsSet2.add(10);numsSet2.add(10);
		numsSet2.add(123); numsSet2.add(309); numsSet2.add(345);
		
		System.out.println(numsSet2.size());
		System.out.println(numsSet2);
		
		for (int nS : numsSet2) {
			System.out.print(nS + " | ");
		}
		
		System.out.println();
		
		numsSet2.forEach(n2 -> System.out.print(n2 + " | ") );
	}

}
