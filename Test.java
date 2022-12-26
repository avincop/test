import java.util.Scanner;

class Test{
    void digitNum(){
        int n,rem,dev,temp;
        int count=0;
        int count1=0;
        int count2=0;
        //int arr[]=new int[100];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a range");
        n= sc.nextInt();
        sc.close();

        for(int i=1;i<=n;i++){
           // arr[i]=i;
        if(i<10){
            count+=2;
        }
         else if(i>=10 && i<100){
            count1+=6;
        }
        else if(i>=100 && i<1000){
            count+=2;
        }
        
        count2=count1+count;

        }  
       // System.out.println(count2);
    temp=count2;
    rem=temp/10;
    dev=count2%10;
    System.out.println(rem+dev);  
    //System.out.println(dev); 
    }
}
class DigitN{
    public static void main(String[] args) {
       Test t= new Test();
       t.digitNum();
        
    }
}