public class Grade5{
    int marks = 85;
    void student(){
        if(marks >=91 ){
            System.out.println("Grade A+");
        }
        else if(marks >= 80 && marks<=90)
            System.out.println("Grade A");
        else if(marks >= 71 && marks<=90)
            System.out.println("Grade A");
        else if(marks >=60 && marks<=70)
            System.out.println("Grade B");
        else
            System.out.println("Grade C");

        
    }

    public static void main(String[] args){
        Grade5 g = new Grade5();
        g.student();
    }
}