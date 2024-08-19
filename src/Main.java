public class Main {
    public static void main(String[] args) {
        StudentManagerImpl studentManager = new StudentManagerImpl();

        studentManager.addStudent(new Student(1, "Diego", 22));
        studentManager.addStudent(new Student(2, "David", 19));
        studentManager.addStudent(new Student(3, "Juan", 23));

        System.out.println("Todos los estudiantes:");
        studentManager.getAllStudents().forEach(System.out::println);

        System.out.println("\nEstudiantes mayores a 18 años:");
        studentManager.getStudentsOlderThan(18).forEach(System.out::println);

        System.out.println("\nSEstudiantes ordenados por nombre:");
        studentManager.getSortedStudentsByName().forEach(System.out::println);

        try {
            Student student = studentManager.findStudent(2);
            System.out.println("\nEncontrar estudiante: " + student);
            studentManager.removeStudent(2);
            System.out.println("Estudiante con id eliminado");
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nEstudiantes luego de ser removidos:");
        studentManager.getAllStudents().forEach(System.out::println);
    }
}
