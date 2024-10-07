package prototype_designPattern;

import java.util.*;

public class NetworkConnection {
	
	    private  String ip ;
       	private String impData ;
       	
       	private List<String>  domains = new ArrayList<>() ;
    	
    	public List<String> getDomains() {
    		return domains;
    	}
    	public void setDomains(List<String> domains) {
    		this.domains = domains;
    	}
       	
		public String getIp() {
			return ip;
		}
		
		public void setIp(String ip) {
			this.ip = ip;
		}
		
		public String getImpData() {
			return impData;
		}
		
		public void setImpData(String impData) {
			this.impData = impData;
		}

		public NetworkConnection() {
			super();
			this.ip = ip;
			this.impData = impData;
		}
		
		public void loadIMPData() {
			
			try {
				Thread.sleep (6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.impData  = "very very Imp data loading" ;
		}

		@Override
		public String toString() {
			return "NetworkConnection [ip=" + ip + ", impData=" + impData + "]";
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			NetworkConnection newNetworkConnection   = new NetworkConnection () ;
			
			newNetworkConnection.setImpData(this.impData);
			
			newNetworkConnection.setIp(this.impData);
			
			
			for(String dom  : this.getDomains()) {
				
				newNetworkConnection.getDomains().add(dom) ;
			}
			
			return newNetworkConnection;
		}
		
	  
		
		
		
}
