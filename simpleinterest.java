public class simpleinterest
{  
    public static void main (String args[])
    {   
        
        float principle, rate,  time,  si;  
        principle = 15000;  
        rate = 8; 
        time = 4;  
        si  = (principle*rate*time)/100;   
        System.out.println("Simple Interest is: " +si);  
    }
}