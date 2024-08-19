import java.util.List;
import java.util.stream.Collectors;

public class StudentManagerImpl implements StudentManager {
    private GenericList<Student> studentList = new GenericList<>();

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void removeStudent(int id) throws StudentNotFoundException {
        Student student = findStudent(id);
        studentList.remove(student);
    }

    @Override
    public Student findStudent(int id) throws StudentNotFoundException {
        for (Student student : studentList.getAll()) {
            if (student.getId() == id) {
                return student;
            }
        }
        throw new StudentNotFoundException("Student with id " + id + " not found");
    }

    @Override
    public List<Student> getAllStudents() {
        return studentList.getAll();
    }

    public List<Student> getStudentsOlderThan(int age) {
        return studentList.getAll().stream()
                .filter(student -> student.getAge() > age)
                .collect(Collectors.toList());
    }

    public List<Student> getSortedStudentsByName() {
        return studentList.getAll().stream()
                .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
                .collect(Collectors.toList());
    }
}
