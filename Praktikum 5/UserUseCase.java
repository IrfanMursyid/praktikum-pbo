package Tugas;

public class UserUseCase extends UserRepository {
    public void loginUser(String username, String password){
        if(username == "Pandowo" && password =="PBO"){
            System.out.print("SELAMAT DATANG PANDOWO !!");
        } else {
            System.out.print("USERNAME ATAU PASSWORD SALAH !!");
        }
    }

    public void logoutUser(){
        System.out.print("TERIMAKASIH");
    }
}
//Muhammad Irfan Mursyid
//24060122130046
