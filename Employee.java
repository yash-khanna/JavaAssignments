public class Employee {

        private int id;
        private String name;
        private String designation;
        private int ssnNo;
        private int age;
        private double salary;    
        private static int idCounter = 0;
        
        private void setId(int id) 
        {
                this.id = id;
        }

        private void setName(String name)
        {
                this.name = name;
        }

        private void setDesignation(String designation)
        {
                this.designation = designation;
        }

        private void setSSNO(int ssno)
        {
                this.ssnNo = ssno;
        }

        private void setAge(int age){
                this.age = age;
        }

        private void setSalary(int salary)
        {
                this.salary = salary;
        }

        public int getId()
        {
                return this.id;
        }

        public String getName()
        {
                return this.name;
        }

        public String getDesignation()
        {
                return this.designation;
        }

        public int getSSNO()
        {
                return this.ssnNo;
        }

        public double getSalary()
        {
                return this.salary;
        }

        public static double getIdCounter()
        {
                return idCounter;
        }

        public Employee(String name, String designation, int ssnNo, int age, double salary)
        {
                this.name = name;
                this.designation = designation;
                this.ssnNo = ssnNo;
                this.age = age;
                this.salary = salary;
                this.idCounter++;
                this.id = this.idCounter;
        }
}
