public class People {
    String name;
    String surname;
    short age;
    String university;
    short examResult;

    People(String Myname, String Mysurname, short MyexamResult)
    {
        name = Myname;
        surname = Mysurname;
        examResult = MyexamResult;
    }

    void display()
    {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(university);
        System.out.println(age);
        System.out.println(examResult);
    }
    void showExamResultWithAlphabet()
    {
        String alphabetGrade = getAlphabetGrade(examResult);
        System.out.println(name + " " + surname + " you passed exam with " + alphabetGrade);
    }
    String getAlphabetGrade(int score )
    {
        if(score >= 91)
            return "A";
        else if(score >= 81 && score < 91)
            return "B";
        else if( score >= 71 && score < 81)
            return "C";
        else if( score >= 61 && score < 71 )
            return "D";
        else if( score >= 51 && score < 61 )
            return "E";
        else
            return "F";
    }



}
