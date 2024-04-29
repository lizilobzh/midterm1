package midterm.lizi_lobzhanidze_3.task1;

import java.util.List;

public class Fantasy extends AbstractFantasy implements Dream {
    private String studentName;

    public Fantasy(String studentName) {
        this.studentName = "Lizi Lobzhanidze";
    }

    @Override
    public String toString() {
        return "Fantasy: " + studentName;
    }

    @Override
    public String getTackle1() {
        // Implement the method to return a string representing tackle
        return "Fantasy Tackle";
    }

    @Override
    public String getWine2() {
        // Implement the method to return a string representing wine
        return "Fantasy Wine";
    }

    @Override
    public String methodSort3(String argRouter5) {
        // Implement the method to sort the argument and return the result
        return "Sorted: " + argRouter5;
    }

    @Override
    public List<String> methodBubble4(String argSales6) {
        // Implement the method to perform bubble sort on the argument and return the result
        // Here, you need to implement the bubble sort algorithm
        return null; // For illustration, returning null, replace with actual implementation
    }
}


