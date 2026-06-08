package entities;

public class ExerciseNumbers {

    private int[] numbers;
    public ExerciseNumbers(int[] numbers) {
        this.numbers = numbers;
    }
    public int[] getNumbers() {
        return numbers;
    }
    public void setValue(int position, int value) {
        numbers[position] = value;
    }
}