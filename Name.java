public class Name {
    public static void main(String[] args) {
        String name = "Иванов Иван";
        String name2 = "Иванов Сергей Петрович";
        checkName(name,name2);
    }
    public static void checkName(String name,String name2){
       if(name.equalsIgnoreCase(name2)){
           System.out.println("Выберите другое имя");
       }else {
           System.out.println("Отличное имя");
           System.out.println("Ваше имя имеет длину " + name2.length() +  " символов");
           System.out.println("А без пробелов ваше имя занимает " +
                   name2.replaceAll(" ","").length() + " символов");
       }
    }
}
