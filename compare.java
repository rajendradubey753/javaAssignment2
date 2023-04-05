public class compare {
    public static void main(String[] args) {
        String sc = "akash";
        String sc2 = "akash";
        String sc3 = new String("akash");
        System.out.println(sc==sc3);
        System.out.println(sc2.equals(sc3));//its compare only String of object
    }
    
}
