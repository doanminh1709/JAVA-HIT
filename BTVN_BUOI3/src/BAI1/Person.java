package BAI1;
public class Person {
    private String name;
    private int age;
    private String gender;
    private String hobby;
    
   public Person(){
       
   }
   public Person(String name , int age , String gender , String hobby){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.hobby = hobby;
  }
   public String getName(){
       return name;
   }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
     public String getGender(){
        return gender;
    }
     public void setGender(String gender){
        this.gender = gender;
    }
     //setter dung de truy cap  vao cac thuoc tinh cua doi tuong va gan gia tri cho cac
     //thuoc tinh cua doi tuong 
     //nguoc lai voi setter , getter cung truy cap vao cac thuoc tinh cua doi tuong nhung no se tra ve cac thuoc tinh cua doi tuong 
     public String getHobby(){
        return hobby;
    }
     public void setHobby(String hobby){
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' +  " ,age= '" +
        age + '\'' + ",gender = '"+ gender + '\'' + ",hobby= '"+ hobby + '}';
    }
     
}
