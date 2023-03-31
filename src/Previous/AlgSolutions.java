package Previous;

public class AlgSolutions {

    public static String urlify(String str){
       String result= str.trim().replaceAll(" ", "%20");
       return result;
    }

    public static void main(String[] args) {
        System.out.println(urlify("Mr John Smith    "));
    }
}
