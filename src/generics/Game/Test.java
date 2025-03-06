package generics.Game;

public class Test {
    public static void main(String[] args) {
        Schoolar s1 = new Schoolar("Konstantin", 13);
        Schoolar s2 = new Schoolar("Daria", 14);
        Schoolar s3 = new Schoolar("Sergey", 12);
        Schoolar s4 = new Schoolar("Maria", 14);

        Student st1 = new Student("Ivan", 19);
        Student st2 = new Student("Vasiliy", 21);

        Employee emp1 = new Employee("Pavel", 34);
        Employee emp2 = new Employee("Elena", 42);

        Team<Schoolar> schoolarTeam = new Team<>("Dragons");
        schoolarTeam.addNewParticipant(s1);
        schoolarTeam.addNewParticipant(s2);

        Team<Schoolar> schoolarTeam2 = new Team<>("Wizards");
        schoolarTeam2.addNewParticipant(s3);
        schoolarTeam2.addNewParticipant(s4);


        Team<Student> studentTeam = new Team<>("Just do it");
        studentTeam.addNewParticipant(st1);
        studentTeam.addNewParticipant(st2);

        Team<Employee> employeeTeam = new Team<>("Rabotyagi");
        employeeTeam.addNewParticipant(emp1);
        employeeTeam.addNewParticipant(emp2);

        schoolarTeam2.playWith(schoolarTeam);
    }

}
