package builder_designPattern;

public class Computer {
	
	private String hdd;
	private String ram;
	private boolean isGraphicCardEnabled;
	private boolean isBluetoothEnabled;
	
	 public Computer(ComputerBuilder computerBuilder  ) {
	
		this.hdd = computerBuilder.hdd;
		this.ram = computerBuilder.ram;
		this.isGraphicCardEnabled = computerBuilder.isGraphicCardEnabled;
		this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
	}

	public String getHdd() {
		return hdd;
	}

	public String getRam() {
		return ram;
	}

	public boolean isGraphicCardEnabled() {
		return isGraphicCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	@Override
	public String toString() {
		return "Computer [hdd=" + hdd + ", ram=" + ram + ", isGraphicCardEnabled=" + isGraphicCardEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}


	static class ComputerBuilder{
		
		    private String hdd;
			private String ram;
			private boolean isGraphicCardEnabled;
			private boolean isBluetoothEnabled;
			
			ComputerBuilder(){
				
			}

			public ComputerBuilder setHdd(String hdd) {
				this.hdd = hdd;
				return this;
			}

			public ComputerBuilder setRam(String ram) {
				this.ram = ram;
				return this;
			}

			public ComputerBuilder setGraphicCardEnabled(boolean isGraphicCardEnabled) {
				this.isGraphicCardEnabled = isGraphicCardEnabled;
				return this;
			}

			public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
				this.isBluetoothEnabled = isBluetoothEnabled;
				return this;
			}
			
			public Computer build() {
				Computer c  = new Computer(this) ;
				return c ;
			}	
			
			 
		
	}
	

}
