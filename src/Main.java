public class Main {

    public static void main(String[] args) {
        String a = "abcdefg";
        Integer b = 100;

//        a = a + "zyxwvutvsrq";

        System.out.println("print line 1");
        System.out.println(a);

        String substringOfA = a.substring(2); //2 to a.length-1
        System.out.println("print line 2");
        System.out.println("print line 2");

        //Garbage Collector -> memory from 'a' can be released

        System.out.println("print line 2");
        System.out.println("print line 2");
        System.out.println("print line 100500");
        System.out.println(substringOfA);
        System.out.println(b);
        System.out.println("print line 100500");
        System.out.println("print line 100500");

        //Garbage Collector
    }
}
