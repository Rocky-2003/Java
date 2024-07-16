class manager {

  public int bonus() {
    return 200;
  }
}

class employee extends manager {
  @Override
  public int bonus() {
    return 5000;
  }
}

class developer extends employee {
  @Override
  public int bonus() {
    return 20000;
  }
}

/**
 * Index
 */
public class Index {
  public static void main(String[] args) {
  
    manager m = new manager();
    employee e = new employee();
    developer d = new developer();

    System.out.println(m.bonus());
    System.out.println(e.bonus());
    System.out.println(d.bonus());
 }
}