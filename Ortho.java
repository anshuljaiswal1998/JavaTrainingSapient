public class Ortho extends Doctor{

    @Override
    public void treatPatient() {
        conductCTScan();
        conductXRay();
    }

    public void conductXRay(){
        System.out.println("Perform X Ray...");
    }

    public void conductCTScan(){
        System.out.println("Perform CT Scan...");
    }
}