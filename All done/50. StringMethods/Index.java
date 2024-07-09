class Index{
  public static void main(String[] arg) {
    // !String methods in java

    String s = "RockyMor";
    String s1 = "Shab";

    // Length()
    System.out.println(s.length());

    // charAt()
    System.out.println(s.charAt(5));

    // substring()
    System.out.println(s.substring(5));
    
    // substring(start, end)
    System.out.println(s.substring(5, 8));

    // concat()
    System.out.println(s.concat(s1));

    // indexOf()
    System.out.println(s.indexOf(s1, 0));

    // lastIndexOf()
    System.out.println(s.lastIndexOf("o"));

    // equals()
    System.out.println(s.equals(s1));

    // equalIgnoreCase()
    System.out.println(s.equalsIgnoreCase(s1));

    // comapreTo()
    System.out.println(s.compareTo(s1));


    // toLowerCase()
    System.out.println(s.toLowerCase());

    // toUpperCase()
    System.out.println(s.toUpperCase());

    // trim()
    System.out.println(s.trim());

    // replace()
    System.out.println(s.replace("o", "r"));

  




  

  }
}