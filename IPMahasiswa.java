import java.util.scanner;
public class IPMahasiswa {
  
    public IPMahasiswa() {
    }
 
    public static void main(String[] args) {
    IPMahasiswa ipmhs = new IPMahasiswa();
    
    Scanner Input = new Scanner (System.in);
    float ip;
    int jmlMhs = 0, jmlMhsLls = 0;
    System.out.print(Masukan IP : ");
    ip = input.nextFloat();
    while (ip != -999) {
    	if (ipmhs.IsWithinRange(ip, 0, 4) == 1) {
    		jmlMhs++;
    	}
    	if (ip >= 2,75) {
    		jmlMhsLls++;
    	}
    	System.out.print("Masukan IP : ");
    	ip = input.nextFloat();
    }
    System.out.Println("Jumlah Mahasiswa adalah : " +jmlMhs);
    System.out.println("Jumlah Mahasiswa Lulus adalah : " +jmlMhsLls);
    
    IsWithinRange(float X, int min, int max){
    	if (X>= min && X <= max) {
    		return 1;
    	} else {
    		return 0;
    	}
    }
    }
    
}
