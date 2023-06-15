package day33_abstraction;

import day32_finalKyword.personTask.Person;

public final class CydeoDevStudent extends Person {

    private final String id;
    private String batchName;
    private int batchNum;

    public static final String programingLanguage;

    public CydeoDevStudent(String name, char gender, int age, String id, String batchName, int batchNum) {
        super(name, gender, age);
        if(getAge() < 18){
            System.out.println("age ca be only 18 or older");
            System.exit(1);
        }
        this.id = id;
        setBatchNum(batchNum);
        setBatchName(batchName);
    }

    static {
        programingLanguage = " java";
    }

    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public int getBatchNum() {
        return batchNum;
    }

    public void setBatchName(String batchName) {

        if(batchName.equalsIgnoreCase("zero to hero") || batchName.equalsIgnoreCase("alumni dev")) {

            this.batchName = batchName;
        }else{
            System.out.println("invalid batch name");
            System.exit(1);
        }
    }

    public void setBatchNum(int batchNum) {
        if(batchNum <= 0 ){
            System.out.println(" batch name can not me zero or negative");
            System.exit(1);

        }
        this.batchNum = batchNum;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating " + programingLanguage);
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is drinking " + programingLanguage);
    }

    @Override
    public String toString() {
        return "CydeoDevStudent{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender()+
                ", age=" + getAge()+
                "id='" + id + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchNum=" + batchNum +
                '}';
    }
}
/*

Warmup tasks:
	1. Create a sub class of Person (from day32 package) named CydeoDevStudent (final)
			Extra Variables:
				id (final), batchName, batchNumber, programmingLanguage(static & final)

			Extra conditions:
					1. Age has to be at least 18 years old
					2. batchName can ONLY be set to "Zero to Hero" or "Alumni Dev"
					3. batchNumber can not be set to zero or negative

			Override the eat() & drink() methods and include the programmingLanguage variable in methods body

			Override the toString Method and include the id, batchName, batchNumber variables
 */