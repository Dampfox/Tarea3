public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super("Estudiante no encontrado");
    }
}
