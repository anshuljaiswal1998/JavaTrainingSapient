public class DoctorClient {
    public static void main(String[] args) {
        // Parent Class
        // Doctor d1 = new Doctor();
        // d1.treatPatient();

        // Child Class
        Ortho o1 = new Ortho();
        o1.conductCTScan();

        Doctor d2 = new Ortho();
        d2.treatPatient();

        Doctor d3 = new Dentist();
        d3.treatPatient();
        

    }
}