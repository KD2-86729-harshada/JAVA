import java.util.Scanner;

public class q2 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		double dosa_price = 50.0;
        double samosa_price = 15.0;
        double idli_Price = 30.0;
        double misal_price = 50.0;
        double pohe_price = 20.0;
        double vadapav_price = 15.0;
        double uttapa_price = 50.0;
        double dabeli_price = 30.0;
        double dahivada_price = 30.0;
        
        double Gen_bill = 0.0;
		
        while (true)
        {
	System.out.println("0.exit");
        	System.out.println("1.Dosa");
    		System.out.println("2.Samosa");
    		System.out.println("3.Idli");
    		System.out.println("4.Misal");
    		System.out.println("5.Pohe");
    		System.out.println("6.Vadapav");
    		System.out.println("7.Uttappa");
    		System.out.println("8.Dabeli");
    		System.out.println("9.Dahivada");
    		System.out.println("10.Generate bill");
	
    		System.out.print("Enter your choice : ");
    		int choice = scanner.nextInt();
    		System.out.println("***********************WEL-COME************************");
    		
    		
    		switch (choice) 
    		{
    		case 1:
    			System.out.println("Enter the quantity of Dosa");
    			int dosa_quant = scanner.nextInt();
    			Gen_bill += dosa_quant * dosa_price;
    			
    			break;
    			
    		case 2:
    			System.out.println("Enter the quantity of Samosa");
    			int samosa_quant = scanner.nextInt();
    			Gen_bill += samosa_quant * samosa_price;
    			
    			break;
    			
    		case 3:
    			System.out.println("Enter the quantity of Idli");
    			int idli_quant = scanner.nextInt();
    			Gen_bill += idli_quant * idli_Price;
    			
    			break;
    			
    		case 4:
    			System.out.println("Enter the quantity of misal");
    			int misal_quant = scanner.nextInt();
    			Gen_bill += misal_quant * misal_price;
    			
    			break;
    		
    		case 5:
    			
    			System.out.println("Enter the quantity of Pohe");
    			int pohe_quant = scanner.nextInt();
    			Gen_bill += pohe_quant * pohe_price;
    			
    			break;
    			
    		case 6:
    			
    			System.out.println("Enter the quantity of vadapav");
    			int vadapav_quant = scanner.nextInt();
    			Gen_bill += vadapav_quant * vadapav_price;
    			
    			break;
    			
    		case 7:
    			System.out.println("Enter the quantity of Uttapa");
    			int uttapa_quant = scanner.nextInt();
    			Gen_bill += uttapa_quant * uttapa_price;
    			
    			break;
    			
    		case 8:
    			System.out.println("Enter the quantity of Dabeli");
    			int dabeli_quant = scanner.nextInt();
    			Gen_bill += dabeli_quant * dabeli_price;
    			
    			break;
    			
    		case 9:
    			System.out.println("Enter the quantity of dahivada");
    			int dahivada_quant = scanner.nextInt();
    			Gen_bill += dahivada_quant * dahivada_price;
    			
    			break;
    			
    		case 10:
    			System.out.println("Genrate bill = "+Gen_bill);
    			System.out.println("*********************Thank You**********************");
    			break;

    		default:
    			System.out.println("Invalid choice");
    			break;
    		}

        }
	}

}

