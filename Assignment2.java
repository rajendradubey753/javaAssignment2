public class Assignment2 {
    public static void main(String[] args) {
        String s2 = "umbrella";
        boolean presente = false;
        for(int i = 0; i<s2.length();i++){
            
            if (s2.charAt(i)=='e')
                     {
                       presente =true;
                        break;
                
            }


        }
        if (presente){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    
}
