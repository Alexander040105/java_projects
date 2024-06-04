public class WhileLoopSequence {
    public static void main(String[] args){
        int numberToBeSquared = 5;
        int iteration = 1;
        System.out.println("Sequence nos. \t \tSquared");

        while(iteration <= numberToBeSquared){
            int squareResult = iteration * iteration;
            System.out.println(iteration + "\t \t \t" + squareResult);
            iteration++;
        }
    }
}
