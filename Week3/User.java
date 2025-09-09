public class User {
    String nama;
    String email;
    
    User(String nama , String email){
        this.nama = nama;
        this.email = email;
    }

    public static void main(String[] args) {
        User user1 = new User("Rizky", "rizky@example.com");
        System.out.println("Nama: " + user1.nama);
        System.out.println("Email: " + user1.email);
    }
}

