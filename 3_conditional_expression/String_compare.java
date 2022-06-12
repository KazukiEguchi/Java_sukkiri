public class String_compare{
    public static void main(String[] args){
        String name = "江口和輝";
        System.out.println("名前を入力");
        String input_name = new java.util.Scanner(System.in).nextLine();
        if(name.equals(input_name)){
            System.out.println("一致");
        }else{
            System.out.println("一致せず");
        }
    }
}