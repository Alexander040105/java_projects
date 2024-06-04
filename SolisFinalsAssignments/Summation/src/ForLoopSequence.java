public class ForLoopSequence {
    public static void main(String[] args){
        int numberToBeSquared = 5;

        System.out.println("Sequence nos. \t \tSquared");

        for(int iteration = 1; iteration <= numberToBeSquared; iteration++){
            int squareResult = iteration * iteration;
            System.out.println(iteration + "\t \t \t" + squareResult);
        }
    }
}
