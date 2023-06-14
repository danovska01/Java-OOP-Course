package _01_Abstraction.studentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> studentsRepository;

    public StudentSystem() {
        this.studentsRepository = new HashMap<>();
    }

    public Map<String, Student> getStudentsRepository() {
        return this.studentsRepository;
    }

    public void ParseCommand(String[]input) {

       String command = input[0];

        switch (command) {
            case "Create" -> {
                createStudent(input);
                break;
            }
            case "Show" -> {
                showStudentName(input);
                break;
            }
        }
    }

    private void showStudentName(String[] input) {
        String name = input[1];
        if (studentsRepository.containsKey(name)) {
            Student student = studentsRepository.get(name);
            System.out.println(student.toString(name));
        }
    }



    private void createStudent(String[] input) {
        String name = input[1];
        int age = Integer.parseInt(input[2]);
        double grade = Double.parseDouble(input[3]);

        if (!studentsRepository.containsKey(name)) {
            Student student = new Student(name, age, grade);
            studentsRepository.put(name, student);
        }
    }
}
