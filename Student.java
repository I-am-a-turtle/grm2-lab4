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
    info = info + "The student's SU box is " + getSU() + ".\n";
    if (getPersonal() < 0){
      info = info + "The student does not have a home or cell phone number on file.\n";
    }else{
      info = info + "The student's home or cell phone number is " + getPersonal() + ".\n";
    }
    return info;
  }

  public static void main(String[] args){
    Student test = new Student();
    test.addName("Kallistrate Giandeftra");
    //System.out.println(test.getName());
    test.addAddress("Vanostravis 3");
    //System.out.println(test.getAddress());
    test.addSU("1995");
    //System.out.println(test.getSU());
    test.addPersonal("2032454744");
    //System.out.println(test.getPersonal());

    System.out.println(test.toString());
  }
}
