import java.util.Scanner;
public class main1{
    private static boolean[] seats =new boolean[10];
    

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        while(true)
        {
            System.out.println("\n Please select an option:");
            System.out.println("1. View seat Map");
            System.out.println("2. Reserve Seat");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Exit");
            
            int option = sc.nextInt();
            
            switch(option)
            {
                case 1:
                    viewSeatMap();
                    break;
                    
                case 2:
                    reserveSeat();
                    break;
                    
                case 3:
                    cancelReservation();
                    break;
                    
                case 4:
                    System.exit(0);
                    
                default:
                    System.out.println("Invalid Option");
                    
                    
                    
            }
        }

    }
    private static void viewSeatMap()
    {
        System.out.println("\n Current Seat Map:");
        for( int i=0; i<seats.length; i++)
        {
            if(seats[i])
            {
                System.out.println("X");
                
            }
            else
            {
                System.out.print((i+1)+ " ");
            }
        }
        System.out.println();
    }
    
    private static void reserveSeat()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("\n Enter seat number(1-10): ");
        int seatNumber =sc.nextInt();
        if(seatNumber < 1 || seatNumber > 10)
        {
            System.out.println("Invalid seat Number!");
        }
        else if(seats[seatNumber - 1])
        {
            System.out.println("Seats already Reserved!");
        }
        else
        {
            seats[seatNumber - 1]= true;
            System.out.println("seats Reserved!");
        }
    }
    
    private static void cancelReservation()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter seat Number(1-10): ");
        int seatNumber =sc.nextInt();
        if(seatNumber < 1 || seatNumber > 10)
        {
            System.out.println("Invalid seat Number!");
        }
        else if(seats[seatNumber - 1])
        {
            System.out.println("Seats not Reserved!");
        }
        else
        {
            seats[seatNumber - 1]= false;
            System.out.println("Reservation Cancelled!");
        }
    }
    
}