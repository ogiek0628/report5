public class report5_1_2 {

    public static void main(String[] args){

        String str = null;

       try{
           
            System.out.println(str.length());
       
        }catch(NullPointerException e){

            System.out.println("nullPointExceptionがありました。");
            System.out.println(e.getMessage());

       }


    }

    
}
