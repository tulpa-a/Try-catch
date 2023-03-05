public class main {
    public static void main(String[] args) {
        authorization("aassddffggjrutieowl","123","123");
    }


    public static boolean authorization(String login, String password, String confimpassword){
        try{
            String w = "";
            String w1 = "";
            String symbols = "1234567890QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm_";
            if(login.length()>20){
                throw new WrongLoginException("слишком многа буков у логина");
            }
            if(password.length()>20){
                throw new WrongPasswordException("слишком многа буков у пасворда");
            }
            if(password != confimpassword){
                throw new WrongPasswordException("не совпадают пароли");
            }
            for(char s : password.toCharArray()){
                for(char s1 : symbols.toCharArray()){
                    if(s==s1){
                        w = w+s;
                    }
                }
            }
            for(char s : login.toCharArray()){
                for(char s1 : symbols.toCharArray()){
                    if(s==s1){
                        w1 = w1+s;
                    }
                }
            }
            if(!login.equals(w1)){
                throw new WrongLoginException("не те символы в логине");
            }
            else if (!password.equals(w)) {
                throw new WrongPasswordException("не те символы в пасворде");
            }


        }
        catch (WrongLoginException e)
        {
            System.out.println(e);
            return false;
        }
        catch (WrongPasswordException e)
        {
            System.out.println(e);
            return false;
        }
        System.out.println("все верно");
        return true;

    }


}

