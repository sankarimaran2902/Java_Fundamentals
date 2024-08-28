package Fundamentals.Constructor;
public class Parameter_Constructor
{
        int rollno;
        String name;
        String name1;
        double CGPA;
        static int age;
        public Parameter_Constructor(String name,String name1,int rollno,double CGPA,int age)
        {
            System.out.println(CGPA);
            this.name=name;
            this.name1=name1;
            this.  rollno=rollno;
            this. CGPA=CGPA;
            this. age=age;
            System.out.println("Name is"+name+""+"Name is:"+name1+""+rollno+""+CGPA+""+age);


        }
        public  void print()
        {
            System.out.println("Name is"+name+""+"Name is:"+name1+""+rollno+""+CGPA+""+age);
        }

        public static void main(String[] args) {
            Parameter_Constructor pc=new Parameter_Constructor("preethi","Sivasankari",501,9.5,22);
            pc.print();
        }
    }

