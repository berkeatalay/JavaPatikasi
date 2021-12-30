public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary,int workHours,int hireYear){
        this.name = name;
        this.salary =salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if (this.salary <1000)  return 0;
        return (this.salary*0.03);
    }

    double bonus(){
        if(workHours<40) return 0;
        return ((workHours-40)*30);
    }

    double raise(){
        int workingYear = 2021-this.hireYear;
        if (workingYear<10){
            return this.salary*0.05;
        } else if (workingYear<20){
            return this.salary*0.1;
        } else {
            return this.salary*0.15;
        }
    }

    public String toString(){
        System.out.println("Name: " +this.name);
        System.out.println("Salary: " +this.salary);
        System.out.println("Working Hours: " +this.workHours);
        System.out.println("Hire Year: " +this.hireYear);
        System.out.println("Tax: " +this.tax());
        System.out.println("Bonus: " +this.bonus());
        System.out.println("Raise: " +this.raise());
        System.out.println("Salary with Tax and bonus: " + (this.salary+this.bonus()-this.tax()));
        System.out.println("Total Salary: " + (this.salary+this.raise()));
        return null;
    }
}
