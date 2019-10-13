public class StringBuilderClass {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Lorem")
                .append(" ipsum")
                .append(" dolor")
                .append(" sit")
                .append(" amet,")
                .append(" consectetur")
                .append(" adipiscing")
                .append(" elit.");

        String createdString = new String(stringBuilder);

        System.out.println(createdString);
    }


}
