// CLASS STUFF
public class FunctionPractive {
    // main function: entry point of our program
    public static void main(String[] args)
    {
       String result; 
       result = makeSentence("Saul");
       System.out.println(result);
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