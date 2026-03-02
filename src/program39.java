class program39 {
    public static void main(String[] args) {
        String str = "Java Programming Language";
        System.out.println("First occurrence of 'a': " + str.indexOf('a'));
        System.out.println("Last occurrence of 'a': " + str.lastIndexOf('a'));
        System.out.println("Contains 'Program': " + str.contains("Program"));
        System.out.println("Starts with 'Java': " + str.startsWith("Java"));
    }
}