package assign_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Stud_Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Stud>list=new ArrayList <Stud>();
		list.add(new Stud(10,23,1000,"Sush"));
		list.add(new Stud(10,23,1000,"Sush"));
		list.add(new Stud(10,23,1000,"Sush"));
		list.add(new Stud(10,23,1000,"Sush"));
		list.add(new Stud(10,23,1000,"Sush"));
		list.add(new Stud(10,23,1000,"Sush"));
		
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
			System.out.println("Display the data");
			System.out.println("Display the all stud in ascending order");
			System.out.println("Update stud age by their id");
			System.out.println("Enter ur choice");
			ch=sc.nextInt();
			switch( ch) {
			case 1:
				for(Stud s:list) {
					System.out.println(s);
					
				}
				break;
				
			case 2:
				List<Stud>l1=new ArrayList<Stud>();
				Collections.sort(l1,new StudComparator());
			     for(Stud s2:l1) {
			    	 System.out.println(s2);
			    	 
			     }
			     break;
			case 3:
				boolean found= false;
				System.out.println("Enter thr stud id for their purches amount");
				int id1=sc.nextInt();
				ListIterator<Stud>l2=list. listIterator();
				while(l2.hasNext()) {
					Stud s5=l2.next();
					if(s5.getId()==id1) {
						System.out.println("entrr the age");
						int age=sc.nextInt();
						System.out.println("enter the purches amount");
						int purchesamount=sc.nextInt();
						System.out.println("Enter stud name");
						String name=sc.next();
						l2.set(new Stud(id1,age,purchesamount,name));
						found=true;
						
						
					}
					if(!found)
						System.out.println("stud not found");
					else
						System.out.println("update is successful");
						
					
					
				}
				
				
			    	
					
			
			}
		
		}while(ch!=0);
	}

}
