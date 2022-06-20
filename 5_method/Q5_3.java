public class Q5_3{
    public static void email(String title, String address, String text){
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名：" + title);
        System.out.println("本文：" + text);
    }

    public static void email(String address, String text){
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名：無題");
        System.out.println("本文：" + text);
    }

    public static void main(String[] args){
        String title = "お知らせ";
        String address = "xxx@javamail.com";
        String text = "メールアドレスを新規作成しました";

        email(title,address,text);
        email(address,text);
    }
}