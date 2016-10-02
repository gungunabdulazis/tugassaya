public class ArrayDemo1{

   public static void main(String[] args){

      // deklarasi array mahasiswa bertipe String

      String[] mahasiswa;

      // membuat array mahasiswa dengan panjang 5

      mahasiswa = new String[5];
      mahasiswa[0] = "Dono"; // isi element array 0
      mahasiswa[1] = "Danu"; // isi element array 1
      mahasiswa[2] = "Dana"; // isi element array 2
      mahasiswa[3] = "Dini"; // isi element array 3
      mahasiswa[4] = "Doni"; // isi element array 4

      // cetak array
      System.out.println("========= Array of mahasiswa ==========");

      for(int i = 0; i < mahasiswa.length; i++){
         System.out.println("Elemen "+i + " " +mahasiswa[i]);

      }

   }