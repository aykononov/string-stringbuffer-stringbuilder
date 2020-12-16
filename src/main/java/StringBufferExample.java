public class StringBufferExample {

    public static void main(String[] args) {
        String numbers = "0123456789";
        StringBuffer sb = new StringBuffer(numbers);

        System.out.println(sb.substring(3));
        // 3456789

        System.out.println(sb.substring(4, 8));
        // 4567

        System.out.println(sb.replace(3, 5, "ABCDE"));
        // 012ABCDE56789

        sb = new StringBuffer(numbers);
        System.out.println(sb.reverse());
        // 9876543210

        sb.reverse();
        // Вернем изначальный порядок

        sb = new StringBuffer(numbers);
        System.out.println(sb.delete(5, 9));
        // 012349

        System.out.println(sb.deleteCharAt(1));
        // 02349

        System.out.println(sb.insert(1, "One"));
        // 0One2349

    }
}
