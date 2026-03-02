//Write a program to demonstrate string ending and splitting operations,
//including checking whether a string ends with a given word, verifying whether the string
//is empty, finding the length of the string, and splitting the string into words.
class program41 {
    public static void main(String[] args) {
        String str = "studying in cse";
        System.out.println("Ends with 'easy': " + str.endsWith("cse"));
        System.out.println("Is empty: " + str.isEmpty());
        System.out.println("Length: " + str.length());
        String[] words = str.split(" ");
        System.out.println("Words in the string:");
        for(String w : words) {
            System.out.println(w);
        }
    }
}