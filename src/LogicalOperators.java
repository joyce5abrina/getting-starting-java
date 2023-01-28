public class LogicalOperators {

    public static void main(String[] args) {
        // allows us to combine multiple of boolean expressions;
        boolean isAdult = false;
        boolean isStudent = false;
        boolean isAmigoscodeMember = true;
        System.out.println(isAdult  &&  isStudent); //&& and -> when its the same (true and true or false and false, will be true);
        System.out.println((isAdult || isStudent)); // || or -> when at least one it is true will be true;
        System.out.println((isAdult || isStudent) &&
                isAmigoscodeMember); // it will be true because it have same value and the && (and) it is true;


        // how to flip the actual value
        System.out.println((!isAdult || isStudent) && isAmigoscodeMember); // ! not -> flip the value
        System.out.println((!isAdult|| isStudent) && !isAmigoscodeMember);

        System.out.println(isAdult);
        System.out.println(!isAdult);

        System.out.println(10 > 8 || 2 <=2);


    }
}
