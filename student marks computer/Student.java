public class Student()
private String name;
{
    String name = new String();
    name = "Adrian Seceleanu";
    int total = 0;
    char mean;

    public String getName()
    {
        return name;
    }

    public int addExam(int mark)
    {
        int total = 0;
        return (total+mark);
    }

    public int getTotal()
    {
        return this.total;
    }
    public char getMeanMark()
    {
        if(this.mark==10)
            return 'A';
        else if(this.mark==9)
            return 'B';
        else if(this.mark==8)
            return 'C';
        else if(this.mark==7)
            return 'D';
        else if(this.mark==6)
            return 'E';
        else if(this.mark==5)
            return 'F';
    }
}