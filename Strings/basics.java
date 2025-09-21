public class basics {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str);
        //  using string methods
        String  str1 = new String("using string new method ");
        System.out.println(str1);
        //methods 
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(1));
        System.out.println(str.indexOf("o"));
        System.out.println(str.substring(0,5)); 
        System.out.println(str.replace("H","J"));
        System.out.println(str.contains("World"));
        System.out.println(str.equals("Hello, World!"));
        System.out.println(str.isEmpty());
        System.out.println(str.trim());     
        




    }
}