



import java.util.Scanner;


class Patient
{
    String name;
    String streetAdress;
    int age;
    int PatientID;
     
    
    
    public Patient(String name, String streetAdress, int age, int PatientID) 
    {
        this.name = name;
        this.streetAdress = streetAdress;
        this.age = age;
        this.PatientID = PatientID;
        
    }  
    
    
     
        
    
        
    
    public void PrintPat()
    {
        System.out.println("\nName          :" + name);
        System.out.println("Adress        :" + streetAdress);
        System.out.println("Age           :" + age);
        System.out.println("Patient  ID   :" + PatientID);
    }
    
}




class Doctor
{
    String dname;
    String dstreetAdress;
    int dage;
    int DoctorID;
     
    
    
    public Doctor(String dname, String dstreetAdress, int dage, int DoctorID) 
    {
        this.dname = dname;
        this.dstreetAdress = dstreetAdress;
        this.dage = dage;
        this.DoctorID = DoctorID;
        
    }  
    
    
         
        
    
        
    
    public void PrintDoc()
    {
        System.out.println("\nName          :" + dname);
        System.out.println("Adress        :" + dstreetAdress);
        System.out.println("Age           :" + dage);
        System.out.println("Doctor  ID    :" + DoctorID);
    }
    
}



class totalprice                                  
{
    int charge_per_day=500;
    
    void tprice(int cal)                                      
    {
        System.out.println("\nTotal Price is:" + (5000 + cal*charge_per_day));
    }
    

    
}


     
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	         
		     int input1=0;
			
				Patient[] P1 =new Patient[100];
			    P1[0] = new Patient("kamal", "bihar", 18, 11);
			    P1[1] = new Patient("ayush", "Delhi", 34, 12);
			    P1[2] = new Patient("pappu", "nivaranpur", 34, 13);
			   	P1[3] = new Patient("yash", "bihar", 17, 14); 
			   	P1[4] = new Patient("aditya", "bihar", 18, 15);
			    P1[5] = new Patient("aman", "Delhi", 34, 16);
			    P1[6] = new Patient("abhishek", "nivaranpur", 34, 17);
			   	P1[7] = new Patient("gagan", "bihar", 17, 18); 
			   	P1[8] = new Patient("harsh", "bihar", 18, 19);
			    P1[9] = new Patient("jhon", "mumbai", 34, 20);
			    
			   	
			   	Doctor[] D1 =new Doctor[100];
			    D1[0] = new Doctor("DR himansu", "bihar", 18, 11);
			    D1[1] = new Doctor("Dr kumar", "Delhi", 34, 12);
			    D1[2] = new Doctor("Dr pratik", "nivaranpur", 34, 13);
			   	D1[3] = new Doctor("Dr akash", "bihar", 17, 14);
			   	
			   	
			while(input1!=8)
			{
			    
	     	System.out.println("\nChoose one Option");
			System.out.println("1. show Patient Details");
			System.out.println("2. Show Doctor Details");
			System.out.println("3. Calculate Total Bill");
			System.out.println("4. For Searching Patient");
			System.out.println("5. For Searching Doctor");
			System.out.println("6. Number Of Beds Available");
			System.out.println("7. Modify Patient Details");
			System.out.println("8. Exit");
			
			input1 = sc.nextInt();
			
			if(input1==1)
			{
			    	System.out.println("Enter the Number of Patient Details You want");
			    	 int n1 = sc.nextInt();
			    for(int j=0; j<n1; j++)
			   { P1[j].PrintPat();}
			    
			    
			}
			
			else if(input1==2)
			{
			    System.out.println("Enter the Number of Doctor Details You want");
			    	 int n2 = sc.nextInt();
			    for(int j=0; j<n2; j++)
			   { D1[j].PrintDoc();}
			}
			
			
			
			
			else if(input1==3)
			{ 
			    totalprice tp=new totalprice();
			    
			    
			    
			    System.out.println("Enter Your Choice: \n1. Checkup Price  \n2. Total Price\n");
			    int cp = sc.nextInt();
			    
			    if(cp==1)
			    {System.out.println("Checkup Price is 5000");}
			    
			    else if(cp==2)
			    {System.out.println("Total Number of days in hospital");
			    int n3 = sc.nextInt();
			    tp.tprice(n3);}
			    
			    
			    
			}
			
		     
		     else if(input1==4)
		     { System.out.println("Enter PatientID");
		         
		         int search = sc.nextInt();
		         
		          for(int i=0;i<10;i++)
             {   if(search==P1[i].PatientID)
                  {P1[i].PrintPat();}
		         
		     }}
		     
		     
		     
		     else if(input1==5)
		     { System.out.println("Enter DoctorID");
		     
		         int search2 = sc.nextInt();
		         
		          for(int i=0;i<3;i++)
             {   if(search2==D1[i].DoctorID)
                  {D1[i].PrintDoc();}
		         
		     }
		         
		         
		     }
		     
			 else if(input1==6)
		     { System.out.println("\nMedanta Memorial Hospital, Ranchi \n ");
		         System.out.println("\nTotal Number of Beds: 10 \n ");
		         int bedsnum=10;
		         
		         for(int i=0; i<10; i++)
		         { if(P1[i].PatientID!=0)
		         { 
		             bedsnum--;
		         }
		         
		         
		        }
		         System.out.println("Number of Beds Available: " + bedsnum);
		         
		        
		        
		     }
			
				
			
			
			
			else if(input1==7)
		     { System.out.println("Enter PatientID");
		     
		         int search3 = sc.nextInt();
		         
		          for(int i=0;i<10;i++)
             {   if(search3==P1[i].PatientID)
                  {    
                      int k1= P1[i].PatientID;
                      String namem1 = sc.nextLine();
                      System.out.println("\nEnter Patient Name \n");
                      String namem = sc.nextLine();
                      
                     
                     
                      
                      System.out.println("\nEnter Patient Adress \n");
                      String a1 = sc.nextLine();
                      
                      System.out.println("\nEnter Patient age \n");
                      int ag1 = sc.nextInt();
                      
                      P1[i] = new Patient(namem, a1, ag1, k1);
                      P1[i].PrintPat();
                  }
		         
		     }
		         
		         
		     }}
			
			
			
	}
}
