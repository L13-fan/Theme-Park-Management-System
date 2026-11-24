public class Staff {
    private final String id;
    private final String name;
    private final int age;
    private final String position;
    private final String department;
    private final int workYears;

    public Staff(String id, String name, int age, String position, String department, int workYears){
        if (id == null || !(id.matches("[0-9]+"))){
            throw new IllegalArgumentException("ID必须由数字组成");
        }
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("name不能为空或null");
        }
        if (age <= 0){
            throw new IllegalArgumentException("age必须大于0");
        }
        if (position == null || position.isBlank()){
            throw new IllegalArgumentException("position不能为空或null");
        }
        if (department == null || department.isBlank()){
            throw new IllegalArgumentException("department不能为空或null");
        }
        if (workYears < 0){
            throw new IllegalArgumentException("Work years 必须大于等于0");
        }

        this.id = id;
        this.name = name;
        this.age = age;
        this.position = position;
        this.department = department;
        this.workYears = workYears;
    }

    public String getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getPosition(){
        return position;
    }

    public String getDepartment(){
        return department;
    }

    public int getWorkYears(){
        return workYears;
    }

    @Override
    public String toString(){
        return "ID: " + id
                + "\nName: " + name
                + "\nAge: " + age
                + "\nPosition: " + position
                + "\nDepartment: " + department
                + "\nWork Years: " + workYears;
    }
}
