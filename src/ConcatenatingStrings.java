public class ConcatenatingStrings {
         public static void main(String[] args) {
             //Strings concatenation with plus size
             String name = "Joyce";
             String surName = "Sabrina";
             String fullName = name + " Oliveira " + 1;
             System.out.println(fullName);
             String fullName2 = name.concat(" ").concat(surName);
             System.out.println(fullName2);
         }

    }

