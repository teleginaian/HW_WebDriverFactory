package main;

import java.util.Objects;

public class Cat extends Animals implements Climb{
   private String name;
   private Integer age;
   //static Integer size=9;

     void speak(){
     System.out.println("мау");
   }

     public void walk(){
         System.out.println("иду");
     }

    void speak(String x){
        System.out.println("мау "+x);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return name.equals(cat.name) && age.equals(cat.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
