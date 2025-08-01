package Task_2;

public class StringHandling {
	public static void main(String[] args) {
        String name="Deepak";
        System.out.println("Original String: "+name);
        System.out.println("Length: "+name.length());
        System.out.println("Uppercase: "+name.toUpperCase());
        System.out.println("Lowercase: "+name.toLowerCase());
        System.out.println("Character at index 2: "+name.charAt(2));
        System.out.println("Substring (1 to 4): "+name.substring(1, 4));
    }
}
