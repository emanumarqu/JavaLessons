// CLASS STUFF
public class FunctionPractive {
    // main function: entry point of our program
    public static void main(String[] args)
    {
       String result; 
       result = makeSentence("Saul");
       System.out.println(result);
    }

    public static void age(int a)
    {
        if (a < 0){
            System.out.println("Are you sure?");
        }
        else if (a < 18) {
            System.out.println(a + ", you are a student!");
        }
        else {
            System.out.println(a + ", you are a mentor!");
        }
    }

    // String function     
    public static String makeSentence(String name)
    {
        // make sentence
        String sentence;
        sentence = name + " love team 597!";
        // return completed sentence
        return sentence;
    }
    // void function
    public static void areaRect(double  w, double l){
        // calcuate square area 
        double area;
        area = l * w;
        System.out.println("Area: " + area);
    }
}