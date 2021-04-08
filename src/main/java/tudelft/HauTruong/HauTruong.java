package tudelft.HauTruong;

public class HauTruong {
    private String fullName = "Hau Truong";
    private String firstName = "Hau";
    private String lastName = "Truong";
    private String uciNetId = "hauqt";
    private int studentNumber = 30027023;

    public String getFullName(){
        return fullName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getUCInetID(){
        return uciNetId;
    }

    public int getStudentNumber(){
        return studentNumber;
    }

    public String getRotatedFullName(int shift){
        int val = 0;
        if(shift >= 0){
            val = shift;
        }
        else{
            val = fullName.length() + shift;
        }

        String x = fullName.substring(val);
        String y = fullName.substring(0, val);

        return x+y;
    }
}
