public class ConcurrentModificationExceptionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

        for (String str : list) {
            if (str.equals("B")) {
                list.remove(str);
            }
        }
        System.out.println(list);
    }
}