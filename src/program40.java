//Write a program to demonstrate string modification operations such as
//replacing characters, extracting a substring, concatenating strings, and removing extra
//spaces from the string.
class program40 {
    public static void main(String[] args) {
        String str = "  Amity University  ";
        System.out.println("Original String: '" + str + "'");
        System.out.println("After replace: " + str.replace("University", "Collage"));
        System.out.println("Substring (2 to 7): " + str.substring(2, 7));
        System.out.println("Concatenation: " + str.concat("Noida"));
        System.out.println("After trim: '" + str.trim() + "'");
    }
}