package stacks;

public class StackDemonstration implements Stack {

    int count;
    String[] arr = new String[10];

    public static void main(String[] args) throws Exception {
        StackDemonstration test = new StackDemonstration();

        test.push("Hugh-Martin");
        test.push("Justin");
        test.push("Tyler");
        test.push("Kevin");

        for (int i = 0; i < 4; i++) {
            System.out.println("Removing " + test.pop() + " from stack");
        }
    }

    @Override
    public void push(String val) throws Exception {

        if (count == arr.length) {
            throw new Exception();
        } else {
            arr[count] = val;
            System.out.println("Added " + val + " to the stack");
            count++;
        }
    }

    @Override
    public String pop() throws Exception {

        if (count == 0) {
            throw new Exception();
        } else {
            String result = arr[--count];
            arr[count] = "";
            return result;
        }
    }

    @Override
    public String peek() throws Exception {

        if (count == 0) {
            throw new Exception();
        } else {
            return arr[count - 1];
        }
    }
}
