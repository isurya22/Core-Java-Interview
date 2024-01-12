package InterviewAsked;

public class AgeNotValidException  extends  Exception{
    AgeNotValidException(String message){
        super(message);
    }
}

class CheckAge{
    public int checkAge(int age) throws AgeNotValidException{
        if(age>18){
            System.out.println("It will valid for vote");
        } else
            throw new AgeNotValidException("Age will require 18+ !!!!");
        return age;
    }

    public static void main(String[] args) throws AgeNotValidException {
        CheckAge enterAge = new CheckAge();
        enterAge.checkAge(29);
    }
}
