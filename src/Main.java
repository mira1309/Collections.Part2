import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        task2(nums);

     //   List<String> strings = new ArrayList<>(List.of("кошка","собака", "лошадь", "коза", "корова", "кошка", "собака"));
      //  task3(strings);

        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        task4(strings);


    }
    public static void task1(List<Integer> nums){
        List<Integer> result = new ArrayList<>();
        for(Integer i : nums){
            if(i%2!=0){
                result.add(i);
            }
        }
        System.out.println(result);
    }
    public static void task2 (List<Integer> nums){
        List<Integer> filter = new ArrayList<>();
        for(Integer i : nums){
            if(i%2==0){
                filter.add(i);
            }
        }
        Set<Integer> result = new TreeSet<>(filter);
        System.out.println(result);
    }

    public static void task3 (List<String> strings){
        Set<String> unicWords = new HashSet<>(strings);
        System.out.println(unicWords);
    }
    public static void task4(List<String>strings){
        Map<String,Integer> countByWord = new HashMap<>();
        for( String str : strings ) {
            if (!countByWord.containsKey(str)) {
                countByWord.put(str, 1);
            }else {
                countByWord.put(str, countByWord.get(str) +1);
            }

        }
        System.out.println(countByWord);
    }
}