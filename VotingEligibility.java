import java.util.Scanner;
class NotEligible extends Exception {
    int age;
    NotEligible(int age) {
        this.age = age;
    }
    public String toString() {
        return "Age " + age + " is not eligible for voting";
    }
}
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new NotEligible(age);   // ❌ exception
            } 
            else {
                System.out.println("Eligible for voting");
            }
        } 
        catch (NotEligible ne) {
            System.out.println(ne);
        } 
        finally {
        	sc.close();
            System.out.println("Exiting!!");
        }
    }
}
