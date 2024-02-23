package jdbcgui;

public class LoginUser {
    int userid;
    String username;
    String Name; 
    int type;
    
    LoginUser(int id, String uuser, String uname, int utype) {
        userid = id;
        username = uuser;
        Name = uname;
        type = utype;
    }
    
}
