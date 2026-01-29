import java.util.*;
import java.util.stream.*;

class PersonAge_w2 {
    String name;
    int age;

    PersonAge_w2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    
    static boolean isOlderThan(PersonAge_w2 p, int limit) {
        return p.age > limit;
    }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = java.lang.Integer.parseInt(sc.nextLine());
        List<PersonAge_w2> people = new ArrayList<>();

  
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            String[] parts = line.split("\\s+");
            String name = parts[0];
            int age = java.lang.Integer.parseInt(parts[1]);
            people.add(new PersonAge_w2(name, age));
        }

        int ageLimit = java.lang.Integer.parseInt(sc.nextLine());

       
        List<String> sortedNames = people.stream()
                .sorted(Comparator.comparing(PersonAge_w2::getName))
                .map(PersonAge_w2::getName)
                .collect(Collectors.toList());

   
        List<String> olderNames = people.stream()
                .filter(p -> PersonAge_w2.isOlderThan(p, ageLimit))
                .map(PersonAge_w2::getName)
                .collect(Collectors.toList());


        List<String> upperNames = people.stream()
                .map(PersonAge_w2::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

     
        System.out.println(String.join(" ", sortedNames));
        System.out.println(String.join(" ", olderNames));
        System.out.println(String.join(" ", upperNames));
    }
}