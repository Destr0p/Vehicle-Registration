 import java.util.*;
    import java.util.stream.*;
    
    public class UserInterface {
    	public static void main(String [] args)
    	{	
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the number of vehicle details:");
            int a = Integer.parseInt(sc.nextLine());
            if(a<=0){System.out.println("Invalid");}
            else{
                System.out.println("Enter the vehicle details:");
                String [] x=new String[a];
                List<Vehicle> clm=new ArrayList<Vehicle>();
               for(int j=0;j<a;j++){
                    x[j]=sc.next();
                    String[] p=x[j].split("/");
                    Vehicle cd=new Vehicle();
                    cd.setVehicleNo(Integer.parseInt(p[0]));
                    cd.setVehicleHolderName(p[1]);
                    cd.setVehicleHolderAddress(p[2]);
                    clm.add(cd);
                }
                VehicleUtility obj = new VehicleUtility();
                obj.setVehicleList(clm);
                System.out.println("Enter length of the number to search");
                int uh= Integer.parseInt(sc.next());
                List<Vehicle> ans=obj.filterVehicleDetails(obj.convertToStream(),uh);
                if(ans.isEmpty()){
                    System.out.println("No vehicle found");
                }else{
                    System.out.println("Filter the vehicle numbers which has a length of "+uh+":");
                    for(int g=0;g<ans.size();g++){System.out.println("Vehicle Number:"+ans.get(g).getVehicleNo()+",Name"+ans.get(g).getVehicleHolderName());}
                }
            }
        
    	}
    
    }
   
