package realtimequery;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static <T> Set<T> findDuplicateBySetAdd(List<T> numberList){
        Set<T> items = new HashSet<>();
        return numberList.stream()
                .filter(n -> !items.add(n)) // Set.add() returns false if the element was already in the set.
                .collect(Collectors.toSet());
    }
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        for(Employee e : employeeList){
            System.out.println(e.getId()+ " : "+ e.getName()+ " : "+ e.getAge()+" : "+ e.getGender()+" : "+ e.getDepartment()+" : "+e.getYearOfJoining()+" : "+e.getSalary());
        }

       //how many male and female employee in this orgnization

       Map<String,Long> noOfEmployeeMaleFemale = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(noOfEmployeeMaleFemale);
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        

        employeeList.forEach((s9)-> System.out.println(s9));

        System.out.println(":::::::::::::::::::::::::::::::");
        Comparator<Employee> byName=Comparator.comparing(Employee::getName);
        Collections.sort(employeeList, byName);
        System.out.println(employeeList);



        System.out.println("?????????????????????????????????g");
        List<Employee> sortedList = employeeList.stream()
                .sorted(Comparator.comparingInt(Employee::getId))
                .collect(Collectors.toList());
        System.out.println("-----------------------");

        sortedList.forEach(System.out::println);

        System.out.println("+========================");

        employeeList.stream().forEach(System.out::println);

        System.out.println("''''''''''''''''");
        Stream<Employee> stream = employeeList.stream();
             stream.forEach(System.out::println);

        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        Map<String, Integer> map = new HashMap<>();
        map.put("Aman", 19);
        map.put("Sunny", 29);
        map.put("Ritesh", 39);
        map.forEach((key, val) -> System.out.println(key+" ::"+val));

        for ( Map.Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey();
            Integer id = entry.getValue();

            System.out.println(name + " : "+ id);
            // do something with key and/or tab
        }


        for(Map.Entry<String ,Integer> entry: map.entrySet()){
            String name= entry.getKey();
            Integer id = entry.getValue();
            System.out.println(id+" "+name);
        }





        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("apple");


        for(int i=0; i< fruits.size();i++){
            System.out.println(fruits.get(i));
        }
        fruits.forEach((val)-> System.out.println(val));
        fruits.stream().forEach(System.out::println);
        fruits.stream().forEachOrdered(System.out::println);
        fruits.parallelStream().forEach(System.out::println);
        fruits.parallelStream().forEachOrdered(System.out::println);

        String s = "Krishna";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());

        String s1 = "Hi This is Krishna Gupta";
        String strRev = "";
        for(int i = s1.length()-1;i>=0;--i){
            strRev += s1.charAt(i);
        }
        System.out.println(strRev);

        Addable withLambda = (int a,int b)->(a+b);
       int result = withLambda.add(20,50);
        System.out.println(result);

        List<Integer> numberList = Arrays.asList(1,2,3,4,5,5,5,5,6,7,7,8);
        Set<Integer> res = findDuplicateBySetAdd(numberList);
        res.forEach(System.out::println);



        List<Integer> list3 = Arrays.asList(1,1,1,2,3,5,5,4);
       // list3.stream().forEach(l-> System.out.println(l));
        Set<Integer> set3 = new LinkedHashSet<Integer>(list3);
//        Set<Integer> num = set3.stream().collect(Collectors.toSet());
//        System.out.println(num);
        set3.forEach(System.out::println);



        List<Integer> even = Arrays.asList(2,4,6);
        List<Integer> odd = Arrays.asList(3,5,7);
        List<Integer> prime = Arrays.asList(2,3,5,7,11);
        List<Integer> numbers = Stream.of(even,odd,prime).flatMap(list->list.stream()).collect(Collectors.toList());
        System.out.println("Flatted List : "+numbers);


        // How many male and female employees are there in the organization
        Map<String,Long> noOfMaleAndFemaleEmployee = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(noOfMaleAndFemaleEmployee);


        employeeList.stream().map(Employee::getGender).distinct().forEach(System.out::println);
        // name of all departments in the organization
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        //average age of male and female employees
        Map<String,Double> avgAgeOfMaleAndFemaleEmployee = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
        System.out.println(avgAgeOfMaleAndFemaleEmployee);

        //Get the details of highest paid employee in the organization?
        Optional<Employee> highestPaidEmployeeWrapper = employeeList.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
       Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();
        System.out.println("Details Of Highest Paid Employee");
        System.out.println("=========================================================================");
        System.out.println("id = :  "+highestPaidEmployee.getId());
        System.out.println("Name = :"+highestPaidEmployee.getName());
        System.out.println("Sal = : "+highestPaidEmployee.getSalary());
        System.out.println("Age = :"+highestPaidEmployee.getAge());
        System.out.println("Gender = : "+highestPaidEmployee.getGender());
        System.out.println("Year Of Joining = :"+highestPaidEmployee.getYearOfJoining());


        employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge));
        //names of all employees who have joined after 2015?
        employeeList.stream().filter(e->e.getYearOfJoining()>2015).map(Employee::getName).forEach(System.out::println);

        //Count the number of employees in each department?
        Map<String,Long> employeeCountByDepartment = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        Set<Map.Entry<String,Long>>  entrySet = employeeCountByDepartment.entrySet();
        for (Map.Entry<String,Long> entry:entrySet){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

        //average salary of each department?

        Map<String,Double> averageSalaryOfEachDept = employeeList.stream().collect(Collectors
                .groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        Set<Map.Entry<String,Double>> entrySet1 = averageSalaryOfEachDept.entrySet();
        for (Map.Entry<String,Double> entry1:entrySet1){
            System.out.println(entry1.getKey()+" : "+entry1.getValue());
        }
        Map<String,Double> averageSalOfMaleAndFemaleEmployee = employeeList.stream().collect(Collectors
                .groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(averageSalOfMaleAndFemaleEmployee);

        //List down the names of all employees in each department?


    }

}
