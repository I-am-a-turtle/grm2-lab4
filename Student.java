/*
Will Fung (W 7pm) and Grace Mazzarella (W 1pm)
*/

public class Student {
  protected String name = "";
  protected String address = "";
  protected Long campusPhone = new Long(0);
  protected Integer suBox = new Integer(0);
  protected Long personalPhone = new Long(0);

  public Student(){
    this.name = name;
    this.address = address;
    this.campusPhone = campusPhone;
    this.suBox = suBox;
    this.personalPhone = personalPhone;
  }

  public void addName(String args){
    this.name = args;
  }

  public String getName(){
    return this.name;
  }

  public void addAddress(String args){
    this.address = args;
  }

  public String getAddress(){
    return this.address;
  }

  public void addCampus(String args){
    this.campusPhone = Long.valueOf(args);
  }

  public Long getCampus(){
    return this.campusPhone;
  }

  public void addSU(String args){
    this.suBox = Integer.valueOf(args);
  }

  public Integer getSU(){
    return this.suBox;
  }

  public void addPersonal(String args){
    this.personalPhone = Long.valueOf(args);
  }

  public Long getPersonal(){
    return this.personalPhone;
  }

  // Be sure to include a toString method here.
  public String toString() {
    String info = "The student's name is " + getName() + ".\n";
    info = info + "The student's address is " + getAddress() + ".\n";
    info = info + "The student's campus phone number is " + getCampus() + ".\n";
    info = info + "The student's SU box is " + getSU() + ".\n";
    info = info + "The student's home or cell phone number is " + getPersonal() + ".";
    return info;
  }

  public static void main(String[] args){
    Student test = new Student();
    test.addName("Kallistrate Giandeftra");
    //System.out.println(test.getName());
    test.addAddress("Vanostravis 3");
    //System.out.println(test.getAddress());
    test.addCampus("9876543210");
    //System.out.println(test.getCampus());
    test.addSU("1995");
    //System.out.println(test.getSU());
    test.addPersonal("2032454744");
    //System.out.println(test.getPersonal());

    System.out.println(test.toString());

    System.out.println("Alison Wong".compareTo("Alison Wang"));
  }
}
