package Suskkoo;
class CombineExample {

    static void validate(int marks) throws Exception {
        if (marks < 0 || marks > 100) {
            // throwing checked exception
            throw new Exception("Invalid marks");
        } else {
            System.out.println("Valid marks: " + marks);
        }
    }
    
    static void validte(int marks) throws Exception {
        if (marks < 0 || marks > 100) {
            // throwing checked exception
            throw new Exception("Invalid marks");
        } else {
            System.out.println("Valid marks: " + marks);
        }
    }


    public static void main(String[] args) {
        try {
            validate(19);
            validte(120);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
