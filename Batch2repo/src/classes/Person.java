package classes;

/**
 * Created by JPMPC-B211 on 11/10/2016.
 */
public abstract class Person
{
    public String name,email;
    public int age;
    public float weight,height; /*weight in kgs   height in cm*/
    public boolean gender; /*true = male, false = female*/

//    Person(){ }


    public String Person(String nickName){return name; }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public float getWeight()
    {
        return weight;
    }

    public void setWeight(float weight)
    {
        this.weight = weight;
    }

    public float getHeight()
    {
        return height;
    }

    public void setHeight(float height)
    {
        this.height = height;
    }

    public boolean isGender()
    {
        return gender;
    }

    public void setGender(boolean gender)
    {
        this.gender = gender;
    }

    public String introduceYourSelf(){return this.name;}

    public String introduceYourself(String eName, String department, String address) {return eName +department +address;}

}
