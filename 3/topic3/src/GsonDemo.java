

import com.google.gson.Gson;

import person.Person;

public class GsonDemo {
    public static void main(String[] args) {
        String json = "{\"name\":\"bobby\",\"age\":43}";
        Gson gson = new Gson();
        Person p = gson.fromJson(json, Person.class);
        System.out.println(p);
    }
    

}

// [ { name:"bobby",age:43,address:{ ... },emails:[] },
//   { name:"jane",age:46,address:{ ... } },
//  ... ]
