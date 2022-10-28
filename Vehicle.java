public class Vehicle {
     	private int vehicleNo;
     	private String vehicleHolderName;
     	private String vehicleHolderAddress;
     	
     	//Setters and Getterss
     	public int getVehicleNo() {
     		return vehicleNo;
    	}
    	public void setVehicleNo(int vehicleNo) {
    		this.vehicleNo = vehicleNo;
    	}
    	public String getVehicleHolderName() {
    		return vehicleHolderName;
    	}
    	public void setVehicleHolderName(String vehicleHolderName) {
    		this.vehicleHolderName = vehicleHolderName;
    	}
    	public String getVehicleHolderAddress() {
    		return vehicleHolderAddress;
    	}
    	public void setVehicleHolderAddress(String vehicleHolderAddress) {
    		this.vehicleHolderAddress = vehicleHolderAddress;
    	}
    	@Override
    	public String toString() {
    		return "Vehicle [vehicleNo=" + vehicleNo + ", vehicleHolderName=" + vehicleHolderName
    				+ ", vehicleHolderAddress=" + vehicleHolderAddress + "]";
    	}
    	
    	
    }
