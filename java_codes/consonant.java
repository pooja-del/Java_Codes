import java.util.Scanner;
class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //Complete the code here
        String s=scan.nextLine();
        s=s.replaceAll("[BbCcDdFfGgHhJjKkLlMmNnPpQqRrSsTtVvWwXxYyzZ]","");
        System.out.println(s);
        }
        }
        
