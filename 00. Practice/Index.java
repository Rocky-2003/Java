class Employee {
   public int bonus() {
        return 500;
    }

}

class Programmer extends Employee {

  public  int bonus() {
        return 1000;
    }

}

class Manager extends Employee {

  public  int bonus() {
        return 2000;
    }

}

class Index {
    public static void main(String[] args) {
        Employee p = new Programmer();
        Manager m = new Manager();

        // System.out.println("Employe's Bonus : " + p.super.bonus());
        System.out.println("Employe's Bonus : " + m.bonus());
        System.out.println("Programmer's Bonus : " + p.bonus());
        System.out.println("Manager's Bonus : " + m.bonus());
    }
}