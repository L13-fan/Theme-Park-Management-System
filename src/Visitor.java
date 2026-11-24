public class Visitor implements Comparable<Visitor>{
    private final String id;
    private final String name;
    private final int age;
    private final String ticketType;

    public Visitor(String id, String name, int age, String ticketType){
        if (id == null || !id.matches("[0-9]+")){
            throw new IllegalArgumentException("ID必须大于0");
        }
        if (age <= 0){
            throw new IllegalArgumentException("年龄必须大于0");
        }
        if ((name == null) || (name.isBlank())){
            throw new IllegalArgumentException("姓名不能为空");
        }
        if ((ticketType == null) || (ticketType.isBlank())){
            throw new IllegalArgumentException("票种不能为空");
        }
        this.id = id;
        this.name = name;
        this.age = age;
        this.ticketType = ticketType;
    }

    public Visitor(String id, String name, int age){
        this(id, name, age, "Standard Ticket");
    }

    @Override
    public boolean equals(Object object){
        if (this== object){
            return true;
        }
        else if (!(object instanceof Visitor)){
            return false;
        } 
        Visitor other = (Visitor) object; 
        return this.getId().equals(other.getId());
    }

    @Override
    public int hashCode(){
        return id.hashCode();
    }

    @Override
    public int compareTo(Visitor other) {
        return Integer.compare(this.getAge(), other.getAge());
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

    public String getTicketType(){
        return ticketType;
    }

    @Override
    public String toString(){
        return "ID: " + id + "\nName: " + name + "\nAge: " + age + "\n Ticket Type: " + ticketType;
    }
}
