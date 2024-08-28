import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        if(n==0){
            System.out.print("zero");
        }
        else if(n>0){
            System.out.print("posotive ");
        }
        else{
            System.out.print("negative");
        }
        // switch
        switch(n){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wedneshday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("saturday");
                break; 
            default:
                System.out.println("error");
        }
                
            // 1 to user number
         for(int i=1;i<=n;i++){
                System.out.println(i);
            }
            int m=n;
            // down order
            while(n>0){
                System.out.println(n);
                n=n-1;
            }
            // do-while
            do{
                System.out.println(m);
                m-=1;
            }
            while(m>0);
                
           
        
    }
}