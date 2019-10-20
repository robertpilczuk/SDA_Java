package task2;

public class RandomCharCount {

    public static void main(String[] args) {
        String text = "nteger tincidunt nibh quis lorem consectetur consequat. Donec ornare mauris neque, at dapibus leo imperdiet nec. Pellentesque pharetra nisl nec quam suscipit faucibus. Etiam quis ligula lacinia, venenatis nulla egestas, commodo lacus. Nullam pulvinar dapibus aliquet. Sed turpis ipsum, rutrum non erat non, sollicitudin lobortis tellus. Nullam finibus massa et tristique iaculis. Pellentesque lorem augue, mollis eget lacus a, elementum lobortis enim. Nunc finibus, nunc eu sagittis pellentesque, erat lorem egestas diam, sit amet tristique eros justo non neque. Etiam vitae semper orc";

        CountLastChar2 charCount = new CountLastChar2(text);
        System.out.println(charCount.countLastChar());

    }


}
