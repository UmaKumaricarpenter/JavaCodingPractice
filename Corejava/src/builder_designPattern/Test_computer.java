package builder_designPattern;

import builder_designPattern.Computer.ComputerBuilder;

public class Test_computer {
	
	public static void main(String[] args) {
		
		
		Computer c1 = new Computer
				      .ComputerBuilder().setBluetoothEnabled(true)
				      .setGraphicCardEnabled(true)
				      .setHdd("simple").setRam("8GB")
				      .build();
				    
				   System.out.println(c1);   
				      
	}

}
