 import java.util.*;
     import java.util.stream.*;
     
     public class VehicleUtility {
     	private List<Vehicle> vehicleList;
         public List<Vehicle> getVehicleList(){
             return vehicleList;
         }
     	public void setVehicleList(List<Vehicle> vehicleList){
    	    this.vehicleList=vehicleList;
    	}
    
    	public Stream<Vehicle> convertToStream() {
    		Stream<Vehicle> w=vehicleList.stream();
    		return w;
    	}
    
    	public List filterVehicleDetails(Stream<Vehicle> stream1,int length) {
    		List<Vehicle> shot=stream1.filter(x->String.valueOf(x.getVehicleNo()).length()>=length)
    		.sorted(Comparator.comparingInt(Vehicle::getVehicleNo))
    		.collect(Collectors.toList());
    		return shot;
    		
    	}
    
    }
