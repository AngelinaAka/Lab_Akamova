package local_internal_class_2;

public class User {
    final private String login,password;
    User(String login, String password){
        this.login = login;
        this.password = password;
    }
    public void createQuery(){
        class Query{
            public void printToLog(){
                System.out.println("Пользователь с логином: "+login+" и паролем: "+password+" отправил запрос");
            }
        }
        Query query = new Query();
        query.printToLog();
    }

    public static void main(String[] args) {
        User user = new User("John","johnferi34");
        user.createQuery();
    }
}
