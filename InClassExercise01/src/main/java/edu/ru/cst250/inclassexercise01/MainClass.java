package edu.ru.cst250.inclassexercise01;

public class MainClass {
   
    public static void main(String[] args){
        String myPlainText = "Attack at noon"; //this has spaces in it so you need to put a space at the end of the alphabet
        String myEncryptedText = encrypt(myPlainText, 5); //look at the encrypt function below, it 
        //coincides with this line of code
        //myPlain text is defined in this function, it is then used as an input for the encrypt function
        //the output of the encrypt function is put into the new myEncryptedText
        
        System.out.println("Plain text: " + myPlainText);
        System.out.println("Encrypted text: " + myEncryptedText);
        
    }
    
    public static String encrypt(String plainText, int key){
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz ";       
        //it would make more sense to assign this as an array but in java
        //strings are not a primitive data type so Java already thinks of strings 
        //as an array
        char currentChar;
        int currentCharPos;
        int encryptedCharPos;
        char encryptedChar;
        String encryptedText = "";
        for (int i=0; i < plainText.length(); i++) {
                //the plaintext.length() part is confusing
               currentChar = plainText.charAt(i); //the semantics of this part is a bit confusing too
               currentCharPos = alphabet.indexOf(currentChar); //visualize the nesting/logic chain
               encryptedCharPos = (currentCharPos + key) % alphabet.length(); //alphabet.length() just 
               //takes the length of what you defined
               //avoid using hard coded values and start using lines like this, because this line
               //is more flexible and will work as your code changes
               encryptedChar = alphabet.charAt(encryptedCharPos);
               
               encryptedText = encryptedText + encryptedChar;
              
            //String charAt() method returns the character at a given index of a string
    }
      return encryptedText;
    //public static string encrypt <-- this is the name of the function
    //(string plainText, int key) <-- these are the inputs into the function, think back
    //to math class and functions, how you can put many things into a function (many inputs) but you
    //only get one output
    //Java doesnt know the English alphabet so we need to define the alphabet for it and use the charAt method
}
}
