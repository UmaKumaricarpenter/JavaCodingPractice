package prototype_designPattern;

import java.util.*;

public class TestingOfNetwork {
	
	public static void main(String[] args) {
	
		
		NetworkConnection nc = new NetworkConnection();
		
		nc.setIp("64.45545.7656.54435.");
		
		nc.loadIMPData();
		
		System.out.println(nc);
		
		
        List<String> list = new ArrayList<>() ;
		
		list.add("www.facebook.com") ;
		list.add("www.bookface.com") ;
		list.add("www.x.com") ;
		
		nc.setDomains(list);
		
		try {
			NetworkConnection  pp  =(NetworkConnection)nc.clone() ;
			
			
		    System.out.println("pp.getIp");
			
			System.out.println(pp);
			
			nc.setIp("000000");
			
			System.out.println(pp.getIp());	
			
            nc.getDomains().add(0, "sachin");
			
			System.out.println(pp.getDomains().get(0) );
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
