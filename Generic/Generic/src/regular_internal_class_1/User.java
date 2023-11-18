package regular_internal_class_1;

public class User {
    private String login,password;
    User(String login, String password){
        this.login = login;
        this.password = password;
    }
    class Query{
        Query(){}
        Query(String l, String p){
            login = l;
            password = p;
        }
        public void printToLog(){
            System.out.println("Пользователь с логином: "+login+" и паролем: "+password+" отправил запрос");
        }
    }
    public void createQuery(){
        Query query = new Query();
        query.printToLog();
    }

    public static void main(String[] args) {
        User user = new User("John","johnferi34");
        user.createQuery();

        User.Query query = user.new Query("Melisa","sunny5Time");
        query.printToLog();

        User.Query query1 = new User("Kevin","user29").new Query();
        query1.printToLog();
    }
}
